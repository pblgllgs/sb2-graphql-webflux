package com.pblgllgs.sb4graphqlplay.sec01.lec02.controller;
/*
 *
 * @author pblgl
 * Created on 18-04-2024
 *
 */

import com.pblgllgs.sb4graphqlplay.sec01.lec02.dto.AgeRangeFilter;
import com.pblgllgs.sb4graphqlplay.sec01.lec02.dto.Customer;
import com.pblgllgs.sb4graphqlplay.sec01.lec02.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Controller
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @QueryMapping
    public Flux<Customer> customers() {
        return customerService.getCustomers();
    }

    @QueryMapping
    public Mono<Customer> customerById(@Argument Integer id) {
        return customerService.getCustomer(id);
    }

    @QueryMapping
    public Flux<Customer> customersNameContains(@Argument String name) {
        return customerService.searchCustomer(name);
    }

    @QueryMapping
    public Flux<Customer> customersByAgeRange(@Argument AgeRangeFilter ageRangeFilter) {
        return customerService.customersByAgeRange(ageRangeFilter);
    }

}

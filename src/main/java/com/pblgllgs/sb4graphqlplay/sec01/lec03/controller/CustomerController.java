package com.pblgllgs.sb4graphqlplay.sec01.lec03.controller;
/*
 *
 * @author pblgl
 * Created on 18-04-2024
 *
 */

import com.pblgllgs.sb4graphqlplay.sec01.lec03.dto.Customer;
import com.pblgllgs.sb4graphqlplay.sec01.lec03.dto.CustomerOrderDto;
import com.pblgllgs.sb4graphqlplay.sec01.lec03.service.CustomerService;
import com.pblgllgs.sb4graphqlplay.sec01.lec03.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Flux;

@Controller
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;
    private final OrderService orderService;

    @SchemaMapping(
            typeName = "Query"
    )
    public Flux<Customer> customers() {
        return customerService.getCustomers();
    }

    @SchemaMapping(
            typeName = "Customer"
    )
    public Flux<CustomerOrderDto> orders(Customer customer) {
        return orderService.ordersByCustomerName(customer.getName());
    }

}

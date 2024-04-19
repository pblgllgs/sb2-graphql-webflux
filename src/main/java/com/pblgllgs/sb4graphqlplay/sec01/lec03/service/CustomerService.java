package com.pblgllgs.sb4graphqlplay.sec01.lec03.service;
/*
 *
 * @author pblgl
 * Created on 18-04-2024
 *
 */

import com.pblgllgs.sb4graphqlplay.sec01.lec03.dto.Customer;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class CustomerService {

    private final Flux<Customer> flux = Flux.just(
            Customer.create(1, "sam", 20, "atlanta"),
            Customer.create(2, "samuel", 15, "los angeles"),
            Customer.create(3, "tom", 40, "san francisco"),
            Customer.create(4, "july", 33, "las vegas")
    );

    public Flux<Customer> getCustomers() {
        return flux;
    }
}

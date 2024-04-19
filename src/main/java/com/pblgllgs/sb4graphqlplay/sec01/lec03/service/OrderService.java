package com.pblgllgs.sb4graphqlplay.sec01.lec03.service;
/*
 *
 * @author pblgl
 * Created on 18-04-2024
 *
 */

import com.pblgllgs.sb4graphqlplay.sec01.lec03.dto.CustomerOrderDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final Map<String, List<CustomerOrderDto>> map = Map.of(
            "sam", List.of(
                    CustomerOrderDto.create(UUID.randomUUID(), "sam-product-1"),
                    CustomerOrderDto.create(UUID.randomUUID(), "sam-product-2"),
                    CustomerOrderDto.create(UUID.randomUUID(), "sam-product-3")
            ),
            "samuel", List.of(
                    CustomerOrderDto.create(UUID.randomUUID(), "samuel-product-1"),
                    CustomerOrderDto.create(UUID.randomUUID(), "samuel-product-2"),
                    CustomerOrderDto.create(UUID.randomUUID(), "samuel-product-3")
            ),
            "tom", List.of(
                    CustomerOrderDto.create(UUID.randomUUID(), "tom-product-1"),
                    CustomerOrderDto.create(UUID.randomUUID(), "tom-product-2"),
                    CustomerOrderDto.create(UUID.randomUUID(), "tom-product-3")
            ),
            "july", List.of(
                    CustomerOrderDto.create(UUID.randomUUID(), "july-product-1"),
                    CustomerOrderDto.create(UUID.randomUUID(), "july-product-2"),
                    CustomerOrderDto.create(UUID.randomUUID(), "july-product-3")
            )
    );

    public Flux<CustomerOrderDto> ordersByCustomerName(String name){
        return Flux.fromIterable(map.getOrDefault(name, Collections.emptyList()));
    }
}

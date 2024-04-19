package com.pblgllgs.sb4graphqlplay.sec01.lec01;
/*
 *
 * @author pblgl
 * Created on 18-04-2024
 *
 */

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.concurrent.ThreadLocalRandom;

@Controller
public class GraphqlController {

    @QueryMapping("sayHello")
    public Mono<String> hello() {
        return Mono.just("Hello")
                .delayElement(Duration.ofMillis(800));
    }

    @QueryMapping("sayHelloName")
    public Mono<String> helloName(@Argument("name") String value) {
        return Mono.fromSupplier( () -> "Hello "+ value)
                .delayElement(Duration.ofMillis(1600));
    }

    @QueryMapping("random")
    public Mono<Integer> random() {
        return Mono.fromSupplier( () -> ThreadLocalRandom.current().nextInt(1,100))
                .delayElement(Duration.ofMillis(2400));
    }

}

package com.pblgllgs.sb4graphqlplay.sec01.lec02.dto;
/*
 *
 * @author pblgl
 * Created on 18-04-2024
 *
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "create")
@NoArgsConstructor
public class Customer {

    private Integer id;
    private String name;
    private Integer age;
    private String city;
}

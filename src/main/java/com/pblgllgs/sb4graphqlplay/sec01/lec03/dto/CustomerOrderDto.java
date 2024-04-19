package com.pblgllgs.sb4graphqlplay.sec01.lec03.dto;
/*
 *
 * @author pblgl
 * Created on 18-04-2024
 *
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor(staticName = "create")
@NoArgsConstructor
public class CustomerOrderDto {
    private UUID id;
    private String description;
}

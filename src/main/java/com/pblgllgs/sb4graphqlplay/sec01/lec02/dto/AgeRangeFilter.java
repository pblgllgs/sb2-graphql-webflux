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
@AllArgsConstructor
@NoArgsConstructor
public class AgeRangeFilter {
    private Integer minAge;
    private Integer maxAge;
}

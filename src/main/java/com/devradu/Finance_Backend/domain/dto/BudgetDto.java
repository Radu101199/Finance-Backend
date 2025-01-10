package com.devradu.Finance_Backend.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BudgetDto {
    private Long id;

    private String name;

    private Date startDate;

    private Date endDate;

    private UserDto userDto;
}

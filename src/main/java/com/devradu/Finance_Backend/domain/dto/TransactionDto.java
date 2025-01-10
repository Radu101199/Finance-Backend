package com.devradu.Finance_Backend.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionDto {
    private Long id;

    private Double amount;

    private Date created_at;

    private Date updated_at;

    private UserDto userDto;

    private CategoryDto categoryDto;
}

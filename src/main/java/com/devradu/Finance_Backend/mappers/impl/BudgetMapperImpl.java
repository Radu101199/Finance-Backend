package com.devradu.Finance_Backend.mappers.impl;

import com.devradu.Finance_Backend.domain.dto.BudgetDto;
import com.devradu.Finance_Backend.domain.entities.BudgetEntity;
import com.devradu.Finance_Backend.mappers.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class BudgetMapperImpl implements Mapper<BudgetEntity, BudgetDto> {

    private ModelMapper modelMapper;

    public BudgetMapperImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public BudgetDto mapTo(BudgetEntity budgetEntity) {
        return modelMapper.map(budgetEntity, BudgetDto.class);
    }

    @Override
    public BudgetEntity mapFrom(BudgetDto budgetDto) {
        return modelMapper.map(budgetDto, BudgetEntity.class);
    }
}

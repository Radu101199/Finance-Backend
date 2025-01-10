package com.devradu.Finance_Backend.mappers.impl;

import com.devradu.Finance_Backend.domain.dto.TransactionDto;
import com.devradu.Finance_Backend.domain.entities.TransactionEntity;
import com.devradu.Finance_Backend.mappers.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class TransactionMapperImpl implements Mapper<TransactionEntity, TransactionDto> {
    private ModelMapper modelMapper;

    public TransactionMapperImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public TransactionDto mapTo(TransactionEntity transactionEntity) {
        return modelMapper.map(transactionEntity, TransactionDto.class);
    }

    @Override
    public TransactionEntity mapFrom(TransactionDto transactionDto) {
        return modelMapper.map(transactionDto, TransactionEntity.class);
    }
}

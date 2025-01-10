package com.devradu.Finance_Backend.mappers.impl;

import com.devradu.Finance_Backend.domain.dto.CategoryDto;
import com.devradu.Finance_Backend.domain.entities.CategoryEntity;
import com.devradu.Finance_Backend.mappers.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CategoryMapperImpl implements Mapper<CategoryEntity, CategoryDto> {
    private ModelMapper modelMapper;

    public CategoryMapperImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public CategoryDto mapTo(CategoryEntity categoryEntity) {
        return modelMapper.map(categoryEntity, CategoryDto.class);
    }

    @Override
    public CategoryEntity mapFrom(CategoryDto categoryDto) {
        return modelMapper.map(categoryDto, CategoryEntity.class);
    }
}

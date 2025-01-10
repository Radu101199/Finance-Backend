package com.devradu.Finance_Backend.repository;

import com.devradu.Finance_Backend.domain.entities.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
}

package com.devradu.Finance_Backend.repository;

import com.devradu.Finance_Backend.domain.entities.BudgetEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetRepository extends JpaRepository<BudgetEntity, Long> {
}

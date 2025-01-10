package com.devradu.Finance_Backend.repository;

import com.devradu.Finance_Backend.domain.entities.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<TransactionEntity, Long> {
}

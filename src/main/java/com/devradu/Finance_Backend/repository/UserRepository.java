package com.devradu.Finance_Backend.repository;
import com.devradu.Finance_Backend.domain.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

import org.springframework.data.repository.query.Param;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {
    @Query("SELECT a FROM UserEntity a WHERE a.email = :email AND a.password = :password")
    Optional<UserEntity> findByEmailAndPassword(
            @Param("email") String email,
            @Param("password") String password
    );

    Object findByEmail(String email);
}

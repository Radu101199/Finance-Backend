package com.devradu.Finance_Backend.service;

import com.devradu.Finance_Backend.domain.entities.UserEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IUserService {
    UserEntity save(UserEntity newUser);

    Optional<UserEntity> findByEmailAndPassword(String email, String password);

    List<UserEntity> findAll();
}

package com.devradu.Finance_Backend.service.impl;

import com.devradu.Finance_Backend.domain.entities.UserEntity;
import com.devradu.Finance_Backend.repository.UserRepository;
import com.devradu.Finance_Backend.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class UserService implements IUserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserEntity save(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    @Override
    public Optional<UserEntity> findByEmailAndPassword(String email, String password) {
        System.out.println("Service Layer - Email: " + email);
        System.out.println("Service Layer - Password: " + password);
        Optional<UserEntity> result = userRepository.findByEmailAndPassword(email, password);
        System.out.println("Service Layer - Result: " + result);
        return result;
    }

    @Override
    public List<UserEntity> findAll() {
        return StreamSupport.stream(userRepository
                                .findAll()
                                .spliterator()
                                , false)
                .collect(Collectors.toList());
    }

}

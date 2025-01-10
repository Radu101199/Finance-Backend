package com.devradu.Finance_Backend.controllers;
import com.devradu.Finance_Backend.domain.dto.UserDto;
import com.devradu.Finance_Backend.domain.entities.UserEntity;
import com.devradu.Finance_Backend.mappers.Mapper;
import com.devradu.Finance_Backend.service.IUserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "http://localhost:5174")
public class UserController {
    final private IUserService userService;
    final private Mapper<UserEntity, UserDto> userMapper;

    UserController(IUserService userService,Mapper<UserEntity, UserDto> userMapper) {
        this.userMapper = userMapper;
        this.userService = userService;
    }


    @PostMapping(path = "/user")
    public ResponseEntity<UserDto> saveUser(@RequestBody UserDto user) {
        UserEntity newUser = userMapper.mapFrom(user);
        UserEntity savedUserEntity = userService.save(newUser);
        return new ResponseEntity<>(userMapper.mapTo(savedUserEntity), HttpStatus.CREATED);
    }

    @GetMapping("/users")
    public List<UserDto> listUsers(){
        List<UserEntity> users = userService.findAll();
        System.out.println(users);
        return users.stream().map(userMapper::mapTo)
                .collect(Collectors.toList());
    }


    @GetMapping(path="/login")
    public ResponseEntity<Optional<UserEntity>> loginUser(
            @RequestParam String email,
            @RequestParam String password
    ) {
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        Optional<UserEntity> isUser = userService.findByEmailAndPassword(email, password);
        System.out.println("Result: " + isUser);  // Debug print
        return new ResponseEntity<>(isUser, HttpStatus.OK);
    }

}

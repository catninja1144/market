package com.example.market.Service;

import com.example.market.DTO.UserDTO;
import com.example.market.Entity.UserEntity;
import com.example.market.Repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@Getter
@Setter
@RequiredArgsConstructor
@Transactional
public class UserService {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    public void registerUser(UserDTO userDTO) {
        UserEntity user = UserEntity.builder()
                .userId(userDTO.getUserId())
                .password(passwordEncoder.encode(userDTO.getPassword()))
                .email(userDTO.getEmail())
                .tel(userDTO.getTel())
                .build();
        userRepository.save(user);
    }


}

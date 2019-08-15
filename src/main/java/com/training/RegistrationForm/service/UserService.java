package com.training.RegistrationForm.service;

import com.training.RegistrationForm.dto.UserDTO;
import com.training.RegistrationForm.dto.UsersDTO;
import com.training.RegistrationForm.entity.User;
import com.training.RegistrationForm.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UsersDTO getAllUsers() {
        //TODO checking for an empty user list
        return new UsersDTO(userRepository.findAll());
    }

    public User findByUserLogin (UserDTO userDTO){
        //TODO check for user availability. password check
        return userRepository.findByEmail(userDTO.getEmail());
    }

    public void saveNewUser (User user){
        //TODO inform the user about the replay email
        try {
            userRepository.save(user);
        } catch (Exception ex){
            log.info("{Почтовый адрес уже существует}");
        }

    }
}

package ch.minder.springhfict.controller;

import ch.minder.springhfict.model.User;
import ch.minder.springhfict.model.UserDto;
import ch.minder.springhfict.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@EnableJpaAuditing
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/users")
    public User createUser(@RequestBody UserDto userDto) {
        String username = userDto.getUsername();
        String password = userDto.getPassword();

        User user = new User(username, password);
        userRepository.save(user);

        return user;
    }

}

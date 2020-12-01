package ch.minder.springhfict.controller;

import ch.minder.springhfict.model.User;
import ch.minder.springhfict.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.logging.Logger;


@RestController
public class UserController {

    public static Logger logger;
    @Autowired
    UserRepository userRepository;

    @PostMapping("/login")
    public User login(@RequestBody User user, HttpServletResponse response) {
        String password = user.getPassword();
        user = userRepository.findByUsername(user.getUsername());
        if (user == null || !password.equals(user.getPassword())) {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            return null;
        }
        return user;
    }

    @PostMapping("/users")
    public User user(@RequestBody User user, HttpServletResponse response) {
        if (user.getUsername().equals("test") && user.getPassword().equals("1234")) {
            return userRepository.save(user);
        } else {
            response.setStatus(HttpServletResponse.SC_NOT_ACCEPTABLE);
        }
        return user;

    }
}

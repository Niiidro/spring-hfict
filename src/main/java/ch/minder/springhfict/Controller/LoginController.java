package ch.minder.springhfict.Controller;

import ch.minder.springhfict.model.Login;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class LoginController {

    @PostMapping("/login")
    public Login login(@RequestBody Login login) {
        return login;
    }
}

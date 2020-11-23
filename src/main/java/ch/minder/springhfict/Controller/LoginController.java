package ch.minder.springhfict.Controller;

import ch.minder.springhfict.model.Login;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;


@RestController
public class LoginController {

    @PostMapping("/login")
    public Login login(@RequestBody Login login, HttpServletResponse response) {
        if (login.getUsername().equals("test") && login.getPassword().equals("1234")) {
            response.setStatus(HttpServletResponse.SC_NO_CONTENT);
        } else {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        }
        return login;

    }
}

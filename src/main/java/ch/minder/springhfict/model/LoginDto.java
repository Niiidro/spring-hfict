package ch.minder.springhfict.model;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LoginDto {

    String username;
    String password;

}
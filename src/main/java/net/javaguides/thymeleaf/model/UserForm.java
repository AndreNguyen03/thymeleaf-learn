package net.javaguides.thymeleaf.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserForm {
    private String name;
    private String email;
    private String password;
    private String gender;
    private String address;
    private boolean married;
    private String profession;
}

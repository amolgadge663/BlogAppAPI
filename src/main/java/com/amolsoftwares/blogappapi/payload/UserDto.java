package com.amolsoftwares.blogappapi.payload;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {

    private int id;
    @NotEmpty
    @Size(min = 4, message = "User Name must be min of 4 characters!!!")
    private String name;
    @Email(message = "Email address is not valid!!!")
    private String email;
    @NotEmpty
    @Size(min = 3, max = 10, message = "Password should be min 3 and max 10 characters!!!")
    private String password;
    @NotEmpty
    private String about;

}

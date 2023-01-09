package com.proiect.management.dtos;

import com.proiect.management.utils.enums.Role;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountDto {
    private int id;
    private String username;
    private String password ;
    private String email;
    private String phone_number;
    private Role role;
}

package com.example.treekin.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.NotBlank;

public class UserCreateRequest {

    @NotNull
    public Integer userId;

    @NotBlank
    public String userName;

    @NotBlank
    public String userUserName;

    @NotBlank
    public String userEmail;

    @NotBlank
    public String userPassword;
}

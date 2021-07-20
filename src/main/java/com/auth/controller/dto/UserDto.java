package com.auth.controller.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {

    private String userName;

    private String password;

    private String email;

    private String mobile;

	public String getPassword() {
		return password;
	}

	public String getUserName() {
		// TODO Auto-generated method stub
		return userName;
	}

	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}
    
}

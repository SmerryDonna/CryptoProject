package com.auth.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Optional;

@Getter
@Setter
@Entity
@Table(name = "auth_user")
public class AuthUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String userName;

    private String password;

    private String email;

    private String mobile;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_role", joinColumns
            = @JoinColumn(name = "user_id",
            referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "role_id",
                    referencedColumnName = "id"))
    private List<AuthRole> roles;

	public List<AuthRole> getRoles() {
		return roles;
	}

	public void setRoles(List<AuthRole> roles) {
		this.roles = roles;
	}

	public String getUserName() {
		// TODO Auto-generated method stub
		return userName;
	}

	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	public void setPassword(String encode) {
		// TODO Auto-generated method stub
		this.password = encode; 
	}


}

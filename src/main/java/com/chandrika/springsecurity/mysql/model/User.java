package com.chandrika.springsecurity.mysql.model;

import lombok.Data;
import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class User {
	@Id
	@GeneratedValue
	private int user_id;
	private String username;
	private String password;
	private String email;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles;

}

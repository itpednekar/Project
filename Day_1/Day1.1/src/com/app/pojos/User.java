package com.app.pojos;

import javax.persistence.*;

@Entity
@Table(name = "User_Tb")
public class User 
{
	private Integer userId;
	private String name;
	private String email;
	private String password;
	private String confirmPassword;
	private UserRole role;
	private String mobNo;
	
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String name, String email, String password, String confirmPassword, UserRole role, String mobNo) 
	{
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.role = role;
		this.mobNo = mobNo;	
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(length = 30, name = "u_name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(length = 30, name = "u_email", unique = true)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
    
	@Column(length = 30, name = "u_password", nullable = false)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
    @Transient
	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	@Enumerated(EnumType.STRING)
	@Column(length = 30, name = "u_role")
	public UserRole getRole() {
		return role;
	}

	public void setRole(UserRole role) {
		this.role = role;
	}

	@Column(length = 30, name = "u_mobNo")
	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", confirmPassword=" + confirmPassword + ", role=" + role + ", mobNo=" + mobNo + "]";
	}
	
}

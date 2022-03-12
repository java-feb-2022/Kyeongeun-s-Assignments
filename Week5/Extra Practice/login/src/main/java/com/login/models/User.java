package com.login.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotEmpty(message = "Firstname is missing")
	@Size(min=3, max=30, message = "Lastname must be between 3 and 30 characters")
	private String firstName;
	@NotEmpty(message = "Lastname is missing")
	@Size(min=3, max=30, message = "Lastname must be between 3 and 30 characters")
	private String lastName;
	@NotEmpty(message = "Emain is required")
	@Email(message = "Please enter valid email!!")
	private String email;
	@NotEmpty(message = "password is required")
	@Size(min=8, max=128, message = "Password must be between 8 and 128 characters")
	private String password;
	@Transient
	@NotEmpty(message = "confirm password is required")
	private String confirm;
	
    @Column(updatable=false, name="created_at")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date createdAt;
    @Column(name="updated_at")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date updatedAt;	
    
	@PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirm() {
		return confirm;
	}
	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}
	
	
	
}

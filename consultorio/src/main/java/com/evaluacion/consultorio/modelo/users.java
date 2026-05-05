package com.evaluacion.consultorio.modelo;

import java.util.Collection;

import com.example.logins.modelo.rols;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "users",uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long user_id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "last_name")
	private String last_name;
	
	private String email;
	private String password;
	
	@ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinTable(   
			
			name = "Usuarios_Roles",
			joinColumns = @JoinColumn(name = "user_id",referencedColumnName = "user_id"),
			inverseJoinColumns = @JoinColumn(name = "rol_id",referencedColumnName = "rol_id")
			)
	
	
	private Collection<Roles> role_id;

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
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

	public Collection<Roles> getRoles() {
		return roles;
	}

	public void setRoles(Collection<Roles> roles) {
		this.roles = roles;
	}

	public users(Long user_id, String name, String last_name, String email, String password, Collection<Roles> roles) {
		super();
		this.user_id = user_id;
		this.name = name;
		this.last_name = last_name;
		this.email = email;
		this.password = password;
		this.roles = roles;
	}

	public users(String name, String last_name, String email, String password, Collection<Roles> roles) {
		super();
		this.name = name;
		this.last_name = last_name;
		this.email = email;
		this.password = password;
		this.roles = roles;
	}

	public users() {
		super();
	}
	
	
	
	
}

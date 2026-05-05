package com.evaluacion.consultorio.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "roles")
public class Roles {

    private Long rol_id;
	
	private String nombre;

	public Long getRol_id() {
		return rol_id;
	}

	public void setRol_id(Long rol_id) {
		this.rol_id = rol_id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}

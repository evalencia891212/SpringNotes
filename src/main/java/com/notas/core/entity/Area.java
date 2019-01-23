package com.notas.core.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="cat_area")
@Entity
public class Area  {
	
	
	public Area(long areaId, String name, long departamentId, String regDate, long regUser, boolean active) {
		super();
		this.areaId = areaId;
		this.name = name;
		this.departamentId = departamentId;
		this.regDate = regDate;
		this.regUser = regUser;
		this.active = active;
	}

	public Area() {
		
	}
	
	@GeneratedValue
	@Id
	@Column(name="id_area")
	private long areaId;
	
	@Column(name="nombre")
	private String name;
	
	@Column(name="id_departamento")
	private long departamentId;
	
	@Column(name="fecha_registro")
	private String regDate;
	
	@Column(name="usuario_registro")
	private long regUser;
	
	@Column(name="activo")
	private boolean active;

	public long getAreaId() {
		return areaId;
	}

	public void setAreaId(long areaId) {
		this.areaId = areaId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getDepartamentId() {
		return departamentId;
	}

	public void setDepartamentId(long departamentId) {
		this.departamentId = departamentId;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public long getRegUser() {
		return regUser;
	}

	public void setRegUser(long regUser) {
		this.regUser = regUser;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
		
}

package com.notas.core.model;

import com.notas.core.entity.Area;

public class MArea {
	
	public MArea(long areaId, String name, long departamentId, String regDate, long regUser, boolean active) {
		super();
		this.areaId = areaId;
		this.name = name;
		this.departamentId = departamentId;
		this.regDate = regDate;
		this.regUser = regUser;
		this.active = active;
	}
	
	public MArea() {
	
	}
	
	public MArea(Area area) {
		this.areaId = area.getAreaId();
		this.name = area.getName();
		this.departamentId = area.getDepartamentId();
		this.regDate = area.getRegDate();
		this.regUser = area.getRegUser();
		this.active = area.isActive();
	}

	private long areaId;
	
	private String name;
	
	private long departamentId;
	
	private String regDate;
	
	private long regUser;
	
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

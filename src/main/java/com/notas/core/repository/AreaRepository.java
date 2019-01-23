package com.notas.core.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.notas.core.entity.Area;


@Repository("areaRepository")
public interface AreaRepository extends JpaRepository <Area,Serializable> {
	
	public abstract List<Area> findByName(String name);
	
}

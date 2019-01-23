package com.notas.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.notas.core.converter.AreaConverter;
import com.notas.core.model.MArea;
import com.notas.core.repository.AreaRepository;

@Service("areaService")
public class AreaService {
	
	@Autowired
	@Qualifier("areaRepository")
	private AreaRepository repositorio;
	
	@Autowired
	@Qualifier("areaConverter")
	private AreaConverter convertidor;
	
	  
	public List<MArea> obtener(){
		 return convertidor.ConvertirLista(repositorio.findAll());
	}
	
	public List<MArea> findByName(String name) {
		return convertidor.ConvertirLista(repositorio.findByName(name));
	}

}

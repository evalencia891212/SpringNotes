package com.notas.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.notas.core.model.MArea;
import com.notas.core.service.AreaService;

@RestController
@RequestMapping("/v1")
public class AreasController {

	@Autowired
	@Qualifier("areaService")
	AreaService service;
	
	
	
	/*@GetMapping("/area")
	public List<MArea> getArea()
	{
		return service.obtener();
	}*/
	
	@GetMapping("/area/{name}")
	public List<MArea> getArea(@PathVariable String name)
	{
		return service.findByName(name);
	}
}

package com.notas.core.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.notas.core.entity.Nota;
import com.notas.core.model.MNota;
import com.notas.core.service.NotaService;

@RestController
@RequestMapping("/v1")
public class NotasController {
	
	@Autowired
	@Qualifier("Service")
	NotaService service;
	
	@PutMapping("/nota")
	public boolean agregarNota(@RequestBody @Valid Nota nota){
		return service.crear(nota);
	}
	
	@GetMapping("/nota")
	public List<MNota> obtenerNotas()
	{
		return service.obtener();
	}
	
	
	
}

package com.notas.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Nota")
@Entity
public class Nota {

	@GeneratedValue
	@Id
	@Column(name="ID_Nota")
	private long id;
	
	private String name;
	
	private String titulo;
	
	private String contenido;
}

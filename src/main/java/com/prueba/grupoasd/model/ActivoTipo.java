package com.prueba.grupoasd.model;

public class ActivoTipo {

	private int id;

	private String nombre;

	public ActivoTipo() {
		// TODO Auto-generated constructor stub
	}

	public ActivoTipo(int id, String nombre) {

		this.id = id;
		this.nombre = nombre;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}

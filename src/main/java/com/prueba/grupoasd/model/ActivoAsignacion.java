package com.prueba.grupoasd.model;

public class ActivoAsignacion {

	private int id;

	private Activo activo;

	private Persona persona;

	private Area area;

	private boolean estado;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Activo getActivo() {
		return activo;
	}

	public void setActivo(Activo activo) {
		this.activo = activo;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

}

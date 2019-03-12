package com.prueba.grupoasd.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Activo {

	private long id;

	private String nombre;

	private String descripcion;

	private ActivoTipo tipo;

	private String serial;

	private int numeroInterno;

	private float peso;

	private float alto;

	private float ancho;

	private float largo;

	private BigDecimal valorCompra;

	private Timestamp fechaCompra;

	private Timestamp fechaDeBaja;

	private String color;

	private ActivoEstado estado;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public ActivoTipo getTipo() {
		return tipo;
	}

	public void setTipo(ActivoTipo tipo) {
		this.tipo = tipo;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public int getNumeroInterno() {
		return numeroInterno;
	}

	public void setNumeroInterno(int numeroInterno) {
		this.numeroInterno = numeroInterno;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAlto() {
		return alto;
	}

	public void setAlto(float alto) {
		this.alto = alto;
	}

	public float getAncho() {
		return ancho;
	}

	public void setAncho(float ancho) {
		this.ancho = ancho;
	}

	public float getLargo() {
		return largo;
	}

	public void setLargo(float largo) {
		this.largo = largo;
	}

	public BigDecimal getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(BigDecimal valorCompra) {
		this.valorCompra = valorCompra;
	}

	public Timestamp getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(Timestamp fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public Timestamp getFechaDeBaja() {
		return fechaDeBaja;
	}

	public void setFechaDeBaja(Timestamp fechaDeBaja) {
		this.fechaDeBaja = fechaDeBaja;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public ActivoEstado getEstado() {
		return estado;
	}

	public void setEstado(ActivoEstado estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Activo [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", tipo=" + tipo
				+ ", serial=" + serial + ", numeroInterno=" + numeroInterno + ", peso=" + peso + ", alto=" + alto
				+ ", ancho=" + ancho + ", largo=" + largo + ", valorCompra=" + valorCompra + ", fechaCompra="
				+ fechaCompra + ", fechaDeBaja=" + fechaDeBaja + ", color=" + color + ", estado=" + estado + "]";
	}

}

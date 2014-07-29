package com.google.buscador.venta.bean;

public class PacienteBean {
	
	private String cod_paci;
	private String cod_cli;
	private String nombre;
	private String raza;
	private String color;
	private String peso;
	private String caracteristicas;
	
	
	public String getCod_paci() {
		return cod_paci;
	}
	public void setCod_paci(String cod_paci) {
		this.cod_paci = cod_paci;
	}
	public String getCod_cli() {
		return cod_cli;
	}
	public void setCod_cli(String cod_cli) {
		this.cod_cli = cod_cli;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getPeso() {
		return peso;
	}
	public void setPeso(String peso) {
		this.peso = peso;
	}
	public String getCaracteristicas() {
		return caracteristicas;
	}
	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
}

package com.google.buscador.venta.bean;

public class ClienteBean {
	
	private String cod_cli;
	private String dni;
	private String nombres;
	private String apellido_pate;
	private String apellido_mate;
	private String direccion;
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getCod_cli() {
		return cod_cli;
	}
	public void setCod_cli(String cod_cli) {
		this.cod_cli = cod_cli;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getApellido_pate() {
		return apellido_pate;
	}
	public void setApellido_pate(String apellido_pate) {
		this.apellido_pate = apellido_pate;
	}
	public String getApellido_mate() {
		return apellido_mate;
	}
	public void setApellido_mate(String apellido_mate) {
		this.apellido_mate = apellido_mate;
	}
	
}

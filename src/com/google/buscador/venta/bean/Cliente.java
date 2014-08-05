package com.google.buscador.venta.bean;

public class Cliente extends UsuarioBean {
	
	private String telefono;
	private String nombreOtroDuenio;
	private String distrito;
	private String celular;
	private String email;
	private String numeroAlternativo;
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getNombreOtroDuenio() {
		return nombreOtroDuenio;
	}
	public void setNombreOtroDuenio(String nombreOtroDuenio) {
		this.nombreOtroDuenio = nombreOtroDuenio;
	}
	public String getDistrito() {
		return distrito;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumeroAlternativo() {
		return numeroAlternativo;
	}
	public void setNumeroAlternativo(String numeroAlternativo) {
		this.numeroAlternativo = numeroAlternativo;
	}
}

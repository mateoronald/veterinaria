package com.google.buscador.venta.bean;

public class UsuarioBean {

	private int intCodigo;
	private String strLogin;
	private String strPassword;
	private String strNombre;
	private String strApePaterno;
	private String strApeMaterno;
	private String strDNI;
	private int intEdad;
	private String strFeNacimiento;
	private int intPerfil;
	private boolean estado;
	
	public UsuarioBean() {}
	
	public UsuarioBean(int intCodigo, String strLogin, String strPassword,
			String strNombre, String strApePaterno, String strApeMaterno,
			String strDNI, int intEdad, String strFeNacimiento, int intPerfil) {
		super();
		this.intCodigo = intCodigo;
		this.strLogin = strLogin;
		this.strPassword = strPassword;
		this.strNombre = strNombre;
		this.strApePaterno = strApePaterno;
		this.strApeMaterno = strApeMaterno;
		this.strDNI = strDNI;
		this.intEdad = intEdad;
		this.strFeNacimiento = strFeNacimiento;
		this.intPerfil = intPerfil;
	}
	
	public int getIntCodigo() {
		return intCodigo;
	}
	public void setIntCodigo(int intCodigo) {
		this.intCodigo = intCodigo;
	}
	public String getStrLogin() {
		return strLogin;
	}
	public void setStrLogin(String strLogin) {
		this.strLogin = strLogin;
	}
	public String getStrPassword() {
		return strPassword;
	}
	public void setStrPassword(String strPassword) {
		this.strPassword = strPassword;
	}
	public String getStrNombre() {
		return strNombre;
	}
	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}
	public String getStrApePaterno() {
		return strApePaterno;
	}
	public void setStrApePaterno(String strApePaterno) {
		this.strApePaterno = strApePaterno;
	}
	public String getStrApeMaterno() {
		return strApeMaterno;
	}
	public void setStrApeMaterno(String strApeMaterno) {
		this.strApeMaterno = strApeMaterno;
	}
	public String getStrDNI() {
		return strDNI;
	}
	public void setStrDNI(String strDNI) {
		this.strDNI = strDNI;
	}
	public int getIntEdad() {
		return intEdad;
	}
	public void setIntEdad(int intEdad) {
		this.intEdad = intEdad;
	}
	public String getStrFeNacimiento() {
		return strFeNacimiento;
	}
	public void setStrFeNacimiento(String strFeNacimiento) {
		this.strFeNacimiento = strFeNacimiento;
	}
	public int getIntPerfil() {
		return intPerfil;
	}
	public void setIntPerfil(int intPerfil) {
		this.intPerfil = intPerfil;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
}

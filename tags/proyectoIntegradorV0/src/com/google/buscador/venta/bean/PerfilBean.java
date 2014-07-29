package com.google.buscador.venta.bean;

public class PerfilBean {
	
	private int intCodigo;
	private String strDescripcion;
	
	public PerfilBean() {}
	
	public PerfilBean(int intCodigo, String strDescripcion) {
		super();
		this.intCodigo = intCodigo;
		this.strDescripcion = strDescripcion;
	}
	
	public int getIntCodigo() {
		return intCodigo;
	}
	public void setIntCodigo(int intCodigo) {
		this.intCodigo = intCodigo;
	}
	public String getStrDescripcion() {
		return strDescripcion;
	}
	public void setStrDescripcion(String strDescripcion) {
		this.strDescripcion = strDescripcion;
	}
	
	
	
}

package com.google.buscador.venta.bean;

public class OpcionBean {
	
	private int intCodigo;
	private String strDescripcion;
	private String strParametor;
	
	public OpcionBean() {}
	
	public OpcionBean(int intCodigo, String strDescripcion, String strParametor) {
		super();
		this.intCodigo = intCodigo;
		this.strDescripcion = strDescripcion;
		this.strParametor = strParametor;
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

	public String getStrParametor() {
		return strParametor;
	}

	public void setStrParametor(String strParametor) {
		this.strParametor = strParametor;
	}
	
	
	
	
}

package com.google.buscador.venta.bean;


public class ProveedorBean{

	private int idProveedor;
	private String strRazonSocial;
	private String strRuc;
	private String strDireccion;
	private String strTelefono;
	private String strEmail;
	private String strDistrito;
	private String strCategoria;
	
	
	@Override
	public String toString() {
		return "ProveedorBean [idProveedor=" + idProveedor + ", strRazonSocial="
				+ strRazonSocial + ", strRuc=" + strRuc + ", strDireccion="
				+ strDireccion + ", strTelefono=" + strTelefono + ", strEmail="
				+ strEmail + ", strDistrito=" + strDistrito + ", strCategoria="
						+ strCategoria + "]";
	}
	
	
	public int getIdProveedor() {
		return idProveedor;
	}
	public void setIdProveedor(int idProveedor) {
		this.idProveedor = idProveedor;
	}
	public String getStrRazonSocial() {
		return strRazonSocial;
	}
	public void setStrRazonSocial(String strRazonSocial) {
		this.strRazonSocial = strRazonSocial;
	}
	public String getStrRuc() {
		return strRuc;
	}
	public void setStrRuc(String strRuc) {
		this.strRuc = strRuc;
	}
	public String getStrDireccion() {
		return strDireccion;
	}
	public void setStrDireccion(String strDireccion) {
		this.strDireccion = strDireccion;
	}
	public String getStrTelefono() {
		return strTelefono;
	}
	public void setStrTelefono(String strTelefono) {
		this.strTelefono = strTelefono;
	}
	public String getStrEmail() {
		return strEmail;
	}
	public void setStrEmail(String strEmail) {
		this.strEmail = strEmail;
	}
	public String getStrDistrito() {
		return strDistrito;
	}
	public void setStrDistrito(String strDistrito) {
		this.strDistrito = strDistrito;
	}
	public String getStrCategoria() {
		return strCategoria;
	}
	public void setStrCategoria(String strCategoria) {
		this.strCategoria = strCategoria;
	}
	

	

}

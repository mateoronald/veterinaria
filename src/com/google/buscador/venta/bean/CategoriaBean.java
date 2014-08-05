package com.google.buscador.venta.bean;

public class CategoriaBean {

	private String idcategoria,des_categoria;

	public CategoriaBean() {
		super();
	}

	public CategoriaBean(String idcategoria, String des_categoria) {
		super();
		this.setIdcategoria(idcategoria);
		this.setDes_categoria(des_categoria);
	}

	public String getIdcategoria() {
		return idcategoria;
	}

	public void setIdcategoria(String idcategoria) {
		this.idcategoria = idcategoria;
	}

	public String getDes_categoria() {
		return des_categoria;
	}

	public void setDes_categoria(String des_categoria) {
		this.des_categoria = des_categoria;
	}

	
	
}

package com.google.buscador.venta.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@ParentPackage(value = "dawi")
public class InventarioAction extends ActionSupport {

	private static String codPro,nomPro;
	private int conteo1,conteo2,reconteo,merma;

	@Action(value = "/AgregarProducto", results = { 
	@Result(location = "t_registrarInventario", name = "success", type = "tiles") })
	public String AgregarProducto() {
		System.out.println(codPro);
		System.out.println(nomPro);
		return SUCCESS;
	}

	public int getConteo1() {
		return conteo1;
	}

	public void setConteo1(int conteo1) {
		this.conteo1 = conteo1;
	}

	public int getConteo2() {
		return conteo2;
	}

	public void setConteo2(int conteo2) {
		this.conteo2 = conteo2;
	}

	public int getReconteo() {
		return reconteo;
	}

	public void setReconteo(int reconteo) {
		this.reconteo = reconteo;
	}

	public int getMerma() {
		return merma;
	}

	public void setMerma(int merma) {
		this.merma = merma;
	}

	public String getCodPro() {
		return codPro;
	}

	@SuppressWarnings("static-access")
	public void setCodPro(String codPro) {
		this.codPro = codPro;
	}

	public String getNomPro() {
		return nomPro;
	}

	@SuppressWarnings("static-access")
	public void setNomPro(String nomPro) {
		this.nomPro = nomPro;
	}
	
	
}

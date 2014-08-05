package com.google.buscador.venta.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.google.buscador.venta.bean.CategoriaBean;
import com.google.buscador.venta.bean.DistritoBean;
import com.google.buscador.venta.service.CategoriaService;
import com.google.buscador.venta.service.CategoriaServiceImpl;
import com.google.buscador.venta.service.DistritoService;
import com.google.buscador.venta.service.DistritoServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

@ParentPackage(value = "dawi")
public class CargaComboBoxAction extends ActionSupport {
 
	private static final long serialVersionUID = 1L;
	
	private List<DistritoBean> lstDistrito = new ArrayList<>();
	private DistritoService service2 = new DistritoServiceImpl();
	
	@Action(value = "/cargaDinamicoDistrito", results = { @Result(name = "success", type="json") })
	public String cargaDinamicoDistrito() {
		System.out.println("Carga combo cargaDinamico");
		try {
			lstDistrito = service2.listarTodos();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
		
	public List<DistritoBean> getLstDistrito() {
		return lstDistrito;
	}
	public void setLstEstadoCivil(List<DistritoBean> lstDistrito) {
		this.lstDistrito = lstDistrito;
	}
	
	
	private List<CategoriaBean> lstCategoria = new ArrayList<>();
	private CategoriaService service = new CategoriaServiceImpl();
	
	@Action(value = "/cargaDinamicoCategoria", results = { @Result(name = "success", type="json") })
	public String cargaDinamicoCategoria() {
		System.out.println("cargaDinamicoCategoria");
		try {
			setLstCategoria(service.listarTodos());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}

	public List<CategoriaBean> getLstCategoria() {
		return lstCategoria;
	}

	public void setLstCategoria(List<CategoriaBean> lstCategoria) {
		this.lstCategoria = lstCategoria;
	}
	
	
}

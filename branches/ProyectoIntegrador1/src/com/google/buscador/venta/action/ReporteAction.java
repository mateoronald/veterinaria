package com.google.buscador.venta.action;

import java.util.List;

import org.apache.struts2.convention.annotation.ParentPackage;

import com.google.buscador.venta.bean.ProveedorBean;
import com.google.buscador.venta.bean.ReporteBean;
import com.google.buscador.venta.service.ProveedorServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@ParentPackage(value = "dawi")
public class ReporteAction  extends ActionSupport {

	
	private ProveedorServiceImpl proveedorService = new ProveedorServiceImpl();
	private ProveedorBean proveedor;
	private List<ProveedorBean> proveedores; 
	private List<ReporteBean> dataReporte;
	private int id;




	public String obtenerTodosProveedores() throws Exception {
		try {
			setProveedores(proveedorService.listaProveedor());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}

	public int getId() {
		return id;
	}

	public List<ReporteBean> getDataReporte() {
		return dataReporte;
	}


	public void setDataReporte(List<ReporteBean> dataReporte) {
		this.dataReporte = dataReporte;
	}


	public void setId(int id) {
		this.id = id;
	}


	public ProveedorBean getProveedor() {
		return proveedor;
	}


	public void setProveedor(ProveedorBean proveedor) {
		this.proveedor = proveedor;
	}

	public List<ProveedorBean> getProveedores() {
		return proveedores;
	}

	public void setProveedores(List<ProveedorBean> proveedores) {
		this.proveedores = proveedores;
	}
	
	
}

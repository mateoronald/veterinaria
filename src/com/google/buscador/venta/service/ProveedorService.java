package com.google.buscador.venta.service;

import java.util.List;

import com.google.buscador.venta.bean.ProveedorBean;

public interface ProveedorService {

	public abstract int registraProveedor(ProveedorBean bean) throws Exception;

	public abstract int eliminaProveedor(int id) throws Exception;

	public abstract ProveedorBean buscaProveedor(int id) throws Exception;

	public abstract int actualizaProveedor(ProveedorBean bean) throws Exception;

	public abstract List<ProveedorBean> listaProveedor() throws Exception;
	
	//public List<ProveedorBean> proveedoresXEstado(String estado) throws Exception;
		
	//public abstract List<ProveedorBean> consultaProveedor(ProveedorBean bean) throws Exception;
	
	
	//public abstract List<ReporteBean> reportesProveedoresEnDistrito() throws Exception;
	
	//public abstract List<ReporteBean> reportesProveedoresEnDistritoEstado() throws Exception ;
	
}

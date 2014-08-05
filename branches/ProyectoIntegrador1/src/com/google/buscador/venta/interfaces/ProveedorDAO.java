package com.google.buscador.venta.interfaces;

import java.util.List;

import com.google.buscador.venta.bean.ProveedorBean;


public interface ProveedorDAO {
	
	public abstract int inserta(ProveedorBean bean) throws Exception;
	public abstract int elimina(int id) throws Exception;
	public abstract int actualiza(ProveedorBean bean) throws Exception;
	public abstract ProveedorBean obtienePorPK(int id) throws Exception;
	public abstract List<ProveedorBean> traeTodos() throws Exception;
	
	//public List<ProveedorBean> vendedoresXEstado(String estado) throws Exception;
	//public abstract List<ProveedorBean>  consultaVendedor(ProveedorBean bean) throws Exception;
	//public abstract List<ProveedorBean>  reportesVendedoresEnDistrito() throws Exception;
	//public abstract List<ProveedorBean> reportesVendedoresEnDistritoEstado() throws Exception ;
	
}

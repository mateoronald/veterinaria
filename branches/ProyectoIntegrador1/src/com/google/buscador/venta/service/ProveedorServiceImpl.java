package com.google.buscador.venta.service;

import java.util.List;

import com.google.buscador.venta.bean.ProveedorBean;
import com.google.buscador.venta.fabrica.DAOFactory;
import com.google.buscador.venta.interfaces.ProveedorDAO;

public class ProveedorServiceImpl implements ProveedorService{

	DAOFactory factoria = DAOFactory.getFactorty(DAOFactory.MYSQL);
	ProveedorDAO dao = factoria.getProveedorDAO();

	public int registraProveedor(ProveedorBean bean) throws Exception{
		return dao.inserta(bean);
	}
	public int eliminaProveedor(int id) throws Exception{
		return dao.elimina(id);
	}
	public ProveedorBean buscaProveedor(int id) throws Exception{
		return dao.obtienePorPK(id);
	}
	public int actualizaProveedor(ProveedorBean bean) throws Exception{
		return dao.actualiza(bean);
	}
	public List<ProveedorBean> listaProveedor() throws Exception{
		return dao.traeTodos();
	}
	
	
	
}

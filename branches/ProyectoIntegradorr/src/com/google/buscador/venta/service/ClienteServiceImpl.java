package com.google.buscador.venta.service;

import java.util.List;

import com.google.buscador.venta.bean.ClienteBean;
import com.google.buscador.venta.fabrica.DAOFactory;
import com.google.buscador.venta.interfaces.ClienteDAO;

public class ClienteServiceImpl implements ClienteService{

	DAOFactory factoria = DAOFactory.getFactorty(DAOFactory.MYSQL);
	ClienteDAO dao = factoria.getClienteDAO();
	
	public int registraCliente(ClienteBean bean) throws Exception {
		// TODO Auto-generated method stub
		return dao.inserta(bean);
	}

	
	public int eliminaCliente(int id) throws Exception {
		// TODO Auto-generated method stub
		return dao.elimina(id);
	}

	
	public ClienteBean buscaCliente(int id) throws Exception {
		// TODO Auto-generated method stub
		return dao.obtienePorPK(id);
	}

	
	public int actualizaCliente(ClienteBean bean) throws Exception {
		// TODO Auto-generated method stub
		return dao.actualiza(bean);
	}

	public List<ClienteBean> listaCliente() throws Exception {
		// TODO Auto-generated method stub
		return dao.traeTodos();
	}

}

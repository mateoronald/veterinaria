package com.google.buscador.venta.daos;

import java.util.List;

import com.google.buscador.venta.bean.ClienteBean;
import com.google.buscador.venta.interfaces.ClienteDAO;

public class MySqlClienteDAO extends MySqlPadreDAO implements ClienteDAO{

	@Override
	public int inserta(ClienteBean bean) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int elimina(int id) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int actualiza(ClienteBean bean) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ClienteBean obtienePorPK(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ClienteBean> traeTodos() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}

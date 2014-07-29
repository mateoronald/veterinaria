package com.google.buscador.venta.daos;

import java.util.List;

import com.google.buscador.venta.bean.ReservaBean;
import com.google.buscador.venta.interfaces.ReservaDAO;

public class MySqlReservaDAO extends MySqlPadreDAO implements ReservaDAO{

	@Override
	public int inserta(ReservaBean bean) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int elimina(int id) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int actualiza(ReservaBean bean) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ReservaBean obtienePorPK(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ReservaBean> traeTodos() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}

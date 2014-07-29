package com.google.buscador.venta.service;

import java.util.List;

import com.google.buscador.venta.bean.ReservaBean;
import com.google.buscador.venta.fabrica.DAOFactory;
import com.google.buscador.venta.interfaces.ReservaDAO;

public class ReservaServiceImpl implements ReservaService{

	DAOFactory factoria = DAOFactory.getFactorty(DAOFactory.MYSQL);
	ReservaDAO dao = factoria.getReservaDAO();
	
	public int registraReserva(ReservaBean bean) throws Exception {
		// TODO Auto-generated method stub
		return dao.inserta(bean);
	}

	
	public int eliminaReserva(int id) throws Exception {
		// TODO Auto-generated method stub
		return dao.elimina(id);
	}

	
	public ReservaBean buscaReserva(int id) throws Exception {
		// TODO Auto-generated method stub
		return dao.obtienePorPK(id);
	}

	
	public int actualizaReserva(ReservaBean bean) throws Exception {
		// TODO Auto-generated method stub
		return dao.actualiza(bean);
	}

	public List<ReservaBean> listaReserva() throws Exception {
		// TODO Auto-generated method stub
		return dao.traeTodos();
	}

}

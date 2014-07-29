package com.google.buscador.venta.service;

import java.util.List;

import com.google.buscador.venta.bean.AcompañanteBean;
import com.google.buscador.venta.fabrica.DAOFactory;
import com.google.buscador.venta.interfaces.AcompañanteDAO;

public class AcompañanteServiceImpl implements AcompañanteService{

	DAOFactory factoria = DAOFactory.getFactorty(DAOFactory.MYSQL);
	AcompañanteDAO dao = factoria.getAcompañanteDAO();
	
	public int registraAcompañante(AcompañanteBean bean) throws Exception {
		// TODO Auto-generated method stub
		return dao.inserta(bean);
	}

	
	public int eliminaAcompañante(int id) throws Exception {
		// TODO Auto-generated method stub
		return dao.elimina(id);
	}

	
	public AcompañanteBean buscaAcompañante(int id) throws Exception {
		// TODO Auto-generated method stub
		return dao.obtienePorPK(id);
	}

	
	public int actualizaAcompañante(AcompañanteBean bean) throws Exception {
		// TODO Auto-generated method stub
		return dao.actualiza(bean);
	}

	public List<AcompañanteBean> listaAcompañante() throws Exception {
		// TODO Auto-generated method stub
		return dao.traeTodos();
	}

}

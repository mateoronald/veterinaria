package com.google.buscador.venta.service;

import java.util.List;

import com.google.buscador.venta.bean.Acompa�anteBean;
import com.google.buscador.venta.fabrica.DAOFactory;
import com.google.buscador.venta.interfaces.Acompa�anteDAO;

public class Acompa�anteServiceImpl implements Acompa�anteService{

	DAOFactory factoria = DAOFactory.getFactorty(DAOFactory.MYSQL);
	Acompa�anteDAO dao = factoria.getAcompa�anteDAO();
	
	public int registraAcompa�ante(Acompa�anteBean bean) throws Exception {
		// TODO Auto-generated method stub
		return dao.inserta(bean);
	}

	
	public int eliminaAcompa�ante(int id) throws Exception {
		// TODO Auto-generated method stub
		return dao.elimina(id);
	}

	
	public Acompa�anteBean buscaAcompa�ante(int id) throws Exception {
		// TODO Auto-generated method stub
		return dao.obtienePorPK(id);
	}

	
	public int actualizaAcompa�ante(Acompa�anteBean bean) throws Exception {
		// TODO Auto-generated method stub
		return dao.actualiza(bean);
	}

	public List<Acompa�anteBean> listaAcompa�ante() throws Exception {
		// TODO Auto-generated method stub
		return dao.traeTodos();
	}

}

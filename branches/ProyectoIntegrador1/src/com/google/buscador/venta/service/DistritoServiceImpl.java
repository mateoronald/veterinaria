package com.google.buscador.venta.service;

import java.util.List;

import com.google.buscador.venta.bean.DistritoBean;
import com.google.buscador.venta.fabrica.DAOFactory;
import com.google.buscador.venta.interfaces.DistritoDAO;

public class DistritoServiceImpl implements DistritoService {

	DAOFactory factoria = DAOFactory.getFactorty(DAOFactory.MYSQL);
	DistritoDAO dao = factoria.getDistritoDAO();


	@Override
	public List<DistritoBean> listarTodos() throws Exception {
		return dao.listarTodos();
	}

}

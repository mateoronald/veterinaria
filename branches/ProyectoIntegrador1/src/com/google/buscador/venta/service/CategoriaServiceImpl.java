package com.google.buscador.venta.service;

import java.util.List;

import com.google.buscador.venta.bean.CategoriaBean;
import com.google.buscador.venta.fabrica.DAOFactory;
import com.google.buscador.venta.interfaces.CategoriaDAO;

public class CategoriaServiceImpl implements CategoriaService {

	DAOFactory factoria = DAOFactory.getFactorty(DAOFactory.MYSQL);
	CategoriaDAO dao = factoria.getCategoriaDAO();


	@Override
	public List<CategoriaBean> listarTodos() throws Exception {
		return dao.listarTodos();
	}

}

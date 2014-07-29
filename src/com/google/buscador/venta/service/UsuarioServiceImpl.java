package com.google.buscador.venta.service;

import java.util.List;

import com.google.buscador.venta.bean.UsuarioBean;
import com.google.buscador.venta.fabrica.DAOFactory;
import com.google.buscador.venta.interfaces.UsuarioDAO;

public class UsuarioServiceImpl implements UsuarioService{

	DAOFactory factoria = DAOFactory.getFactorty(DAOFactory.MYSQL);
	UsuarioDAO dao = factoria.getUsuarioDAO();
	
	public int registraUsuario(UsuarioBean bean) throws Exception {
		// TODO Auto-generated method stub
		return dao.inserta(bean);
	}


	public int eliminaUsuario(int id) throws Exception {
		// TODO Auto-generated method stub
		return dao.elimina(id);
	}


	public UsuarioBean buscaUsuario(int id) throws Exception {
		// TODO Auto-generated method stub
		return dao.obtienePorPK(id);
	}


	public int actualizaUsuario(UsuarioBean bean) throws Exception {
		// TODO Auto-generated method stub
		return dao.actualiza(bean);
	}

	public List<UsuarioBean> listaUsuario() throws Exception {
		// TODO Auto-generated method stub
		return dao.traeTodos();
	}

}

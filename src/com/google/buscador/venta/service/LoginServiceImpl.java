package com.google.buscador.venta.service;

import java.util.List;


import com.google.buscador.venta.bean.OpcionBean;
import com.google.buscador.venta.bean.UsuarioBean;
import com.google.buscador.venta.fabrica.DAOFactory;

import com.google.buscador.venta.interfaces.OpcionDAO;
import com.google.buscador.venta.interfaces.UsuarioDAO;

public class LoginServiceImpl implements LoginService{
	
	DAOFactory fabrica = DAOFactory.getFactorty(DAOFactory.MYSQL);
	
	UsuarioDAO getUsuarioDAO = fabrica.getUsuarioDAO();
	OpcionDAO getOpcionDAO = fabrica.getOpcionDAO();
	
	@Override
	public UsuarioBean VerficarLogeo(String strLogin, String strPassword) {
		// TODO Auto-generated method stub
		return getUsuarioDAO.VerficarLogeo(strLogin,strPassword);
	}


	@Override
	public List<OpcionBean> obtenerOpcion(int intPerfil) {
		// TODO Auto-generated method stub
		return getOpcionDAO.obtenerOpcion(intPerfil);
	}





}

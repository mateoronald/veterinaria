package com.google.buscador.venta.fabrica;



import com.google.buscador.venta.daos.MySqlAcompa�anteDAO;
import com.google.buscador.venta.daos.MySqlClienteDAO;
import com.google.buscador.venta.daos.MySqlOpcionDAO;
import com.google.buscador.venta.daos.MySqlPerfilDAO;
import com.google.buscador.venta.daos.MySqlReservaDAO;

import com.google.buscador.venta.daos.MySqlUsuarioDAO;


import com.google.buscador.venta.interfaces.Acompa�anteDAO;
import com.google.buscador.venta.interfaces.ClienteDAO;
import com.google.buscador.venta.interfaces.OpcionDAO;
import com.google.buscador.venta.interfaces.ReservaDAO;

import com.google.buscador.venta.interfaces.PerfilDAO;


import com.google.buscador.venta.interfaces.UsuarioDAO;


public class MySqlDAOFActory extends DAOFactory {

	@Override
	public UsuarioDAO getUsuarioDAO() {
		// TODO Auto-generated method stub
		return new MySqlUsuarioDAO();
	}

	@Override
	public PerfilDAO getPerfilDAO() {
		// TODO Auto-generated method stub
		return new MySqlPerfilDAO();
	}

	@Override
	public OpcionDAO getOpcionDAO() {
		// TODO Auto-generated method stub
		return new MySqlOpcionDAO();
	}

	@Override
	public Acompa�anteDAO getAcompa�anteDAO() {
		// TODO Auto-generated method stub
		return new MySqlAcompa�anteDAO();
	}

	@Override
	public ClienteDAO getClienteDAO() {
		// TODO Auto-generated method stub
		return new MySqlClienteDAO();
	}

	@Override
	public ReservaDAO getReservaDAO() {
		// TODO Auto-generated method stub
		return new MySqlReservaDAO();
	}
	
	
}

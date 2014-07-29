package com.google.buscador.venta.fabrica;


import com.google.buscador.venta.interfaces.AcompañanteDAO;
import com.google.buscador.venta.interfaces.ClienteDAO;
import com.google.buscador.venta.interfaces.OpcionDAO;
import com.google.buscador.venta.interfaces.PerfilDAO;
import com.google.buscador.venta.interfaces.ReservaDAO;
import com.google.buscador.venta.interfaces.UsuarioDAO;


public abstract class DAOFactory {

	public static final int MYSQL = 1;
	public static final int ORACLE = 2;
	
	
	
	public abstract OpcionDAO getOpcionDAO();
	public abstract PerfilDAO getPerfilDAO();	
	public abstract UsuarioDAO getUsuarioDAO();
	public abstract AcompañanteDAO getAcompañanteDAO();
	public abstract ClienteDAO getClienteDAO();
	public abstract ReservaDAO getReservaDAO();
	//public abstract PacienteDAO getPacienteDAO();
	
	// Se aplica polimorfismo
	public static DAOFactory getFactorty(int bd) {
		switch (bd) {
			case MYSQL:
				return new MySqlDAOFActory();
			default: return null;
		}
		
	}

	

}

package com.google.buscador.venta.fabrica;



import com.google.buscador.venta.interfaces.CategoriaDAO;
import com.google.buscador.venta.interfaces.CitaDAO;
import com.google.buscador.venta.interfaces.ClienteDAO;
import com.google.buscador.venta.interfaces.DistritoDAO;
import com.google.buscador.venta.interfaces.LocalDAO;
import com.google.buscador.venta.interfaces.MascotaDAO;
import com.google.buscador.venta.interfaces.OpcionDAO;
import com.google.buscador.venta.interfaces.PerfilDAO;
import com.google.buscador.venta.interfaces.ProveedorDAO;
import com.google.buscador.venta.interfaces.UsuarioDAO;
import com.google.buscador.venta.interfaces.VacunaDAO;


public abstract class DAOFactory {

	public static final int MYSQL = 1;
	public static final int ORACLE = 2;
	
	
	
	public abstract OpcionDAO getOpcionDAO();
	public abstract PerfilDAO getPerfilDAO();	
	public abstract UsuarioDAO getUsuarioDAO();
	public abstract LocalDAO getLocalDAO();
	public abstract CitaDAO getCitaDAO();
	public abstract MascotaDAO getMascotaDAO();
	public abstract VacunaDAO	getVacunaDAO();
	public abstract ClienteDAO getClienteDAO();
	public abstract DistritoDAO getDistritoDAO();
	public abstract CategoriaDAO getCategoriaDAO();
	public abstract ProveedorDAO getProveedorDAO();
	


	
	// Se aplica polimorfismo
	public static DAOFactory getFactorty(int bd) {
		switch (bd) {
			case MYSQL:
				return new MySqlDAOFActory();
			default: return null;
		}
		
	}

	

}

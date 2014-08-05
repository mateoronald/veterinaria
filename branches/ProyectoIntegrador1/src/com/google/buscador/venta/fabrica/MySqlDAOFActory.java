package com.google.buscador.venta.fabrica;


import com.google.buscador.venta.daos.MySqlCategoriaDAO;
import com.google.buscador.venta.daos.MySqlCitaDAO;
import com.google.buscador.venta.daos.MySqlClienteDAO;
import com.google.buscador.venta.daos.MySqlDistritoDAO;
import com.google.buscador.venta.daos.MySqlLocalDAO;
import com.google.buscador.venta.daos.MySqlMascotaDAO;
import com.google.buscador.venta.daos.MySqlOpcionDAO;
import com.google.buscador.venta.daos.MySqlPerfilDAO;
import com.google.buscador.venta.daos.MySqlProveedorDAO;
import com.google.buscador.venta.daos.MySqlUsuarioDAO;
import com.google.buscador.venta.daos.MySqlVacunaDAO;
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
	public LocalDAO getLocalDAO() {
		// TODO Auto-generated method stub
		return new MySqlLocalDAO();
	}

	@Override
	public CitaDAO getCitaDAO() {
		// TODO Auto-generated method stub
		return new MySqlCitaDAO();
	}

	@Override
	public MascotaDAO getMascotaDAO() {
		// TODO Auto-generated method stub
		return new MySqlMascotaDAO();
	}

	@Override
	public VacunaDAO getVacunaDAO() {
		// TODO Auto-generated method stub
		return new MySqlVacunaDAO();
	}

	@Override
	public ClienteDAO getClienteDAO() {
		// TODO Auto-generated method stub
		return new MySqlClienteDAO();
	}

	@Override
	public DistritoDAO getDistritoDAO() {
		// TODO Auto-generated method stub
		return new MySqlDistritoDAO();
	}

	@Override
	public CategoriaDAO getCategoriaDAO() {
		// TODO Auto-generated method stub
		return new MySqlCategoriaDAO(); 
	}

	@Override
	public ProveedorDAO getProveedorDAO() {
		// TODO Auto-generated method stub
		return new MySqlProveedorDAO(); 
	}







	


	
}

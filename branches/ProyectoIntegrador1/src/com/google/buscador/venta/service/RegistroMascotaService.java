package com.google.buscador.venta.service;

import java.util.List;

import com.google.buscador.venta.bean.Cliente;
import com.google.buscador.venta.bean.VacunaBean;
import com.google.buscador.venta.fabrica.DAOFactory;
import com.google.buscador.venta.interfaces.ClienteDAO;
import com.google.buscador.venta.interfaces.VacunaDAO;

public class RegistroMascotaService {
	
	DAOFactory fabrica = DAOFactory.getFactorty(DAOFactory.MYSQL);
	
	ClienteDAO clienteDAO = fabrica.getClienteDAO();
	VacunaDAO  vacunaDAO = fabrica.getVacunaDAO();

	public Cliente BuscarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		return clienteDAO.BuscarCliente(cliente);
	}

	public List obtenerValunas(VacunaBean vacuna) {
		// TODO Auto-generated method stub
		return vacunaDAO.obtenerValunas(vacuna);
	}
	
	
	
	
}

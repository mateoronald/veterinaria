package com.google.buscador.venta.service;

import java.util.List;

import com.google.buscador.venta.bean.CitaBean;
import com.google.buscador.venta.bean.Local;
import com.google.buscador.venta.fabrica.DAOFactory;
import com.google.buscador.venta.interfaces.CitaDAO;
import com.google.buscador.venta.interfaces.LocalDAO;

public class RegistroLocalService {
	
	DAOFactory fabrica = DAOFactory.getFactorty(DAOFactory.MYSQL);
	LocalDAO localDAO = fabrica.getLocalDAO();
	CitaDAO citaDAO = fabrica.getCitaDAO();
	
	public List<Local> listarLocal(Local local) {
		// TODO Auto-generated method stub
		return localDAO.listarLocal(local);
	}
	public void registroCita(CitaBean cita) {
		// TODO Auto-generated method stub
		citaDAO.registroCita(cita);
	}
	public List<CitaBean> listaCita(CitaBean citaBean) {
		// TODO Auto-generated method stub
		return citaDAO.listaCita(citaBean);
	}

}

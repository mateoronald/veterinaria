package com.google.buscador.venta.interfaces;

import java.util.List;

import com.google.buscador.venta.bean.CitaBean;

public interface CitaDAO {

	void registroCita(CitaBean cita);

	List<CitaBean> listaCita(CitaBean citaBean);

}

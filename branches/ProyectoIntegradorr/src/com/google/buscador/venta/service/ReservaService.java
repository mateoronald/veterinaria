package com.google.buscador.venta.service;

import java.util.List;

import com.google.buscador.venta.bean.ReservaBean;

public interface ReservaService {
	
	public abstract int registraReserva(ReservaBean bean) throws Exception;

	public abstract int eliminaReserva(int id) throws Exception;

	public abstract ReservaBean buscaReserva(int id) throws Exception;

	public abstract int actualizaReserva(ReservaBean bean) throws Exception;

	public abstract List<ReservaBean> listaReserva() throws Exception;	
}

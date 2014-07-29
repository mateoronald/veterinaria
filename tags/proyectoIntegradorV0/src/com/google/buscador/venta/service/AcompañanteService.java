package com.google.buscador.venta.service;

import java.util.List;

import com.google.buscador.venta.bean.AcompañanteBean;

public interface AcompañanteService {
	
	public abstract int registraAcompañante(AcompañanteBean bean) throws Exception;

	public abstract int eliminaAcompañante(int id) throws Exception;

	public abstract AcompañanteBean buscaAcompañante(int id) throws Exception;

	public abstract int actualizaAcompañante(AcompañanteBean bean) throws Exception;

	public abstract List<AcompañanteBean> listaAcompañante() throws Exception;	
}

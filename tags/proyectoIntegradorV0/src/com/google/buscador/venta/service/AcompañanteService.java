package com.google.buscador.venta.service;

import java.util.List;

import com.google.buscador.venta.bean.Acompa�anteBean;

public interface Acompa�anteService {
	
	public abstract int registraAcompa�ante(Acompa�anteBean bean) throws Exception;

	public abstract int eliminaAcompa�ante(int id) throws Exception;

	public abstract Acompa�anteBean buscaAcompa�ante(int id) throws Exception;

	public abstract int actualizaAcompa�ante(Acompa�anteBean bean) throws Exception;

	public abstract List<Acompa�anteBean> listaAcompa�ante() throws Exception;	
}

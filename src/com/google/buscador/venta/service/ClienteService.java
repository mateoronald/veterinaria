package com.google.buscador.venta.service;

import java.util.List;

import com.google.buscador.venta.bean.ClienteBean;

public interface ClienteService {
	
	public abstract int registraCliente(ClienteBean bean) throws Exception;

	public abstract int eliminaCliente(int id) throws Exception;

	public abstract ClienteBean buscaCliente(int id) throws Exception;

	public abstract int actualizaCliente(ClienteBean bean) throws Exception;

	public abstract List<ClienteBean> listaCliente() throws Exception;	
}

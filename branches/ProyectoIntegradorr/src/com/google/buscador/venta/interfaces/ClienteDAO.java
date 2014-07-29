package com.google.buscador.venta.interfaces;

import java.util.List;

import com.google.buscador.venta.bean.ClienteBean;

public interface ClienteDAO {
	public abstract int inserta(ClienteBean bean) throws Exception;
	public abstract int elimina(int id) throws Exception;
	public abstract int actualiza(ClienteBean bean) throws Exception;
	public abstract ClienteBean obtienePorPK(int id) throws Exception;
	public abstract List<ClienteBean> traeTodos() throws Exception;
}

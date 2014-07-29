package com.google.buscador.venta.interfaces;

import java.util.List;

import com.google.buscador.venta.bean.Acompa�anteBean;

public interface Acompa�anteDAO {
	public abstract int inserta(Acompa�anteBean bean) throws Exception;
	public abstract int elimina(int id) throws Exception;
	public abstract int actualiza(Acompa�anteBean bean) throws Exception;
	public abstract Acompa�anteBean obtienePorPK(int id) throws Exception;
	public abstract List<Acompa�anteBean> traeTodos() throws Exception;
}
 	
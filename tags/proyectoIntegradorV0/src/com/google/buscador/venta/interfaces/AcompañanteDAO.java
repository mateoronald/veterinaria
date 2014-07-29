package com.google.buscador.venta.interfaces;

import java.util.List;

import com.google.buscador.venta.bean.AcompañanteBean;

public interface AcompañanteDAO {
	public abstract int inserta(AcompañanteBean bean) throws Exception;
	public abstract int elimina(int id) throws Exception;
	public abstract int actualiza(AcompañanteBean bean) throws Exception;
	public abstract AcompañanteBean obtienePorPK(int id) throws Exception;
	public abstract List<AcompañanteBean> traeTodos() throws Exception;
}
 	
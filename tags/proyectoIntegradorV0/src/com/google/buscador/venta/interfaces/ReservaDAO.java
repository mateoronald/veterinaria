package com.google.buscador.venta.interfaces;

import java.util.List;

import com.google.buscador.venta.bean.ReservaBean;

public interface ReservaDAO {
	public abstract int inserta(ReservaBean bean) throws Exception;
	public abstract int elimina(int id) throws Exception;
	public abstract int actualiza(ReservaBean bean) throws Exception;
	public abstract ReservaBean obtienePorPK(int id) throws Exception;
	public abstract List<ReservaBean> traeTodos() throws Exception;
}

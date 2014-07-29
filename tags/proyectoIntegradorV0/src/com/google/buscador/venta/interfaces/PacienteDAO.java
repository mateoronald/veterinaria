package com.google.buscador.venta.interfaces;

import java.util.List;

import com.google.buscador.venta.bean.PacienteBean;

public interface PacienteDAO {
	public abstract int inserta(PacienteBean bean) throws Exception;
	public abstract int elimina(int id) throws Exception;
	public abstract int actualiza(PacienteBean bean) throws Exception;
	public abstract PacienteBean obtienePorPK(int id) throws Exception;
	public abstract List<PacienteBean> traeTodos() throws Exception;
}

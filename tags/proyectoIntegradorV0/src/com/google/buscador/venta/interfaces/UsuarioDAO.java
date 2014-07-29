package com.google.buscador.venta.interfaces;

import java.util.List;

import com.google.buscador.venta.bean.UsuarioBean;

public interface UsuarioDAO {

	UsuarioBean VerficarLogeo(String strLogin, String strPassword);
	public abstract int inserta(UsuarioBean bean) throws Exception;
	public abstract int elimina(int id) throws Exception;
	public abstract int actualiza(UsuarioBean bean) throws Exception;
	public abstract UsuarioBean obtienePorPK(int id) throws Exception;
	public abstract List<UsuarioBean> traeTodos() throws Exception;
}

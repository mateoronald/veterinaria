package com.google.buscador.venta.service;

import java.util.List;

import com.google.buscador.venta.bean.UsuarioBean;

public interface UsuarioService {

	public abstract int registraUsuario(UsuarioBean bean) throws Exception;

	public abstract int eliminaUsuario(int id) throws Exception;

	public abstract UsuarioBean buscaUsuario(int id) throws Exception;

	public abstract int actualizaUsuario(UsuarioBean bean) throws Exception;

	public abstract List<UsuarioBean> listaUsuario() throws Exception;	
}

package com.google.buscador.venta.service;

import java.util.List;

import com.google.buscador.venta.bean.CategoriaBean;

public interface CategoriaService {
	
	public List<CategoriaBean> listarTodos() throws Exception;
	
}

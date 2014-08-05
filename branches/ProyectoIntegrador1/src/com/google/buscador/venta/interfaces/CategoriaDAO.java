package com.google.buscador.venta.interfaces;

import java.util.List;

import com.google.buscador.venta.bean.CategoriaBean;


public interface CategoriaDAO {
	
		public List<CategoriaBean> listarTodos() throws Exception;
	
}

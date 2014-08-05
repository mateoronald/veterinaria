package com.google.buscador.venta.interfaces;

import java.util.List;

import com.google.buscador.venta.bean.DistritoBean;


public interface DistritoDAO {
	
		public List<DistritoBean> listarTodos() throws Exception;
	
}

package com.google.buscador.venta.interfaces;

import java.util.List;

import com.google.buscador.venta.bean.OpcionBean;

public interface OpcionDAO {

	List<OpcionBean> obtenerOpcion(int intPerfil);

}

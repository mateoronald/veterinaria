package com.google.buscador.venta.service;

import java.util.List;


import com.google.buscador.venta.bean.OpcionBean;
import com.google.buscador.venta.bean.UsuarioBean;

public interface LoginService {

	UsuarioBean VerficarLogeo(String strLogin, String strPassword);

	List<OpcionBean> obtenerOpcion(int intPerfil);



}

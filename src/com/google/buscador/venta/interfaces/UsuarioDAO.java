package com.google.buscador.venta.interfaces;

import com.google.buscador.venta.bean.UsuarioBean;

public interface UsuarioDAO {

	UsuarioBean VerficarLogeo(String strLogin, String strPassword);

}

package com.google.buscador.venta.interfaces;

import java.util.List;

import com.google.buscador.venta.bean.Local;

public interface LocalDAO {

	List<Local> listarLocal(Local local);

}

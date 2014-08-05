package com.google.buscador.venta.interfaces;

import java.util.List;

import com.google.buscador.venta.bean.Cliente;
import com.google.buscador.venta.bean.VacunaBean;

public interface VacunaDAO {

	List obtenerValunas(VacunaBean vacuna);

}

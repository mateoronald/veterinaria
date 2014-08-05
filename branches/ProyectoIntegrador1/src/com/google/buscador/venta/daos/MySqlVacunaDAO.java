package com.google.buscador.venta.daos;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import com.google.buscador.venta.bean.VacunaBean;
import com.google.buscador.venta.interfaces.VacunaDAO;

public class MySqlVacunaDAO extends MySqlPadreDAO implements VacunaDAO {

	@SuppressWarnings("rawtypes")
	@Override
	public List obtenerValunas(VacunaBean vacuna) {
		// TODO Auto-generated method stub
		SqlSession session = sqlMapper.openSession();

		List lista = new ArrayList<VacunaBean>();
		try {
			lista = session.selectList("vacunaSQL.vacunaslist", vacuna);
			return lista;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}

}

package com.google.buscador.venta.daos;



import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.google.buscador.venta.bean.CitaBean;
import com.google.buscador.venta.interfaces.CitaDAO;

public class MySqlCitaDAO extends MySqlPadreDAO implements CitaDAO {

	@Override
	public void registroCita(CitaBean cita) {
		// TODO Auto-generated method stub
		SqlSession session = sqlMapper.openSession();
		try {
			session.insert("citaSQL.registarCita", cita);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			session.close();
		}

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<CitaBean> listaCita(CitaBean citaBean) {
		SqlSession session = sqlMapper.openSession();
		List listaLocal = new ArrayList<CitaBean>();
		try {
			listaLocal = session.selectList("citaSQL.selectCita", citaBean);
			return listaLocal;

		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			session.close();
		}
		return null;
	}

}

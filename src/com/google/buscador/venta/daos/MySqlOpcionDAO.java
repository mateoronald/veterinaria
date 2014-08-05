package com.google.buscador.venta.daos;


import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.google.buscador.venta.bean.OpcionBean;
import com.google.buscador.venta.interfaces.OpcionDAO;

public class MySqlOpcionDAO extends MySqlPadreDAO implements OpcionDAO {
	
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<OpcionBean> obtenerOpcion(int codigoUsuario) {
		
		SqlSession session = sqlMapper.openSession();
		
		List listaOpciones = new ArrayList<OpcionBean>();
		
		try {
			listaOpciones = session.selectList("logeoSQL.SelectOpcionLogeo", codigoUsuario);
			return listaOpciones;
			
		} catch (Exception e) {
			session.rollback();
		}finally{
			session.close();
		}
		return null;
	}

}

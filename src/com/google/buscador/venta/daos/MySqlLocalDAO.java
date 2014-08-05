package com.google.buscador.venta.daos;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.google.buscador.venta.bean.Local;
import com.google.buscador.venta.interfaces.LocalDAO;

public class MySqlLocalDAO extends MySqlPadreDAO implements LocalDAO {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<Local> listarLocal(Local local) {
		
		SqlSession session = sqlMapper.openSession();
		
		List listaLocal = new ArrayList<Local>();
		
		try {
			listaLocal = session.selectList("localSQL.selectLocal", local);
			return listaLocal;
			
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		}finally{
			session.close();
		}
		return null;
	}

}

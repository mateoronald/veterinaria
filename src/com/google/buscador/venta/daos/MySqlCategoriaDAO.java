package com.google.buscador.venta.daos;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.google.buscador.venta.bean.CategoriaBean;
import com.google.buscador.venta.interfaces.CategoriaDAO;

public class MySqlCategoriaDAO implements CategoriaDAO{


	SqlSessionFactory sqlMapper = null;
	{
		String archivo = "ConfiguracionIbatis.xml";
		try {
			Reader reader = Resources.getResourceAsReader(archivo);
			sqlMapper = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	

	@Override@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<CategoriaBean> listarTodos() throws Exception {
		SqlSession session = sqlMapper.openSession();
		List lista = new ArrayList<CategoriaBean>();
		try {
			lista =session.selectList("categoria.selectCategoria");
			return lista;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}

		
	

}

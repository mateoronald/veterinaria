package com.google.buscador.venta.daos;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.google.buscador.venta.interfaces.PerfilDAO;

public class MySqlPerfilDAO implements PerfilDAO{

	SqlSessionFactory sqlMapper = null;
	{
		try {
			String archivo = "configuracionIbatis.xml";
			Reader reader = Resources.getResourceAsReader(archivo);
			sqlMapper = new SqlSessionFactoryBuilder().build(reader);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}

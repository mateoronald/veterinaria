package com.google.buscador.venta.daos;


import java.util.List;

import org.apache.ibatis.session.SqlSession;
import com.google.buscador.venta.bean.UsuarioBean;
import com.google.buscador.venta.interfaces.UsuarioDAO;

public class MySqlUsuarioDAO extends MySqlPadreDAO implements UsuarioDAO {
	
	
	
	@Override
	public UsuarioBean VerficarLogeo(String strLogin, String strPassword) {
		
		SqlSession session = sqlMapper.openSession();

		UsuarioBean usuario = new UsuarioBean();
		usuario.setStrLogin(strLogin);
		usuario.setStrPassword(strPassword);
		try {
			
			UsuarioBean verivicado = (UsuarioBean) session.selectOne(
					"logeoSQL.SelectUsuarioLogeo", usuario);
			return verivicado;
		} catch (Exception e) {
			session.rollback();
			e.printStackTrace();
		}finally{
			session.close();
		}
		return null;
	}

	@Override
	public int inserta(UsuarioBean bean) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int elimina(int id) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int actualiza(UsuarioBean bean) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public UsuarioBean obtienePorPK(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UsuarioBean> traeTodos() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}

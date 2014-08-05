package com.google.buscador.venta.daos;

import org.apache.ibatis.session.SqlSession;

import com.google.buscador.venta.bean.Cliente;
import com.google.buscador.venta.interfaces.ClienteDAO;

public class MySqlClienteDAO extends MySqlPadreDAO implements ClienteDAO {

	@Override
	public Cliente BuscarCliente(Cliente cliente) {
		SqlSession session = sqlMapper.openSession();
		try {

			Cliente clien = (Cliente) session.selectOne(
					"clienteSQL.getByIdCliente", cliente);
			return clien;
		} catch (Exception e) {
			session.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}

}

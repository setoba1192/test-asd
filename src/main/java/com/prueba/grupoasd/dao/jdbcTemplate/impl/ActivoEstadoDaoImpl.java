package com.prueba.grupoasd.dao.jdbcTemplate.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.prueba.grupoasd.dao.ActivoEstadoDao;
import com.prueba.grupoasd.dao.rowmapper.ActivoEstadoRowMapper;

@Repository("ActivoEstadoDaoImpl")
public class ActivoEstadoDaoImpl implements ActivoEstadoDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void crear(Object object) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object buscarPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> listar() {
		// TODO Auto-generated method stub
		String SQL = "SELECT * FROM activo_estado;";

		return jdbcTemplate.query(SQL, new ActivoEstadoRowMapper());
	}

}

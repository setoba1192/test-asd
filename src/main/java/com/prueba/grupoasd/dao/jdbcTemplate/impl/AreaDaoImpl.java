package com.prueba.grupoasd.dao.jdbcTemplate.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.prueba.grupoasd.dao.AreaDao;
import com.prueba.grupoasd.dao.rowmapper.AreaRowMapper;
import com.prueba.grupoasd.model.Area;

@Repository
public class AreaDaoImpl implements AreaDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void crear(Object object) {
		// TODO Auto-generated method stub

		final Area area = (Area) object;

		KeyHolder keyHolder = new GeneratedKeyHolder();
		int result = jdbcTemplate.update(new PreparedStatementCreator() {

			@Override
			public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {

				String SQL = "INSERT INTO area (are_nombre, are_telefono, are_direccion, are_ciudad_id) values (?,?,?,?);";
				PreparedStatement pstm = connection.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);

				pstm.setString(1, area.getNombre());
				pstm.setString(2, area.getTelefono());
				pstm.setString(3, area.getDireccion());
				pstm.setLong(4, area.getCiudad().getId());

				// TODO Auto-generated method stub
				return pstm;
			}
		}, keyHolder);
		if (result > 0) {
			area.setId(keyHolder.getKey().intValue());

		}

	}

	@Override
	public Object buscarPorId(int id) {
		// TODO Auto-generated method stub
		String SQL = "select * from area, ciudad where area.are_id= ? and area.are_ciudad_id = ciudad.ciu_id;";

		return jdbcTemplate.queryForObject(SQL, new Object[] { id }, new AreaRowMapper());
	}

	@Override
	public List<Object> listar() {
		// TODO Auto-generated method stub
		String SQL = "select * from area, ciudad where area.are_ciudad_id = ciudad.ciu_id;";

		return jdbcTemplate.query(SQL, new AreaRowMapper());
	}

}

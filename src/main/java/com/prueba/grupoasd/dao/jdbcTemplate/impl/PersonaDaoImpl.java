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

import com.prueba.grupoasd.dao.PersonaDao;
import com.prueba.grupoasd.dao.rowmapper.PersonaRowMapper;
import com.prueba.grupoasd.model.Persona;

@Repository("PersonaDaoImpl")
public class PersonaDaoImpl implements PersonaDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void crear(Object object) {
		// TODO Auto-generated method stub
		final Persona persona = (Persona) object;
		KeyHolder keyHolder = new GeneratedKeyHolder();
		int result = jdbcTemplate.update(new PreparedStatementCreator() {

			@Override
			public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {

				String SQL = "INSERT INTO persona (per_identificacion, per_nombre, per_apellido) ";
				SQL += "VALUES (?,?,?);";
				PreparedStatement pstm = connection.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);

				pstm.setString(1, persona.getIdentificacion());
				pstm.setString(2, persona.getNombre());
				pstm.setString(3, persona.getApellido());

				// TODO Auto-generated method stub
				return pstm;
			}
		}, keyHolder);
		if (result > 0) {
			persona.setId(keyHolder.getKey().longValue());

		}
	}

	@Override
	public Object buscarPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> listar() {
		// TODO Auto-generated method stub
		String SQL = "SELECT * FROM persona;";

		return jdbcTemplate.query(SQL, new PersonaRowMapper());
	}

}

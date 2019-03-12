package com.prueba.grupoasd.dao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.prueba.grupoasd.model.Persona;

public class PersonaRowMapper implements RowMapper<Object> {

	@Override
	public Persona mapRow(ResultSet rs, int row) throws SQLException {
		// TODO Auto-generated method stub
		Persona persona = new Persona();
		persona.setIdentificacion(rs.getString("persona.per_identificacion"));
		persona.setApellido(rs.getString("persona.per_apellido"));
		persona.setNombre(rs.getString("persona.per_nombre"));

		return persona;
	}

}

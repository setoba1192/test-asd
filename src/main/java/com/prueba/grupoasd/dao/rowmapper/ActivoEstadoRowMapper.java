package com.prueba.grupoasd.dao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.prueba.grupoasd.model.ActivoEstado;

public class ActivoEstadoRowMapper implements RowMapper<Object> {

	@Override
	public ActivoEstado mapRow(ResultSet rs, int row) throws SQLException {
		// TODO Auto-generated method stub
		ActivoEstado activoEstado = new ActivoEstado();
		activoEstado.setId(rs.getInt("activo_estado.ace_id"));
		activoEstado.setNombre(rs.getString("activo_estado.ace_nombre"));

		return activoEstado;
	}

}

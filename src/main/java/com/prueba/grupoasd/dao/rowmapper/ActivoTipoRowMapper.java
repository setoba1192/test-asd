package com.prueba.grupoasd.dao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.prueba.grupoasd.model.ActivoTipo;

public class ActivoTipoRowMapper implements RowMapper<Object> {

	@Override
	public ActivoTipo mapRow(ResultSet rs, int row) throws SQLException {
		// TODO Auto-generated method stub
		ActivoTipo activoTipo = new ActivoTipo();
		activoTipo.setId(rs.getInt("activo_tipo.act_id"));
		activoTipo.setNombre(rs.getString("activo_tipo.act_nombre"));

		return activoTipo;
	}

}

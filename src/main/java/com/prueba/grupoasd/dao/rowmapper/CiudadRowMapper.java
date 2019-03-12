package com.prueba.grupoasd.dao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.prueba.grupoasd.model.Ciudad;

public class CiudadRowMapper implements RowMapper<Object> {

	@Override
	public Ciudad mapRow(ResultSet rs, int row) throws SQLException {
		// TODO Auto-generated method stub
		Ciudad ciudad = new Ciudad();
		ciudad.setId(rs.getInt("ciudad.ciu_id"));
		ciudad.setNombre(rs.getString("ciudad.ciu_nombre"));

		return ciudad;
	}

}

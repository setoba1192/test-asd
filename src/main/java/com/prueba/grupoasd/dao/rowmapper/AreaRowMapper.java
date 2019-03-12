package com.prueba.grupoasd.dao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.prueba.grupoasd.model.Area;

public class AreaRowMapper implements RowMapper<Object> {

	private CiudadRowMapper ciudadRowMapper;

	public AreaRowMapper() {
		// TODO Auto-generated constructor stub
		ciudadRowMapper = new CiudadRowMapper();
	}

	@Override
	public Area mapRow(ResultSet rs, int row) throws SQLException {
		// TODO Auto-generated method stub

		Area area = new Area();
		area.setId(rs.getLong("area.are_id"));
		area.setNombre(rs.getString("area.are_nombre"));
		area.setTelefono(rs.getString("area.are_telefono"));
		area.setCiudad(this.ciudadRowMapper.mapRow(rs, row));
		return area;
	}

}

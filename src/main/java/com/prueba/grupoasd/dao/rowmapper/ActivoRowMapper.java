package com.prueba.grupoasd.dao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.prueba.grupoasd.model.Activo;

public class ActivoRowMapper implements RowMapper<Object> {

	private ActivoTipoRowMapper activoTipoRowMapper;

	public ActivoRowMapper() {
		// TODO Auto-generated constructor stub
		this.activoTipoRowMapper = new ActivoTipoRowMapper();
	}

	@Override
	public Activo mapRow(ResultSet rs, int row) throws SQLException {
		// TODO Auto-generated method stub
		Activo activo = new Activo();
		activo.setId(rs.getLong("activo.act_id"));
		activo.setNombre(rs.getString("activo.act_nombre"));
		activo.setDescripcion(rs.getString("activo.act_descripcion"));
		activo.setTipo(this.activoTipoRowMapper.mapRow(rs, row));
		activo.setSerial(rs.getString("activo.act_serial"));
		activo.setNumeroInterno(rs.getInt("activo.act_numero_interno"));
		activo.setPeso(rs.getFloat("activo.act_peso"));
		activo.setAlto(rs.getFloat("activo.act_alto"));
		activo.setAncho(rs.getFloat("activo.act_ancho"));
		activo.setLargo(rs.getFloat("activo.act_largo"));
		activo.setValorCompra(rs.getBigDecimal("activo.act_valor_compra"));
		activo.setFechaCompra(rs.getTimestamp("activo.act_fecha_compra"));
		activo.setFechaDeBaja(rs.getTimestamp("activo.act_fecha_baja"));
		activo.setColor(rs.getString("activo.act_color"));

		return activo;
	}

}

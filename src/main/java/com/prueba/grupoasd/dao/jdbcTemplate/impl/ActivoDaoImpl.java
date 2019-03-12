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

import com.prueba.grupoasd.dao.ActivoDao;
import com.prueba.grupoasd.dao.rowmapper.ActivoRowMapper;
import com.prueba.grupoasd.model.Activo;

@Repository("ActivoDaoImpl")
public class ActivoDaoImpl implements ActivoDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void crear(Object object) {
		// TODO Auto-generated method stub
		final Activo activo = (Activo) object;
		KeyHolder keyHolder = new GeneratedKeyHolder();
		int result = jdbcTemplate.update(new PreparedStatementCreator() {

			@Override
			public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {

				String SQL = "INSERT INTO activo (act_nombre, act_descripcion, act_activo_tipo_id, act_serial, ";
				SQL += "act_numero_interno, act_peso, act_alto, act_ancho, act_largo, act_valor_compra, ";
				SQL += "act_fecha_compra, act_fecha_baja, act_color, act_estado_id) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
				PreparedStatement pstm = connection.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);

				pstm.setString(1, activo.getNombre());
				pstm.setString(2, activo.getDescripcion());
				pstm.setInt(3, activo.getTipo().getId());
				pstm.setString(4, activo.getSerial());
				pstm.setInt(5, activo.getNumeroInterno());
				pstm.setFloat(6, activo.getPeso());
				pstm.setFloat(7, activo.getAlto());
				pstm.setFloat(8, activo.getAncho());
				pstm.setFloat(9, activo.getLargo());
				pstm.setBigDecimal(10, activo.getValorCompra());
				pstm.setTimestamp(11, activo.getFechaCompra());
				pstm.setTimestamp(12, activo.getFechaDeBaja());
				pstm.setString(13, activo.getColor());
				pstm.setInt(14, activo.getEstado().getId());

				// TODO Auto-generated method stub
				return pstm;
			}
		}, keyHolder);
		if (result > 0) {
			activo.setId(keyHolder.getKey().intValue());

		}

	}

	@Override
	public Object buscarPorId(int id) {
		// TODO Auto-generated method stub
		String SQL = "SELECT * FROM activo, activo_tipo WHERE activo.act_activo_tipo_id = activo_tipo.act_id and activo.act_id = ?;";

		return jdbcTemplate.queryForObject(SQL, new Object[] { id }, new ActivoRowMapper());
	}

	@Override
	public List<Object> listar() {
		// TODO Auto-generated method stub
		String SQL = "SELECT * FROM activo, activo_tipo WHERE activo.act_activo_tipo_id = activo_tipo.act_id;";

		return jdbcTemplate.query(SQL, new ActivoRowMapper());
	}

}

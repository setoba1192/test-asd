package com.prueba.grupoasd.test.dao;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.prueba.grupoasd.dao.ActivoDao;
import com.prueba.grupoasd.model.Activo;
import com.prueba.grupoasd.model.ActivoEstado;
import com.prueba.grupoasd.model.ActivoTipo;
import com.prueba.grupoasd.test.config.DbConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { DbConfig.class })
public class ActivoTestDao {

	@Autowired
	private ActivoDao activoDao;

	@Test
	public void buscarPorId() {

		Activo activo = (Activo) activoDao.buscarPorId(1);

		assertNotNull(activo);

	}

	@Test
	public void crear() {

		Activo activo = new Activo();
		activo.setNombre("Activo 1");
		activo.setDescripcion("Descripción de activo");
		activo.setTipo(new ActivoTipo(1, "Prueba"));
		activo.setSerial("ac10000");
		activo.setNumeroInterno(123456);
		activo.setPeso(10);
		activo.setAlto(3);
		activo.setAncho(4);
		activo.setLargo(4.5F);
		activo.setValorCompra(new BigDecimal(35000));
		activo.setFechaCompra(new Timestamp(new Date().getTime()));
		activo.setFechaDeBaja(new Timestamp(new Date().getTime()));
		activo.setColor("Amarillo");
		activo.setEstado(new ActivoEstado(1, "Prueba"));

		activoDao.crear(activo);

	}
	
	@Test
	public void listar() {
		
		assertTrue(!activoDao.listar().isEmpty());
	}

}

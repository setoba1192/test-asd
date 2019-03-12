package com.prueba.grupoasd.test.service;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.prueba.grupoasd.model.Area;
import com.prueba.grupoasd.model.Ciudad;
import com.prueba.grupoasd.service.AreaService;
import com.prueba.grupoasd.test.config.AppConfig;
import com.prueba.grupoasd.test.config.DbConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppConfig.class, DbConfig.class })
public class AreaServiceTestImpl {

	@Autowired
	private AreaService areaService;

	@Test
	public void crear() {
		Area area = new Area();
		area.setNombre("Nombre de prueba");
		area.setTelefono("8974444");
		area.setDireccion("Calle 18");

		Ciudad ciudad = new Ciudad();
		ciudad.setId(1);

		area.setCiudad(ciudad);

		areaService.crear(area);
		assertTrue("Correcto", area.getId() > 0);
	}

}

package com.prueba.grupoasd.test.dao;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.prueba.grupoasd.dao.AreaDao;
import com.prueba.grupoasd.model.Area;
import com.prueba.grupoasd.model.Ciudad;
import com.prueba.grupoasd.test.config.DbConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { DbConfig.class })
public class AreaTestDao {

	@Autowired
	private AreaDao areaDao;

	@Transactional
	@Test
	public void testCrear() {

		Area area = new Area();
		area.setNombre("Prueba");
		area.setTelefono("8974444");
		area.setDireccion("Calle 18");

		Ciudad ciudad = new Ciudad();
		ciudad.setId(1);

		area.setCiudad(ciudad);

		areaDao.crear(area);
		assertTrue("Correcto", area.getId() > 0);

	}

	@Test
	public void testBuscarPorId() {

		Area area = (Area) areaDao.buscarPorId(6);

		System.out.println(area);
		assertNotNull(area);

	}

	@Test
	public void testListarAreas() {

		List<Object> areas = areaDao.listar();
		for (Object area : areas) {

			System.out.println(area);

		}
		assertTrue("Correcto", areaDao.listar().size() > 0);
	}
}

package com.prueba.grupoasd.test.dao;

import static org.junit.Assert.assertTrue;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.prueba.grupoasd.dao.PersonaDao;
import com.prueba.grupoasd.model.Persona;
import com.prueba.grupoasd.test.config.DbConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { DbConfig.class })
public class PersonaTestDao {

	@Autowired
	private PersonaDao personaDao;

	@Transactional
	@Test
	public void crear() {

		Persona persona = new Persona();
		persona.setIdentificacion("107526");
		persona.setApellido("Roa Sánchez");
		persona.setNombre("Joan Sebastián");

		personaDao.crear(persona);

		assertTrue(persona.getId() > 0);

	}
	
	@Test
	public void listar() {
		
		assertTrue(!personaDao.listar().isEmpty());
	}

}

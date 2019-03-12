package com.prueba.grupoasd.test.dao;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.prueba.grupoasd.dao.CiudadDao;
import com.prueba.grupoasd.test.config.DbConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { DbConfig.class })
public class CiudadTestDao {

	@Autowired
	private CiudadDao ciudadDao;

	@Test
	public void listar() {

		assertTrue(!ciudadDao.listar().isEmpty());

	}

}

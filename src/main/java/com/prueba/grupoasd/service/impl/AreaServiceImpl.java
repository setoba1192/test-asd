package com.prueba.grupoasd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.grupoasd.dao.AreaDao;
import com.prueba.grupoasd.exception.ValidacionDominioException;
import com.prueba.grupoasd.model.Area;
import com.prueba.grupoasd.service.AreaService;
import com.prueba.grupoasd.web.util.Utils;

@Service
public class AreaServiceImpl implements AreaService {

	@Autowired
	private AreaDao areaDao;

	@Override
	public void crear(Object object) {
		// TODO Auto-generated method stub

		validarArea(object);
		areaDao.crear(object);

	}

	private void validarArea(Object object) {

		Area area = (Area) object;

		if (Utils.emptyString(area.getNombre())) {

			throw new ValidacionDominioException("Debe ingresar el nombre del Area.");
		}

		if (Utils.emptyString(area.getDireccion())) {

			throw new ValidacionDominioException("Debe ingresar una descripción del Area.");
		}

		if (area.getCiudad() == null) {

			throw new ValidacionDominioException("Debe seleccionar una Ciudad.");
		}

	}

}

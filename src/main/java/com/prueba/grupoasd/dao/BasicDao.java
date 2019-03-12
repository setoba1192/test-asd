package com.prueba.grupoasd.dao;

import java.util.List;

public interface BasicDao {

	public void crear(Object object);

	public Object buscarPorId(int id);

	public List<Object> listar();
}

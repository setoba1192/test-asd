package com.prueba.grupoasd.web;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.prueba.grupoasd.exception.ObjetoNoEncontradoException;
import com.prueba.grupoasd.exception.ObjetoYaExistenteException;
import com.prueba.grupoasd.exception.ValidacionDominioException;
import com.prueba.grupoasd.web.util.Mensaje;

@RestControllerAdvice
public class ManejadorExcepcion {

	@ExceptionHandler({ ValidacionDominioException.class, ObjetoYaExistenteException.class })
	public Mensaje validacionDominioException(Exception e, HttpServletResponse response) {
		e.printStackTrace();
		response.setStatus(400);
		return new Mensaje(e.getMessage());
	}

	@ExceptionHandler({ ObjetoNoEncontradoException.class })
	public Mensaje objetoNoEncontradoException(Exception e, HttpServletResponse response) {
		e.printStackTrace();
		response.setStatus(404);
		return new Mensaje(e.getMessage());
	}

}
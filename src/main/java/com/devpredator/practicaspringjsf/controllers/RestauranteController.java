package com.devpredator.practicaspringjsf.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.springframework.beans.factory.annotation.Value;

import com.devpredator.practicaspringjsf.entity.Restaurante;
import com.devpredator.practicaspringjsf.services.RestauranteService;

/**
 * @author DevPredator
 */
//:::::::AGREGA AQUI LAS ANOTACIONES DE JSF NECESARIAS::::
@ManagedBean
@ViewScoped
public class RestauranteController {

	private List<Restaurante> restaurantes;
	
	private List<Restaurante> restaurantesFiltrados;
	
	//:::: AGREGA AQUI LA ANOTACION QUE INYECTA UN BEAN DE SPRING CON JSF :::::::
	@ManagedProperty("#{restauranteServiceImpl}")
	private RestauranteService restauranteServiceImpl;
	
	@PostConstruct
	public void init() {		
		this.restaurantes = this.restauranteServiceImpl.consultarRestaurantes();
	}

	/**
	 */
	public List<Restaurante> getRestaurantes() {
		return restaurantes;
	}

	/**
	 */
	public void setRestaurantes(List<Restaurante> restaurantes) {
		this.restaurantes = restaurantes;
	}

	/**
	 * @return the restaurantesFiltrados
	 */
	public List<Restaurante> getRestaurantesFiltrados() {
		return restaurantesFiltrados;
	}

	/**
	 */
	public void setRestaurantesFiltrados(List<Restaurante> restaurantesFiltrados) {
		this.restaurantesFiltrados = restaurantesFiltrados;
	}

	/**
	 * @return the restauranteServiceImpl
	 */
	public RestauranteService getRestauranteServiceImpl() {
		return restauranteServiceImpl;
	}

	/**
	 */
	public void setRestauranteServiceImpl(RestauranteService restauranteServiceImpl) {
		this.restauranteServiceImpl = restauranteServiceImpl;
	}


}
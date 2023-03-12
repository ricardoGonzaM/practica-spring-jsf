/**
 * 
 */
package com.devpredator.practicaspringjsf.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.devpredator.practicaspringjsf.dao.RestauranteDAO;
import com.devpredator.practicaspringjsf.entity.Restaurante;

/**
 * @author DevPredator
 *
 */
@Repository
public class RestauranteDAOImpl implements RestauranteDAO {

	//AGREGAR AQUI EL ENTITY MANAGER FACTORY.
	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
			.createEntityManagerFactory("persistenceDevPredator");
	
	@Override
	public List<Restaurante> consultar() {
		//AGREGAR LA FUNCIONALIDAD PARA CONSULTAR LOS RESTAURANTES CON JPA.
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		
		TypedQuery<Restaurante> queryRestaurante = (TypedQuery<Restaurante>) em
				.createQuery("FROM Restaurante ORDER BY nombre");

		return queryRestaurante.getResultList();
	}

}
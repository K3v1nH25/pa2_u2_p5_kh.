package com.uce.edu.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.repository.modelo.Libro;
import com.uce.edu.repository.modelo.Libro2;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class LibroRepositoryImpl implements ILibroRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Libro2 seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertar(Libro2 libro2) {
		// TODO Auto-generated method stub
		this.entityManager.persist(libro2);

	}

	@Override
	public void actualizar(Libro2 libro2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Libro seleccionarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		// SQL: SELECT * FROM libro l WHERE l.libr_titulo= ?
		// JPQL: SELECT l FROM Libro l WHERE l.titulo = : variable
		Query myQuery = this.entityManager.createQuery("SELECT l  FROM Libro l WHERE l.titulo = : variable ");
		myQuery.setParameter("variable", nombre);
		return (Libro) myQuery.getSingleResult();
	}

}

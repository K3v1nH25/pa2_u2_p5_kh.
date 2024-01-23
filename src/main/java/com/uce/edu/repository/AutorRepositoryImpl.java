package com.uce.edu.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.repository.modelo.Autor;
import com.uce.edu.repository.modelo.Ciudadano;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class AutorRepositoryImpl implements IAutorRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Autor seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Autor.class, id);
	}

	@Override
	public void insertar(Autor autor) {
		// TODO Auto-generated method stub
		this.entityManager.persist(autor);

	}

	@Override
	public void actualizar(Autor autor) {
		// TODO Auto-generated method stub
		this.entityManager.merge(autor);

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Autor autor = this.seleccionar(id);
		this.entityManager.remove(autor);

	}

	@Override
	public Autor seleccionarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		CriteriaBuilder myCriteriaBuilder = this.entityManager.getCriteriaBuilder();
		CriteriaQuery<Autor> myCriteriaQuery = myCriteriaBuilder.createQuery(Autor.class);
		Root<Autor> myFrom = myCriteriaQuery.from(Autor.class);
		Predicate condicionNombre = myCriteriaBuilder.equal(myFrom.get("nombre"), nombre);
		myCriteriaQuery.select(myFrom).where(condicionNombre);
		TypedQuery<Autor> myTypedQuery = this.entityManager.createQuery(myCriteriaQuery);
		return myTypedQuery.getSingleResult();
	}

	@Override
	public Autor seleccionarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		CriteriaBuilder myCriteriaBuilder = this.entityManager.getCriteriaBuilder();
		CriteriaQuery<Autor> myCriteriaQuery = myCriteriaBuilder.createQuery(Autor.class);
		Root<Autor> myFrom = myCriteriaQuery.from(Autor.class);
		Predicate condicionApellido = myCriteriaBuilder.equal(myFrom.get("apellido"), apellido);
		myCriteriaQuery.select(myFrom).where(condicionApellido);
		TypedQuery<Autor> myTypedQuery = this.entityManager.createQuery(myCriteriaQuery);
		return myTypedQuery.getSingleResult();
	}

	@Override
	public Autor seleccionarPorEditorial(String editorial) {
		// TODO Auto-generated method stub
		CriteriaBuilder myCriteriaBuilder = this.entityManager.getCriteriaBuilder();
		CriteriaQuery<Autor> myCriteriaQuery = myCriteriaBuilder.createQuery(Autor.class);
		Root<Autor> myFrom = myCriteriaQuery.from(Autor.class);
		Predicate condicionEditorial = myCriteriaBuilder.equal(myFrom.get("editorial"), editorial);
		myCriteriaQuery.select(myFrom).where(condicionEditorial);
		TypedQuery<Autor> myTypedQuery = this.entityManager.createQuery(myCriteriaQuery);
		return myTypedQuery.getSingleResult();
	}

	@Override
	public Autor seleccionarPorNumeroPremios(String numeroPremios) {
		// TODO Auto-generated method stub
		CriteriaBuilder myCriteriaBuilder = this.entityManager.getCriteriaBuilder();
		CriteriaQuery<Autor> myCriteriaQuery = myCriteriaBuilder.createQuery(Autor.class);
		Root<Autor> myFrom = myCriteriaQuery.from(Autor.class);
		Predicate condicionPremios = myCriteriaBuilder.equal(myFrom.get("numeroPremios"), numeroPremios);
		myCriteriaQuery.select(myFrom).where(condicionPremios);
		TypedQuery<Autor> myTypedQuery = this.entityManager.createQuery(myCriteriaQuery);
		return myTypedQuery.getSingleResult();
	}

	@Override
	public Autor seleccionarPorNacionalidad(String nacionalidad) {
		// TODO Auto-generated method stub
		CriteriaBuilder myCriteriaBuilder = this.entityManager.getCriteriaBuilder();
		CriteriaQuery<Autor> myCriteriaQuery = myCriteriaBuilder.createQuery(Autor.class);
		Root<Autor> myFrom = myCriteriaQuery.from(Autor.class);
		Predicate condicionNacionalidad = myCriteriaBuilder.equal(myFrom.get("nacionalidad"), nacionalidad);
		myCriteriaQuery.select(myFrom).where(condicionNacionalidad);
		TypedQuery<Autor> myTypedQuery = this.entityManager.createQuery(myCriteriaQuery);
		return myTypedQuery.getSingleResult();
	}

}

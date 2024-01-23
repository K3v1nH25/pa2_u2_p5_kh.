package com.uce.edu.repository;

import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

import com.uce.edu.repository.modelo.Ciudadano;
import com.uce.edu.repository.modelo.Empleado;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CiudadanoRepositoryImpl implements ICiudadanoRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
		this.entityManager.persist(ciudadano);

	}

	@Override
	public Ciudadano seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Ciudadano.class, id);
	}

	@Override
	public void actualizar(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
		this.entityManager.merge(ciudadano);

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Ciudadano ciud = this.seleccionar(id);
		this.entityManager.remove(ciud);

	}

	@Override
	public Empleado sellecionarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<Empleado> myQuery = this.entityManager
				.createQuery("SELECT e FROM Empleado e WHERE e.ciudadano.cedula = :cedula", Empleado.class);
		myQuery.setParameter("cedula", cedula);
		return myQuery.getSingleResult();
	}

	@Override
	public Ciudadano seleccionarPorCedulaCiud(String cedula) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNativeQuery("SELECT *FROM ciudadano c WHERE c.ciud_cedula = :cedula",
				Ciudadano.class);
		myQuery.setParameter("cedula", cedula);
		return (Ciudadano) myQuery.getSingleResult();
	}

	@Override
	public Ciudadano seleccionarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Ciudadano> myQuery = this.entityManager
				.createQuery("SELECT c FROM Ciudadano c WHERE c.nombre = :nombre", Ciudadano.class);
		myQuery.setParameter("nombre", nombre);
		return myQuery.getSingleResult();
	}

	@Override
	public Ciudadano seleccionarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager
				.createNativeQuery("SELECT * FROM ciudadano c WHERE c.ciud_apellido = :apellido", Ciudadano.class);
		myQuery.setParameter("apellido", apellido);
		return (Ciudadano) myQuery.getSingleResult();
	}

	@Override
	public Ciudadano seleccionarPorCodigo(String codigo) {
		// TODO Auto-generated method stub
		TypedQuery<Ciudadano> myQuery = this.entityManager
				.createQuery("SELECT c FROM Ciudadano c WHERE c.codigo = :codigo", Ciudadano.class);
		myQuery.setParameter("codigo", codigo);
		return myQuery.getSingleResult();
	}

	@Override
	public Ciudadano seleccionarPorFechaNacimiento(LocalDateTime fechaNacimiento) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNativeQuery(
				"SELECT * FROM ciudadano c WHERE c.ciud_fecha_nacimeinto = :fechaNacimiento", Ciudadano.class);
		myQuery.setParameter("fechaNacimiento", fechaNacimiento);
		return (Ciudadano) myQuery.getSingleResult();
	}

	@Override
	public Ciudadano seleccionarPorEstatura(String estatura) {
		// TODO Auto-generated method stub
		TypedQuery<Ciudadano> myQuery = this.entityManager
				.createQuery("SELECT c FROM Ciudadano c WHERE c.estatura = :estatura", Ciudadano.class);
		myQuery.setParameter("estatura", estatura);
		return myQuery.getSingleResult();
	}

	@Override
	public Ciudadano seleccionarPorPeso(String peso) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNativeQuery("SELECT * FROM ciudadano c WHERE c.ciud_peso = :peso",
				Ciudadano.class);
		myQuery.setParameter("peso", peso);
		return (Ciudadano) myQuery.getSingleResult();
	}

	@Override
	public Ciudadano seleccionarPorGenero(String genero) {
		// TODO Auto-generated method stub
		TypedQuery<Ciudadano> myQuery = this.entityManager
				.createQuery("SELECT c FROM Ciudadano c WHERE c.genero = :genero", Ciudadano.class);
		myQuery.setParameter("genero", genero);
		return myQuery.getSingleResult();
	}

	@Override
	public Ciudadano seleccionarPorEmpleo(String empleo) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNativeQuery("SELECT * FROM ciudadano c WHERE c.ciud_empleo = :empleo",
				Ciudadano.class);
		myQuery.setParameter("empleo", empleo);
		return (Ciudadano) myQuery.getSingleResult();
	}

	@Override
	public Ciudadano seleccionarPorApe(String apellido) {
		// TODO Auto-generated method stub
		// SELECT c FROM Ciudadano c WHERE c.apellido =:variable

		// 0. Creamos una instancia de la interfaz CriteriaBuilder a partir de un
		// EntityManager
		CriteriaBuilder myCriteria = this.entityManager.getCriteriaBuilder();

		// 1. Determinamos el tipo de retorno que va ha tener mi Query
		CriteriaQuery<Ciudadano> myCriteriaQuery = myCriteria.createQuery(Ciudadano.class);
		// 2. Construir el SQL
		// 2.1 Determinar el from
		// Nota: No necesariamnete el from es igual al tipo de retorno
		// SELECT c FROM Ciudadano c WHERE c.empleado.nombre :dato
		Root<Ciudadano> myFrom = myCriteriaQuery.from(Ciudadano.class);
		// 2.2 Construir las condiciones (WHERE) del SQL
		// En criteria API Query las condiciones se las conoce como "Predicate"
		// c.apellido = :variable
		Predicate condicionApellido = myCriteria.equal(myFrom.get("apellido"), apellido);
		// 3. Construimos el SQL final
		myCriteriaQuery.select(myFrom).where(condicionApellido);
		// 4. Ejecutamos la consulta con un TypedQuery

		TypedQuery<Ciudadano> myTypedQuery = this.entityManager.createQuery(myCriteriaQuery);

		return myTypedQuery.getSingleResult();
	}

	@Override
	public Ciudadano seleccionarPorCriteria(String nombre, String apellido, String cedula) {
		// TODO Auto-generated method stub
		// 0. Creamos una instancia de la interfaz CriteriaBuilder a partir de un
		// EntityManager
		CriteriaBuilder myCriteriaBuilder = this.entityManager.getCriteriaBuilder();
		// 1. Determinamos el tipo de retorno que va ha tener mi Query
		CriteriaQuery<Ciudadano> myCriteriaQuery = myCriteriaBuilder.createQuery(Ciudadano.class);
		// 2. Construir el SQL
		// 2.1 Determinar el from
		Root<Ciudadano> myFrom = myCriteriaQuery.from(Ciudadano.class);
		// 2.2 Construir las condiciones (WHERE) del SQL

		Predicate condicionGenerica = null;

		if (cedula.startsWith("17")) {
			condicionGenerica = myCriteriaBuilder.equal(myFrom.get("nombre"), nombre);
		} else if (cedula.startsWith("05")) {
			condicionGenerica = myCriteriaBuilder.equal(myFrom.get("apellido"), apellido);
		} else {
			condicionGenerica = myCriteriaBuilder.equal(myFrom.get("cedula"), cedula);
		}

		// 3. Construimos el SQL final
		myCriteriaQuery.select(myFrom).where(condicionGenerica);

		// 4. Ejecutamos la consulta con un TypedQuery

		TypedQuery<Ciudadano> myTypedQuery = this.entityManager.createQuery(myCriteriaQuery);

		return myTypedQuery.getSingleResult();
	}

	@Override
	public Ciudadano seleccionarPorCriteriaAndOr(String nombre, String apellido, String cedula) {
		// TODO Auto-generated method stub
		// 0. Creamos una instancia de la interfaz CriteriaBuilder a partir de un
		// EntityManager
		CriteriaBuilder myCriteriaBuilder = this.entityManager.getCriteriaBuilder();
		// 1. Determinamos el tipo de retorno que va ha tener mi Query
		CriteriaQuery<Ciudadano> myCriteriaQuery = myCriteriaBuilder.createQuery(Ciudadano.class);
		// 2. Construir el SQL
		// 2.1 Determinar el from
		Root<Ciudadano> myFrom = myCriteriaQuery.from(Ciudadano.class);
		// 2.2 Construir las condiciones (WHERE) del SQL

		Predicate condicionTotal = null;

		// c.nombre =:nombre
		Predicate condicionNombre = myCriteriaBuilder.equal(myFrom.get("nombre"), nombre);
		// c.apellido =:apellido
		Predicate condicionApellido = myCriteriaBuilder.equal(myFrom.get("apellido"), apellido);

		if (cedula.startsWith("17")) {
			// c.nombre = :nombre or c.apellido = :apellido
			condicionTotal = myCriteriaBuilder.or(condicionNombre, condicionApellido);
		} else if (cedula.startsWith("05")) {
			// c.nombre = :nombre and c.apellido = :apellido
			condicionTotal = myCriteriaBuilder.and(condicionNombre, condicionApellido);
		}

		// 3. Construimos el SQL final
		myCriteriaQuery.select(myFrom).where(condicionTotal);

		// 4. Ejecutamos la consulta con un TypedQuery

		TypedQuery<Ciudadano> myTypedQuery = this.entityManager.createQuery(myCriteriaQuery);

		return myTypedQuery.getSingleResult();
	}

}

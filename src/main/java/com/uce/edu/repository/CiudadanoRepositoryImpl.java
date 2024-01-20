package com.uce.edu.repository;

import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

import com.uce.edu.repository.modelo.Ciudadano;
import com.uce.edu.repository.modelo.Empleado;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
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

}

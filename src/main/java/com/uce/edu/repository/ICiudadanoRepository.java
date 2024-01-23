package com.uce.edu.repository;

import java.time.LocalDateTime;

import com.uce.edu.repository.modelo.Ciudadano;
import com.uce.edu.repository.modelo.Empleado;

public interface ICiudadanoRepository {

	public Ciudadano seleccionar(Integer id);

	public void insertar(Ciudadano ciudadano);

	public void actualizar(Ciudadano ciudadano);

	public void eliminar(Integer id);

	public Empleado sellecionarPorCedula(String cedula);

	public Ciudadano seleccionarPorCedulaCiud(String cedula);

	public Ciudadano seleccionarPorNombre(String nombre);

	public Ciudadano seleccionarPorApellido(String apellido);

	public Ciudadano seleccionarPorCodigo(String codigo);

	public Ciudadano seleccionarPorFechaNacimiento(LocalDateTime fechaNacimiento);

	public Ciudadano seleccionarPorEstatura(String estatura);

	public Ciudadano seleccionarPorPeso(String peso);

	public Ciudadano seleccionarPorGenero(String genero);

	public Ciudadano seleccionarPorEmpleo(String empleo);

	public Ciudadano seleccionarPorApe(String apellido);

	// Funcionalidad que cuando sea el ciudadano de Pichincha lo busque por nombre
	// Cuando sea de Cotopaxi lo busque por apellido
	// Cuando No sea ni de Cotopaxi ni de Pichincha lo busque por cedula
	public Ciudadano seleccionarPorCriteria(String nombre, String apellido, String cedula);

	public Ciudadano seleccionarPorCriteriaAndOr(String nombre, String apellido, String cedula);
}

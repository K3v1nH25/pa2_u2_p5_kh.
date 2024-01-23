package com.uce.edu.service;

import java.time.LocalDateTime;

import com.uce.edu.repository.modelo.Ciudadano;
import com.uce.edu.repository.modelo.Empleado;

public interface ICiudadanoService {
	public Ciudadano buscar(Integer id);

	public void guardar(Ciudadano ciudadano);

	public void actualizar(Ciudadano ciudadano);

	public void borrar(Integer id);

	public Empleado buscarPorCedula(String cedula);

	public Ciudadano buscarPorCedulaCiu(String cedula);

	public Ciudadano buscarPorNombre(String nombre);

	public Ciudadano buscarPorApellido(String apellido);

	public Ciudadano buscarPorCodigo(String codigo);

	public Ciudadano buscarPorFechaNacimiento(LocalDateTime fechaNacimiento);

	public Ciudadano buscarPorEstatura(String estatura);

	public Ciudadano buscarPorPeso(String peso);

	public Ciudadano buscarPorGenero(String genero);

	public Ciudadano buscarPorEmpleo(String empleo);

	public Ciudadano buscarPorApe(String apellido);

	public Ciudadano buscarPorCriteria(String nombre, String apellido, String cedula);

	public Ciudadano buscarPorCriteriaAndOr(String nombre, String apellido, String cedula);
}

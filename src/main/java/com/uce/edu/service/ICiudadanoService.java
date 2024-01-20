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

	public Empleado buscarPorNombre(String nombre);

	public Ciudadano buscarPorApellido(String apellido);

	public Empleado buscarPorCodigo(String codigo);

	public Ciudadano buscarPorFechaNacimiento(LocalDateTime fechaNacimiento);

	public Empleado buscarPorEstatura(String estatura);

	public Ciudadano buscarPorPeso(String peso);

	public Empleado buscarPorGenero(String genero);

	public Ciudadano buscarPorEmpleo(String empleo);

}

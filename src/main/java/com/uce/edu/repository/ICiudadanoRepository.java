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

	public Empleado seleccionarPorNombre(String nombre);

	public Ciudadano seleccionarPorApellido(String apellido);

	public Empleado seleccionarPorCodigo(String codigo);

	public Ciudadano seleccionarPorFechaNacimiento(LocalDateTime fechaNacimiento);

	public Empleado seleccionarPorEstatura(String estatura);

	public Ciudadano seleccionarPorPeso(String peso);

	public Empleado seleccionarPorGenero(String genero);

	public Ciudadano seleccionarPorEmpleo(String empleo);

}

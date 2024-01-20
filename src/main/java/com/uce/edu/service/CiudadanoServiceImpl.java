package com.uce.edu.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repository.ICiudadanoRepository;
import com.uce.edu.repository.modelo.Ciudadano;
import com.uce.edu.repository.modelo.Empleado;

@Service
public class CiudadanoServiceImpl implements ICiudadanoService {

	@Autowired
	private ICiudadanoRepository ciudadanoRepository;

	@Override
	public void guardar(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
		this.ciudadanoRepository.insertar(ciudadano);

	}

	@Override
	public Ciudadano buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.ciudadanoRepository.seleccionar(id);
	}

	@Override
	public void actualizar(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
		this.ciudadanoRepository.actualizar(ciudadano);

	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.ciudadanoRepository.eliminar(id);

	}

	@Override
	public Empleado buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.ciudadanoRepository.sellecionarPorCedula(cedula);
	}

	@Override
	public Ciudadano buscarPorCedulaCiu(String cedula) {
		// TODO Auto-generated method stub
		return this.ciudadanoRepository.seleccionarPorCedulaCiud(cedula);
	}

	@Override
	public Ciudadano buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.ciudadanoRepository.seleccionarPorNombre(nombre);
	}

	@Override
	public Ciudadano buscarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		return this.ciudadanoRepository.seleccionarPorApellido(apellido);
	}

	@Override
	public Ciudadano buscarPorCodigo(String codigo) {
		// TODO Auto-generated method stub
		return this.ciudadanoRepository.seleccionarPorCodigo(codigo);
	}

	@Override
	public Ciudadano buscarPorFechaNacimiento(LocalDateTime fechaNacimiento) {
		// TODO Auto-generated method stub
		return this.ciudadanoRepository.seleccionarPorFechaNacimiento(fechaNacimiento);
	}

	@Override
	public Ciudadano buscarPorEstatura(String estatura) {
		// TODO Auto-generated method stub
		return this.ciudadanoRepository.seleccionarPorEstatura(estatura);
	}

	@Override
	public Ciudadano buscarPorPeso(String peso) {
		// TODO Auto-generated method stub
		return this.ciudadanoRepository.seleccionarPorPeso(peso);
	}

	@Override
	public Ciudadano buscarPorGenero(String genero) {
		// TODO Auto-generated method stub
		return this.ciudadanoRepository.seleccionarPorGenero(genero);
	}

	@Override
	public Ciudadano buscarPorEmpleo(String empleo) {
		// TODO Auto-generated method stub
		return this.ciudadanoRepository.seleccionarPorEmpleo(empleo);
	}

}

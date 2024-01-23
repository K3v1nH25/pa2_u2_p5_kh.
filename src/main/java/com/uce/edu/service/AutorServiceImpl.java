package com.uce.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repository.IAutorRepository;
import com.uce.edu.repository.modelo.Autor;

@Service
public class AutorServiceImpl implements IAutorService {

	@Autowired
	private IAutorRepository iAutorRepository;

	@Override
	public Autor buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iAutorRepository.seleccionar(id);
	}

	@Override
	public void guardar(Autor autor) {
		// TODO Auto-generated method stub
		this.iAutorRepository.insertar(autor);

	}

	@Override
	public void actualizar(Autor autor) {
		// TODO Auto-generated method stub
		this.iAutorRepository.actualizar(autor);

	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.iAutorRepository.eliminar(id);

	}

	@Override
	public Autor buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.iAutorRepository.seleccionarPorNombre(nombre);
	}

	@Override
	public Autor buscarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		return this.iAutorRepository.seleccionarPorApellido(apellido);
	}

	@Override
	public Autor buscarPorEditorial(String editorial) {
		// TODO Auto-generated method stub
		return this.iAutorRepository.seleccionarPorEditorial(editorial);
	}

	@Override
	public Autor buscarPorNumeroPremios(String numeroPremios) {
		// TODO Auto-generated method stub
		return this.iAutorRepository.seleccionarPorNumeroPremios(numeroPremios);
	}

	@Override
	public Autor buscarPorNacionalidad(String nacionalidad) {
		// TODO Auto-generated method stub
		return this.iAutorRepository.seleccionarPorNacionalidad(nacionalidad);
	}

}

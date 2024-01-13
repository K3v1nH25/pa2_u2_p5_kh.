package com.uce.edu.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repository.ILibroRepository;
import com.uce.edu.repository.modelo.Libro;
import com.uce.edu.repository.modelo.Libro2;

@Service
public class LibroServiceImpl implements ILibroService {

	@Autowired
	private ILibroRepository ilibroRepository;

	@Override
	public Libro2 buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardar(Libro2 libro2) {
		// TODO Auto-generated method stub
		this.ilibroRepository.insertar(libro2);

	}

	@Override
	public void actualizar(Libro2 libro2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Libro buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.ilibroRepository.seleccionarPorNombre(nombre);
	}

	@Override
	public List<Libro> buscarPorFecha(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		return this.ilibroRepository.seleccionarPorFechaPublicacion(fecha);
	}

	@Override
	public Libro buscarPorTitulo(String titulo) {
		// TODO Auto-generated method stub
		return this.ilibroRepository.seleccionarPorTitulo(titulo);
	}

	@Override
	public List<Libro> buscarPorFechaPubli(LocalDateTime fechaPublicacion) {
		// TODO Auto-generated method stub
		return this.ilibroRepository.seleccionarPorFecha(fechaPublicacion);
	}

	@Override
	public Libro buscarPorTituloNamed(String titulo) {
		// TODO Auto-generated method stub
		return this.ilibroRepository.SeleccionarPorTituloNamed(titulo);
	}

	@Override
	public List<Libro> buscarPorFechaPubliNamed(LocalDateTime fechaPublicacion) {
		// TODO Auto-generated method stub
		return this.ilibroRepository.seleccionarPorFechaNamed(fechaPublicacion);
	}

}

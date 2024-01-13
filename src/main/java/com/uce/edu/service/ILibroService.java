package com.uce.edu.service;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.repository.modelo.Libro;
import com.uce.edu.repository.modelo.Libro2;

public interface ILibroService {

	public Libro2 buscar(Integer id);

	public void guardar(Libro2 libro2);

	public void actualizar(Libro2 libro2);

	public void borrar(Integer id);

	public Libro buscarPorNombre(String nombre);

	public List<Libro> buscarPorFecha(LocalDateTime fecha);

	public Libro buscarPorTitulo(String titulo);

	public List<Libro> buscarPorFechaPubli(LocalDateTime fechaPublicacion);

	public Libro buscarPorTituloNamed(String titulo);

	public List<Libro> buscarPorFechaPubliNamed(LocalDateTime fechaPublicacion);

}

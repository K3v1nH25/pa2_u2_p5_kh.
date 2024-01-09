package com.uce.edu.repository;

import com.uce.edu.repository.modelo.Libro;
import com.uce.edu.repository.modelo.Libro2;

public interface ILibroRepository {

	public Libro2 seleccionar(Integer id);

	public void insertar(Libro2 libro2);

	public void actualizar(Libro2 libro2);

	public void eliminar(Integer id);

	public Libro seleccionarPorNombre(String nombre);

}

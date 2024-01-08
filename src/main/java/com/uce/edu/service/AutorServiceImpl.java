package com.uce.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repository.IAutorRepository;
import com.uce.edu.repository.modelo.Autor;

@Service
public class AutorServiceImpl implements IAutorService {

	@Autowired
	private IAutorRepository iautorRepository;
	
	@Override
	public Autor buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iautorRepository.seleccionar(id);
	}

	@Override
	public void guardar(Autor autor) {
		// TODO Auto-generated method stub
		this.iautorRepository.insertar(autor);

	}

	@Override
	public void actualizar(Autor autor) {
		// TODO Auto-generated method stub
		this.iautorRepository.actualizar(autor);

	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.iautorRepository.eliminar(id);

	}

}

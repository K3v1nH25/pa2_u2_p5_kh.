package com.uce.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repository.IEmpleadoRepository;
import com.uce.edu.repository.modelo.Empleado;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService {
	
	@Autowired
	private IEmpleadoRepository iempleadoRepository;

	@Override
	public void guardar(Empleado empleado) {
		// TODO Auto-generated method stub
		this.iempleadoRepository.insertar(empleado);

	}

	@Override
	public Empleado buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iempleadoRepository.seleccionar(id);
	}

	@Override
	public void actualizar(Empleado empleado) {
		// TODO Auto-generated method stub
		this.iempleadoRepository.actualizar(empleado);
		
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.iempleadoRepository.eliminar(id);
		
	}

}

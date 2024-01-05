package com.uce.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repository.IHotelRepository;
import com.uce.edu.repository.modelo.Hotel;

@Service
public class HotelServiceImpl implements IHotelService {

	@Autowired
	private IHotelRepository ihotelRepository;

	@Override
	public Hotel buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.ihotelRepository.seleccionar(id);
	}

	@Override
	public void guardar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.ihotelRepository.insertar(hotel);

	}

	@Override
	public void actualizar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.ihotelRepository.actualizar(hotel);

	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.ihotelRepository.eliminar(id);

	}

}

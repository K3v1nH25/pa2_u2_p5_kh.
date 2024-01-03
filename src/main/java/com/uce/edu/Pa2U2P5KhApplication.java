package com.uce.edu;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.repository.modelo.Habitacion;
import com.uce.edu.repository.modelo.Hotel;
import com.uce.edu.service.IHotelService;

@SpringBootApplication
public class Pa2U2P5KhApplication implements CommandLineRunner {

	@Autowired
	private IHotelService hotelService;


	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5KhApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Hotel hote = new Hotel();
		hote.setDireccion("Colmena");
		hote.setNombre("el  mirador");
		
		Habitacion h1 = new Habitacion();
		h1.setClas("Presidencial");
		h1.setNumero("A1");
		h1.setHotel(hote);
		
		Habitacion h2 = new Habitacion();
		h2.setClas("Economico");
		h2.setNumero("A2");
		h2.setHotel(hote);
		
		List<Habitacion> habitaciones = new ArrayList<>();
		habitaciones.add(h1);
		habitaciones.add(h2);
		hote.setHabitaciones(habitaciones);
		
		this.hotelService.guardar(hote);
		

	}
}

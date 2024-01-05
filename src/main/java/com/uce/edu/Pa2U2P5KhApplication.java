package com.uce.edu;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.repository.modelo.Habitacion;
import com.uce.edu.repository.modelo.Hotel;
import com.uce.edu.service.IHabitacionService;
import com.uce.edu.service.IHotelService;

@SpringBootApplication
public class Pa2U2P5KhApplication implements CommandLineRunner {

	@Autowired
	private IHotelService hotelService;

	@Autowired
	private IHabitacionService habitacionService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5KhApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Habitacion habi4 = new Habitacion();
		habi4.setClas("Presidencial");
		habi4.setNumero("B1");
		
		Habitacion habi5 = new Habitacion();
		habi5.setClas("Economica");
		habi5.setNumero("B2");
		
		this.habitacionService.guardar(habi4);
		this.habitacionService.guardar(habi5);
		
		habi4.setNumero("B5");
		this.habitacionService.actualizar(habi4);
		
		this.habitacionService.borrar(5);

		Hotel hote = new Hotel();
		hote.setDireccion("La colmena");
		hote.setNombre("Casa Blanca");

		this.hotelService.guardar(hote);

		Habitacion habi = new Habitacion();
		habi.setClas("Presencial");
		habi.setNumero("A1");
		habi.setHotel(hote);

		Habitacion habi1 = new Habitacion();
		habi1.setClas("Economica");
		habi1.setNumero("A2");
		habi1.setHotel(hote);

		List<Habitacion> habitaciones = new ArrayList<>();
		habitaciones.add(habi1);
		habitaciones.add(habi);
		hote.setHabitaciones(habitaciones);

		this.hotelService.borrar(2);
		hote.setDireccion("La libertad");
		this.hotelService.actualizar(hote);
		
		this.hotelService.buscar(2);
		

	}
}

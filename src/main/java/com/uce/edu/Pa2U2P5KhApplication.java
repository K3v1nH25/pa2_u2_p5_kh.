package com.uce.edu;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.repository.modelo.Ciudadano;
import com.uce.edu.repository.modelo.Empleado;
import com.uce.edu.repository.modelo.Habitacion;
import com.uce.edu.repository.modelo.Hotel;
import com.uce.edu.service.ICiudadanoService;
import com.uce.edu.service.IEmpleadoService;
import com.uce.edu.service.IHotelService;

@SpringBootApplication
public class Pa2U2P5KhApplication implements CommandLineRunner {

	@Autowired
	private IEmpleadoService empleadoService;

	@Autowired
	private ICiudadanoService ciudadanoService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5KhApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Ciudadano ciud = new Ciudadano();
		ciud.setNombre("Karen");
		ciud.setApellido("Chica");

		Ciudadano ciud1 = new Ciudadano();
		ciud1.setNombre("Aylin");
		ciud1.setApellido("Hurtad");

		this.ciudadanoService.guardar(ciud);
		this.ciudadanoService.guardar(ciud1);
		
		Ciudadano ciud3 = new Ciudadano();
		ciud3.setApellido("Rivera");
		this.ciudadanoService.actualizar(ciud);
		
		this.ciudadanoService.borrar(1);

		Empleado empl = new Empleado();
		empl.setFechaIngreso(LocalDateTime.now());
		empl.setSalario(new BigDecimal(2500));
		empl.setCiudadano(ciud);

		Empleado empl1 = new Empleado();
		empl1.setFechaIngreso(LocalDateTime.now());
		empl1.setSalario(new BigDecimal(2000));
		empl1.setCiudadano(ciud1);


		this.empleadoService.guardar(empl);
		this.empleadoService.guardar(empl1);
		
		this.empleadoService.borrar(1);

	}
}

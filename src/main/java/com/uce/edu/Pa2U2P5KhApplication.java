package com.uce.edu;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.repository.modelo.Autor2;
import com.uce.edu.repository.modelo.AutorLibro;
import com.uce.edu.repository.modelo.Ciudadano;
import com.uce.edu.repository.modelo.Empleado;
import com.uce.edu.repository.modelo.Libro;
import com.uce.edu.repository.modelo.Libro2;
import com.uce.edu.service.ICiudadanoService;
import com.uce.edu.service.IEmpleadoService;
import com.uce.edu.service.ILibroService;

@SpringBootApplication
public class Pa2U2P5KhApplication implements CommandLineRunner {

	// 1. Query (JPQL-Lenguaje que permite realizar consultas orientados a objetos)
	// 1.1 TypeQuery (
	// 1.2 NameQuery

	// 2. Native Query
	// 3. Criteria API Query

	@Autowired
	private ICiudadanoService iCiudadanoService;

	@Autowired
	private IEmpleadoService empleadoService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5KhApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		/*
		 * Ciudadano ciud = new Ciudadano(); ciud.setNombre("Juan");
		 * ciud.setApellido("Hurtado"); ciud.setCedula("1724");
		 * 
		 * Empleado empleado = new Empleado(); empleado.setFechaIngreso(null);
		 * empleado.setSalario(new BigDecimal(550)); empleado.setCiudadano(ciud);
		 * 
		 * ciud.setEmpleado(empleado);
		 */

		Empleado empleado = this.iCiudadanoService.buscarPorCedula("1724693111");
		System.out.println(empleado);

		Ciudadano ciudadano = this.iCiudadanoService.buscarPorCedulaCiu("1724693111");
		System.out.println(ciudadano);

	}

}
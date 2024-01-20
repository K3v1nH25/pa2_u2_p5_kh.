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
		 * Ciudadano ciud = new Ciudadano(); ciud.setNombre("kevin");
		 * ciud.setApellido("Hurtado"); ciud.setCedula("1724"); ciud.setCodigo("1A");
		 * ciud.setFechaNacimeinto(LocalDateTime.of(1997, 9, 9, 10, 0));
		 * ciud.setEstatura("1.80"); ciud.setPeso("50"); ciud.setGenero("Masculino");
		 * ciud.setEmpleo("Jefe de bodega");
		 * 
		 * Ciudadano ciud2 = new Ciudadano(); ciud2.setNombre("Aylin");
		 * ciud2.setApellido("Mero"); ciud2.setCedula("1750"); ciud2.setCodigo("2B");
		 * ciud2.setFechaNacimeinto(LocalDateTime.of(2000, 6, 7, 8, 0));
		 * ciud2.setEstatura("1.50"); ciud2.setPeso("45"); ciud2.setGenero("Femenino");
		 * ciud2.setEmpleo("Jefe de caja");
		 * 
		 * this.iCiudadanoService.guardar(ciud); this.iCiudadanoService.guardar(ciud2);
		 */

		////////////////////////////////////////////

		Ciudadano ciudadano = this.iCiudadanoService.buscarPorCedulaCiu("1724");
		System.out.println(ciudadano);

		Ciudadano ciudadano2 = this.iCiudadanoService.buscarPorApellido("Mero");
		System.out.println(ciudadano2);

		Ciudadano ciudadano3 = this.iCiudadanoService.buscarPorFechaNacimiento(LocalDateTime.of(1997, 9, 9, 10, 0));
		System.out.println(ciudadano3);

		Ciudadano ciudadano4 = this.iCiudadanoService.buscarPorPeso("45");
		System.out.println(ciudadano4);

		Ciudadano ciudadano5 = this.iCiudadanoService.buscarPorEmpleo("Jefe de bodega");
		System.out.println(ciudadano5);

		Ciudadano ciudadano6 = this.iCiudadanoService.buscarPorNombre("Aylin");
		System.out.println(ciudadano6);

		Ciudadano ciudadano7 = this.iCiudadanoService.buscarPorCodigo("1A");
		System.out.println(ciudadano7);

		Ciudadano ciudadano8 = this.iCiudadanoService.buscarPorEstatura("1.80");
		System.out.println(ciudadano8);

		Ciudadano ciudadano9 = this.iCiudadanoService.buscarPorGenero("Femenino");
		System.out.println(ciudadano9);

	}

}
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

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5KhApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		// Criteria API Query
		Ciudadano ciud = this.iCiudadanoService.buscarPorApe("Hurtado");
		System.out.println(ciud);

		Ciudadano ciud1 = this.iCiudadanoService.buscarPorCriteria("kevin", "Hurtado", "1724");
		System.out.println(ciud1);

		Ciudadano ciud2 = this.iCiudadanoService.buscarPorCriteria("kevin", "Hurtado", "0522");
		System.out.println(ciud2);

		// Hibernate: select
		// c1_0.ciud_id,c1_0.ciud_apellido,c1_0.ciud_cedula,c1_0.ciud_codigo,c1_0.ciud_empleo,c1_0.ciud_estatura,c1_0.ciud_fecha_nacimeinto,c1_0.ciud_genero,c1_0.ciud_nombre,c1_0.ciud_peso
		// from ciudadano c1_0 where c1_0.ciud_nombre=?
		Ciudadano ciud3 = this.iCiudadanoService.buscarPorCriteria("kevin", "Hurtado", "1724");
		System.out.println(ciud3);

		System.out.println("Criteria API Query AND OR");

		// Hibernate: select
		// c1_0.ciud_id,c1_0.ciud_apellido,c1_0.ciud_cedula,c1_0.ciud_codigo,c1_0.ciud_empleo,c1_0.ciud_estatura,c1_0.ciud_fecha_nacimeinto,c1_0.ciud_genero,c1_0.ciud_nombre,c1_0.ciud_peso
		// from ciudadano c1_0 where c1_0.ciud_nombre=? or c1_0.ciud_apellido=?
		Ciudadano ciud4 = this.iCiudadanoService.buscarPorCriteriaAndOr("kevin", "Hurtado", "1724");
		System.out.println(ciud4);

		// Hibernate: select
		// c1_0.ciud_id,c1_0.ciud_apellido,c1_0.ciud_cedula,c1_0.ciud_codigo,c1_0.ciud_empleo,c1_0.ciud_estatura,c1_0.ciud_fecha_nacimeinto,c1_0.ciud_genero,c1_0.ciud_nombre,c1_0.ciud_peso
		// from ciudadano c1_0 where c1_0.ciud_nombre=? and c1_0.ciud_apellido=?
		Ciudadano ciud5 = this.iCiudadanoService.buscarPorCriteriaAndOr("kevin", "Hurtado", "0522");
		System.out.println(ciud5);

	}

}
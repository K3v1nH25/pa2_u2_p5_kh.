package com.uce.edu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.repository.modelo.Autor;
import com.uce.edu.service.IAutorService;

@SpringBootApplication
public class Pa2U2P5KhApplication implements CommandLineRunner {

	// 1. Query (JPQL-Lenguaje que permite realizar consultas orientados a objetos)
	// 1.1 TypeQuery (
	// 1.2 NameQuery

	// 2. Native Query
	// 3. Criteria API Query

	@Autowired
	private IAutorService iAutorService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5KhApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		/*
		 * Autor autor = new Autor(); autor.setNombre("Kevin");
		 * autor.setApellido("Hurtado"); autor.setEditorial("Planeta");
		 * autor.setNumeroPremios("Premio nobel"); autor.setNacionalidad("Ecuatoriano");
		 * this.iAutorService.guardar(autor);
		 * 
		 * Autor autor2 = new Autor(); autor2.setNombre("Aylin");
		 * autor2.setApellido("Mero"); autor2.setEditorial("Anagrama");
		 * autor2.setNumeroPremios("Premio Cervantes");
		 * autor2.setNacionalidad("Colombiano"); this.iAutorService.guardar(autor2);
		 */

		Autor auto = this.iAutorService.buscarPorNombre("Kevin");
		System.out.println(auto);

		Autor auto2 = this.iAutorService.buscarPorApellido("Mero");
		System.out.println(auto2);

		Autor auto3 = this.iAutorService.buscarPorEditorial("Planeta");
		System.out.println(auto3);

		Autor auto4 = this.iAutorService.buscarPorNumeroPremios("Premio Cervantes");
		System.out.println(auto4);

		Autor auto5 = this.iAutorService.buscarPorNacionalidad("Ecuatoriano");
		System.out.println(auto5);

	}

}
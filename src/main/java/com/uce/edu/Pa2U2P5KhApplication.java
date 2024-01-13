package com.uce.edu;

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
import com.uce.edu.repository.modelo.Libro;
import com.uce.edu.repository.modelo.Libro2;
import com.uce.edu.service.ILibroService;

@SpringBootApplication
public class Pa2U2P5KhApplication implements CommandLineRunner {

	// 1. Query (JPQL-Lenguaje que permite realizar consultas orientados a objetos)
	// 1.1 TypeQuery (
	// 1.2 NameQuery

	// 2. Native Query
	// 3. Criteria API Query

	@Autowired
	private ILibroService iLibroService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5KhApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		System.out.println("Query");
		List<Libro> lista = this.iLibroService.buscarPorFecha(LocalDateTime.of(2023, 1, 1, 7, 15));
		System.out.println(lista);
		for (Libro libro : lista) {
			System.out.println(libro);
		}
		System.out.println("TypedQuery");

		Libro libro = this.iLibroService.buscarPorTitulo("Java I");
		System.out.println(libro);

		List<Libro> lista2 = this.iLibroService.buscarPorFechaPubli(LocalDateTime.of(2023, 1, 1, 7, 15));
		for (Libro libro1 : lista2) {
			System.out.println(libro1);
		}

		System.out.println("NamedQuery");
		Libro li = this.iLibroService.buscarPorTitulo("Programacion I");
		System.out.println(li);

		List<Libro> lista3 = this.iLibroService.buscarPorFechaPubliNamed(LocalDateTime.of(2023, 1, 1, 6, 15));
		for (Libro libro1 : lista3) {
			System.out.println(libro1);
		}

	}

}
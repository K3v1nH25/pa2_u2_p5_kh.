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

	@Autowired
	private ILibroService iLibroService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5KhApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		// Un libro que tiene dos autores

		Libro2 libro = new Libro2();
		libro.setTitulo("Java");
		libro.setFechaPublicacion(LocalDateTime.now());

		Autor2 autor = new Autor2();
		autor.setNacionalidad("Ecuatoriano");
		autor.setNombre("Pepito Perez");

		Autor2 autor2 = new Autor2();
		autor2.setNacionalidad("Ecuatoriano");
		autor2.setNombre("Kevin hurtado");

		List<Autor2> autores = new ArrayList<Autor2>();
		autores.add(autor);
		autores.add(autor2);

		AutorLibro autorLibro = new AutorLibro();
		autorLibro.setLibro2(libro);
		autorLibro.setAutor2(autor);
		autorLibro.setFecha(LocalDateTime.now());

		AutorLibro autorLibro2 = new AutorLibro();
		autorLibro2.setLibro2(libro);
		autorLibro2.setAutor2(autor2);
		autorLibro2.setFecha(LocalDateTime.now());

		List<AutorLibro> lista = new ArrayList<>();
		lista.add(autorLibro);
		lista.add(autorLibro2);

		libro.setAutoresLibros(lista);

		// this.iLibroService.guardar(libro);

		Libro libroFinal = this.iLibroService.buscarPorNombre("Java");
		System.out.println(libroFinal);

	}
}

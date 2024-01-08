package com.uce.edu;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.repository.modelo.Autor;
import com.uce.edu.repository.modelo.Libro;
import com.uce.edu.service.IAutorService;
import com.uce.edu.service.ILibroService;

@SpringBootApplication
public class Pa2U2P5KhApplication implements CommandLineRunner {

	@Autowired
	private ILibroService iLibroService;
	
	@Autowired
	private IAutorService autorService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5KhApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Libro libro1 = new Libro();
		libro1.setFechaPublicacion(LocalDateTime.now());
		libro1.setTitulo("Programacion Avanzada");
		
		this.iLibroService.guardar(libro1);
		this.iLibroService.buscar(1);
		
		libro1.setFechaPublicacion(LocalDateTime.of(2024, 1, 3, 12, 20));
		this.iLibroService.actualizar(libro1);
		
		this.iLibroService.borrar(7);
		
		Autor autor3 = new Autor();
		autor3.setNacionalidad("Peruano");
		autor3.setNombre("Jorge luna");
		
		this.autorService.guardar(autor3);
		
		autor3.setNacionalidad("Colombiano");
		this.autorService.actualizar(autor3);
		
		this.autorService.buscar(4);
		
		this.autorService.borrar(6);
		

		Libro libro = new Libro();
		libro.setTitulo("Java");
		libro.setFechaPublicacion(LocalDateTime.now());

		Autor autor = new Autor();
		autor.setNacionalidad("Ecuatoriano");
		autor.setNombre("Pepito Perez");

		Autor autor2 = new Autor();
		autor2.setNacionalidad("Ecuatoriano");
		autor2.setNombre("Kevin hurtado");

		Set<Autor> autores = new HashSet<>();
		autores.add(autor);
		autores.add(autor2);

		libro.setAutores(autores);

		Set<Libro> libros = new HashSet<>();
		libros.add(libro);

		autor.setLibro(libros);
		autor2.setLibro(libros);

		this.iLibroService.guardar(libro);

	}
}

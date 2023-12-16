package com.uce.edu;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.repository.modelo.Alumno;
import com.uce.edu.repository.modelo.Estudiante;
import com.uce.edu.service.IAlumnoService;
import com.uce.edu.service.IEstudianteService;

@SpringBootApplication
public class Pa2U2P5KhApplication implements CommandLineRunner {

	@Autowired
	private IEstudianteService iEstudianteService;
	
	@Autowired
	private IAlumnoService iAlumnoService;
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5KhApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//seleccionar
		Estudiante p1 = new Estudiante();
		p1.setNombre("David");
		p1.setApellido("Hurtado");
		p1.setCedula("1724693112");
		p1.setFechaNacimiento(LocalDateTime.of(1997, 07, 05, 12, 20));
		
		this.iEstudianteService.guardar(p1);
		
		//Buscar
		this.iEstudianteService.buscar(1);
		
		//Actualizar
		p1.setNombre("rafa");
		p1.setApellido("arriaga");
		p1.setCedula("12345");
		this.iEstudianteService.actualizar(p1);
		
		//Eliminar
		this.iEstudianteService.borrar(1);
		
		
		
		////////////////////////////////////////
		
		//seleccionar
		Alumno p2 = new Alumno();
		p2.setNombre("Diego");
		p2.setApellido("Vivas");
		p2.setEdad("20");
		
		this.iAlumnoService.guardar(p2);
		
		//Buscar
		this.iAlumnoService.buscar(1);
		
		//Actualizar
		p2.setNombre("kevin");
		p2.setApellido("hurtado");
		p2.setEdad("25");
		this.iAlumnoService.actualizar(p2);
		
		//Eliminar
		this.iAlumnoService.borrar(1);
	}
	
	

}

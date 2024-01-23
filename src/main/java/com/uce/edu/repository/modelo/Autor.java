package com.uce.edu.repository.modelo;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "autor")
public class Autor {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_autor")
	@SequenceGenerator(name = "seq_autor", sequenceName = "seq_autor", allocationSize = 1)
	@Column(name = "auto_id")
	private Integer id;

	@Column(name = "auto_nombre")
	private String nombre;

	@Column(name = "auto_apellido")
	private String apellido;

	@Column(name = "auto_editorial")
	private String editorial;

	@Column(name = "auto_numero_premios")
	private String numeroPremios;

	@Column(name = "auto_nacionalidad")
	private String nacionalidad;

	@OneToOne(mappedBy = "autor")
	private Libro libro;

	// set y get

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getNumeroPremios() {
		return numeroPremios;
	}

	public void setNumeroPremios(String numeroPremios) {
		this.numeroPremios = numeroPremios;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	@Override
	public String toString() {
		return "Autor [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", editorial=" + editorial
				+ ", numeroPremios=" + numeroPremios + ", nacionalidad=" + nacionalidad + ", libro=" + libro + "]";
	}

}

package com.uce.edu.repository.modelo;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "ciudadano")
public class Ciudadano {
	@Column(name = "ciud_id")
	@Id
	@SequenceGenerator(name = "seq_ciudadano", sequenceName = "seq_ciudadano", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_ciudadano")
	private Integer id;

	@Column(name = "ciud_nombre")
	private String nombre;

	@Column(name = "ciud_apellido")
	private String apellido;

	@Column(name = "ciud_cedula")
	private String cedula;

	@Column(name = "ciud_codigo")
	private String codigo;

	@Column(name = "ciud_fecha_nacimeinto")
	private LocalDateTime fechaNacimeinto;

	@Column(name = "ciud_estatura")
	private String estatura;

	@Column(name = "ciud_peso")
	private String peso;

	@Column(name = "ciud_genero")
	private String genero;

	@Column(name = "ciud_empleo")
	private String empleo;

	@OneToOne(mappedBy = "ciudadano")
	private Empleado empleado;

	// getters and setters

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

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public LocalDateTime getFechaNacimeinto() {
		return fechaNacimeinto;
	}

	public void setFechaNacimeinto(LocalDateTime fechaNacimeinto) {
		this.fechaNacimeinto = fechaNacimeinto;
	}

	public String getEstatura() {
		return estatura;
	}

	public void setEstatura(String estatura) {
		this.estatura = estatura;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEmpleo() {
		return empleo;
	}

	public void setEmpleo(String empleo) {
		this.empleo = empleo;
	}

	@Override
	public String toString() {
		return "Ciudadano [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula
				+ ", codigo=" + codigo + ", fechaNacimeinto=" + fechaNacimeinto + ", estatura=" + estatura + ", peso="
				+ peso + ", genero=" + genero + ", empleo=" + empleo + ", empleado=" + empleado + "]";
	}

	////
}
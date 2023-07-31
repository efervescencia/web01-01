package com.openwebinars.spring.modelo;

public class Empleado {
	
	private Long id;
	private String nombre;
	private String apellido;
	private String telefono;
	private Boolean directivo;
	
	
	public Empleado(Long id, String nombre, String apellido, String telefono, Boolean directivo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.directivo = directivo;
	}
	
	public Empleado() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Boolean getDirectivo() {
		return directivo;
	}

	public void setDirectivo(Boolean directivo) {
		this.directivo = directivo;
	}
	
	

}

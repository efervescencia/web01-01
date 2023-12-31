package com.openwebinars.spring.servicios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.openwebinars.spring.modelo.Empleado;

import jakarta.annotation.PostConstruct;

@Service
public class EmpleadoService {
	
	private List<Empleado> listaEmpleados = new ArrayList<>();
	
	public List<Empleado> findAll(){
		System.out.println("TAMAÑO DE LISTAEMPLEADOS: "+this.listaEmpleados.size());
		return this.listaEmpleados;
	}
	
	public void add(Empleado nuevoEmpleado) {
		this.listaEmpleados.add(nuevoEmpleado);
	}
	
	@PostConstruct
	public void init() {
		Empleado empleado1 = new Empleado(1L, "Julio", "Montero", "944400001", Boolean.FALSE);
		Empleado empleado2 = new Empleado(2L, "Manolo", "Jimenez", "944400002", Boolean.FALSE);
		Empleado empleado3 = new Empleado(3L, "Jefe", "Jefaced", "944400003", Boolean.TRUE);
		Empleado empleado4 = new Empleado(4L, "Albertin", "Culebrin", "944400004", Boolean.FALSE);
		listaEmpleados.add(empleado1);
		listaEmpleados.add(empleado2);
		listaEmpleados.add(empleado3);
		listaEmpleados.add(empleado4);
	}

	public Empleado find(long id) {
		// TODO Auto-generated method stub
		boolean encontrado=false;
		int indice = 0;
		Empleado empleado = null;
		
		while(!encontrado && indice < listaEmpleados.size()) {
			empleado = listaEmpleados.get(indice);
			if(empleado.getId() == id) {
				encontrado = true;
			}
			indice++;
		}
		return empleado;
	}

	public Empleado update(Empleado empleado) {
		// TODO Auto-generated method stub
		boolean encontrado=false;
		int indice = 0;
		Empleado empleadoAntiguo = null;
		
		while(!encontrado && indice < listaEmpleados.size()) {
			empleadoAntiguo = listaEmpleados.get(indice);
			if(empleadoAntiguo.getId() == empleado.getId()) {
				encontrado = true;
				listaEmpleados.set(indice, empleado);
			}
			
		}
		return empleado;
	}
	
}

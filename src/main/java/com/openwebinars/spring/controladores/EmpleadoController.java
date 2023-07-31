package com.openwebinars.spring.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.openwebinars.spring.modelo.Empleado;
import com.openwebinars.spring.servicios.EmpleadoService;

@Controller
public class EmpleadoController {
	
	@Autowired
	private EmpleadoService servicio;
	
	@GetMapping( {"/" , "/empleado/list"} )
	public String listado(Model model) {
		model.addAttribute("listaEmpleados", servicio.findAll());
		
		return "listado";
	}
	
	@GetMapping( "/empleado/new" )
	public String nuevoEmpleado(Model model) {
		Empleado empleado = new Empleado();
		model.addAttribute("empleadoForm", empleado);
		
		return "formularioEmpleado";
	}
	
	
	@PostMapping( "/empleado/new/submit")
	public String nuevoEmpleadoSubmit(@ModelAttribute("empleadoForm") Empleado nuevoEmpleado) {
		servicio.add(nuevoEmpleado);
		return "redirect:/empleado/list";
	}
	

}
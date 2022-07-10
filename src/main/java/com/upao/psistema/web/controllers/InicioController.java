package com.upao.psistema.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InicioController {

	//Recibe petición Inicial
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/inicio.htm")
	public ModelAndView manejadorVistaInicial() {
		return new ModelAndView("inicio");		
	}
	
	@GetMapping(value="/inicio.do")
	public String mostrarVistaInicial() {
		return "master";
	}
}

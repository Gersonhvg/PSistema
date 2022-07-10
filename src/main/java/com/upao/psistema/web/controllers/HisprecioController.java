package com.upao.psistema.web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.upao.psistema.business.services.HisprecioService;

@Controller
public class HisprecioController {

	@Autowired
	HisprecioService hisprecioService;
	
	@RequestMapping(value="/listarprecios.do")
	public ModelAndView mostrarPreciosProductoxId(@RequestParam(value="id") Integer idProducto)
	{
		System.out.println(idProducto);
		
		Map<String,Object> precioModel=new HashMap<String, Object>();
		
		precioModel.put("precioshis", hisprecioService.mostrarPreciosProducto(idProducto));
		
		return new ModelAndView("lstprecioshis","model",precioModel);
	}
}

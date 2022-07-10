package com.upao.psistema.web.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.upao.psistema.business.entities.Producto;
import com.upao.psistema.business.services.ProductoService;

@Controller
@RequestMapping(path="/productos")
public class ProductoController {
	
	protected final Log logger=LogFactory.getLog(getClass());
	
	@Autowired
	private ProductoService productoService;
		
	@RequestMapping(value = "/productos.htm")
	public ModelAndView ListadorProductos() {
		
		//enviar los datos de los productos hacia la vista
		Map<String,Object> productoModel=new HashMap<String, Object>();
		
		productoModel.put("productos", this.productoService.ListarProductosActivos());		
		logger.info("Resolviendo la lista de productos.");
		logger.info(productoModel);
		//devolver a la vista
		return new ModelAndView("lstproductos","model",productoModel);
		//return new ModelAndView("lstproductos");
	}
	
	@GetMapping(value="/mostrar")
	public String mostrarProductos(Model model){
		model.addAttribute("productos", this.productoService.ListarProductosActivos());
		//respuesta a una vista
		return "productos/ver_productos";
	}
	
	@GetMapping(value="/agregar")
	public String agregarProducto(Model model) {
		model.addAttribute("producto",new Producto());
		return "productos/agregar_producto";
	}
	
	@PostMapping(value="/agregar")
	public String guardarProducto(@ModelAttribute @Valid Producto producto, BindingResult bindingResult,RedirectAttributes redirectAttributes) {
		if(bindingResult.hasErrors())
		{
			return "productos/agregar_producto";
		}
		//validación de algún campo previo al registro aqui!!!!
		if(productoService.validarDescripcionProducto(producto.getDescripcion())) {
			redirectAttributes
			.addFlashAttribute("mensaje","Ya existe un producto con esa descripción")
			.addFlashAttribute("clase","warning");
			return "redirect:/productos/agregar";
		}
		
		//graba
		boolean resp=productoService.guardarProducto(producto);
		//tratamiento del mensaje de respuesta
		if (resp) {
		redirectAttributes
		.addFlashAttribute("mensaje","Producto grabado correctamente")
		.addFlashAttribute("clase", "success");
		}
		else {
			redirectAttributes
			.addFlashAttribute("mensaje","Ocurrió un error en la operación")
			.addFlashAttribute("clase","danger");
		}
		
		return "redirect:/productos/agregar"; 
		
	}

}

package com.upao.psistema.business.services;

import java.util.List;

import com.upao.psistema.business.entities.Producto;

public interface ProductoService {

	public List<Producto> ListarProductosActivos();
	
	public boolean validarDescripcionProducto(String descripcion);
	
	public boolean guardarProducto(Producto producto);
}

package com.upao.psistema.business.services;

import java.util.List;

import com.upao.psistema.business.entities.Hisprecio;

public interface HisprecioService {

	List<Hisprecio> mostrarPreciosProducto(Integer idProducto);
}

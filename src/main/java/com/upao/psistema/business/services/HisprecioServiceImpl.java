package com.upao.psistema.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upao.psistema.business.entities.Hisprecio;
import com.upao.psistema.business.repositories.HisprecioJpaRepository;

@Service
public class HisprecioServiceImpl implements HisprecioService {

	@Autowired
	HisprecioJpaRepository hisPrecioRepository;
	
	@Override
	public List<Hisprecio> mostrarPreciosProducto(Integer idProducto) {	
		return hisPrecioRepository.buscarPrecioshistoricos(idProducto);
	}

}

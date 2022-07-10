package com.upao.psistema.business.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.upao.psistema.business.entities.Producto;

@Repository
public interface ProductoJpaRepository extends JpaRepository<Producto, Integer>{
	Producto findFirstByDescripcion(String descripcion);
}

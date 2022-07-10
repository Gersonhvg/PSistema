package com.upao.psistema.business.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.upao.psistema.business.entities.Hisprecio;

@Repository
public interface HisprecioJpaRepository extends JpaRepository<Hisprecio, Integer> {

	@Query(value="Select h from Hisprecio h where h.producto.id = :idProd")
	List<Hisprecio> buscarPrecioshistoricos(@Param("idProd") Integer idProducto);
}

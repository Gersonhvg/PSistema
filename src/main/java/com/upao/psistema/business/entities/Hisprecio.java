package com.upao.psistema.business.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="hisprecios")
@Getter
@Setter
@ToString
public class Hisprecio implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id")
	private Integer id;
	
	@Column(name="precio")
	private Double precio;
	
	@ManyToOne
	@JoinColumn(name="id_producto", referencedColumnName = "id")
	private Producto producto;
}

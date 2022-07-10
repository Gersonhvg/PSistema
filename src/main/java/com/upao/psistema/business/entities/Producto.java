package com.upao.psistema.business.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="productos")
@Getter
@Setter
@ToString
public class Producto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//Atributos
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	
	@Column(name="descripcion")
	@NotNull(message="Debe de especificar la descripción")
	@Size(min=5,max=250, message="La descripción debe medir entre 5 y 250")
	private String descripcion;
	
	@Column(name="precio")
	@NotNull(message="Debe de especificar el precio")
	@Min(value=0, message="El precio minimo es 0")
	private Double precio;	

}

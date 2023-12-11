package com.example.demo.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "publicacion")
public class PublicacionModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long idpublicacion;
	private String titulo;
	private String descripcion;
	private Integer num_contacto; 
	private Integer num_habitaciones; 
	private String imagenreferencial; 
	private Integer num_banios; 
	private Integer disponible;
	private Integer mascotas;
	public Long getIdpublicacion() {
		return idpublicacion;
	}
	public void setIdpublicacion(Long idpublicacion) {
		this.idpublicacion = idpublicacion;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Integer getNum_contacto() {
		return num_contacto;
	}
	public void setNum_contacto(Integer num_contacto) {
		this.num_contacto = num_contacto;
	}
	public Integer getNum_habitaciones() {
		return num_habitaciones;
	}
	public void setNum_habitaciones(Integer num_habitaciones) {
		this.num_habitaciones = num_habitaciones;
	}
	public String getImagenreferencial() {
		return imagenreferencial;
	}
	public void setImagenreferencial(String imagenreferencial) {
		this.imagenreferencial = imagenreferencial;
	}
	public Integer getNum_banios() {
		return num_banios;
	}
	public void setNum_banios(Integer num_banios) {
		this.num_banios = num_banios;
	}
	public Integer getDisponible() {
		return disponible;
	}
	public void setDisponible(Integer disponible) {
		this.disponible = disponible;
	}
	public Integer getMascotas() {
		return mascotas;
	}
	public void setMascotas(Integer mascotas) {
		this.mascotas = mascotas;
	}
	

}

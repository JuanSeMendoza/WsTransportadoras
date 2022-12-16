package com.melexa.tr.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="wstr_guias")
public class Transportadoras {

	@Id
	private int id;
	@Column
	private String idCompania;
	@Column
	private int idTransportadora;
	@Column
	private String documento;
	@Column
	private int idTipoDocumento;
	@Column
	private String datos;
	@Column(name= "fechaIngreso")
	private LocalDateTime fechaIngreso;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIdCompania() {
		return idCompania;
	}
	public void setIdCompania(String idCompania) {
		this.idCompania = idCompania;
	}
	public int getIdTransportadora() {
		return idTransportadora;
	}
	public void setIdTransportadora(int idTransportadora) {
		this.idTransportadora = idTransportadora;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public int getIdTipoDocumento() {
		return idTipoDocumento;
	}
	public void setIdTipoDocumento(int idTipoDocumento) {
		this.idTipoDocumento = idTipoDocumento;
	}
	public String getDatos() {
		return datos;
	}
	public void setDatos(String datos) {
		this.datos = datos;
	}
	public LocalDateTime getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(LocalDateTime fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
}

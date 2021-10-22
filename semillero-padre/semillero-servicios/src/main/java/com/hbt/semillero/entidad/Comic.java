package com.hbt.semillero.entidad;

import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.hbt.semillero.enums.EstadoEnum;
import com.hbt.semillero.enums.TematicaEnum;
/**
 * 
 * <b>Descripción:<b> Clase que determina el mapeo de la tabla COMIC de la BD BD_SEMILLERO
 * <b>Caso de Uso:<b> 
 * @author Julian Rodriguez
 * @version
 */
@Entity
@Table(name = "COMIC")
public class Comic implements Serializable{
	
	
	//id del comic
	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(allocationSize = 1, name = "COMIC_SCID_GENERATOR", sequenceName = "SEQ_COMIC")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "COMIC_SCID_GENERATOR")
	@Column(name = "SCID")
	private Long id;
	
	@Column(name = "SCNOMBRE")
	private String nombre;
	
	@Column(name = "SCEDITORIAL")
	private String editorial;
	
	@Column(name = "SCTEMATICA")
	@Enumerated( value = EnumType.STRING)
	private TematicaEnum tematicaEnum;
	
	@Column(name = "SCESTADO")
	@Enumerated( value = EnumType.STRING)
	private static EstadoEnum estadoEnum;
	
	@Column(name = "SCCOLECCION")
	private String coleccion;
	@Column(name = "SCNUMEROPAGINAS")
	private Integer numeroPaginas;
	@Column(name = "SCPRECIO")
	private BigDecimal precio;
	@Column(name = "SCAUTORES")
	private String autores;
	@Column(name = "SCCOLOR")
	private Boolean color;
	@Column(name = "SCFECHA_VENTA")
	private LocalDate fechaVenta;
	@Column(name = "SCESTADO")
	private String estado;
	@Column(name = "SCCANTIDAD")
	private Integer cantidad;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	public TematicaEnum getTematicaEnum() {
		return tematicaEnum;
	}
	
	public void setTematicaEnum(TematicaEnum tematicaEnum) {
		this.tematicaEnum = tematicaEnum;
	}
	public String getColeccion() {
		return coleccion;
	}
	public void setColeccion(String coleccion) {
		this.coleccion = coleccion;
	}
	public Integer getNumeroPaginas() {
		return numeroPaginas;
	}
	public void setNumeroPaginas(Integer numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	public String getAutores() {
		return autores;
	}
	public void setAutores(String autores) {
		this.autores = autores;
	}
	public Boolean getColor() {
		return color;
	}
	public void setColor(Boolean color) {
		this.color = color;
	}
	public LocalDate getFechaVenta() {
		return fechaVenta;
	}
	public void setFechaVenta(LocalDate fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	public Comic() {
		//constructor vacio
	}
	public static EstadoEnum getEstadoEnum() {
		return estadoEnum;
	}
	public void setEstadoEnum(EstadoEnum estadoEnum) {
		this.estadoEnum = estadoEnum;
	}
	@Override
	public String toString() {
		return "Comic [id=" + id + ", nombre=" + nombre + ", editorial=" + editorial + ", tematicaEnum=" + tematicaEnum
				+ ", estadoEnum=" + estadoEnum + ", coleccion=" + coleccion + ", numeroPaginas=" + numeroPaginas
				+ ", precio=" + precio + ", autores=" + autores + ", color=" + color + ", fechaVenta=" + fechaVenta
				+ ", estado=" + estado + ", cantidad=" + cantidad + "]";
	}

	

}

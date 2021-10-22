package com.hbt.semillero.entidad;

import java.math.BigDecimal;

import com.hbt.semillero.enums.TipoVehiculoEnum;

/**
 * 
 * <b>Descripción:<b> Clase que determina la representacion de las caracteristicas en comun de un vehiculo
 * <b>Caso de Uso:<b>  SEMILLERO 2021
 * @author Julian Rodriguez
 * @version
 */

public class Vehiculo {
	
	/**
	 * atributo que determina el color de un vehiculo
	 */
	private String color;
	private TipoVehiculoEnum tipoVehiculo;
	private int numeroLlantas;
	private int numeroAsientos;
	private boolean requiereLicencia;
	private BigDecimal precio;
	
	public Vehiculo() {
		//constructor vacio
	}
	
	public Vehiculo(String color, BigDecimal precio) {
		this.color = color;
		this.precio = precio;
		
		
		
	}
	
	/**
	 * 
	 * Metodo encargado de retornar el valor del atributo color
	 * @return  el color asociado a la clase
	 */

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}



	public TipoVehiculoEnum getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(TipoVehiculoEnum tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public int getNumeroLlantas() {
		return numeroLlantas;
	}

	public void setNumeroLlantas(int numeroLlantas) {
		this.numeroLlantas = numeroLlantas;
	}

	public int getNumeroAsientos() {
		return numeroAsientos;
	}

	public void setNumeroAsientos(int numeroAsientos) {
		this.numeroAsientos = numeroAsientos;
	}

	public boolean isRequiereLicencia() {
		return requiereLicencia;
	}

	public void setRequiereLicencia(boolean requiereLicencia) {
		this.requiereLicencia = requiereLicencia;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	@Override
	public String toString() {
		return "Vehiculo [color=" + color + ", tipoVehiculo=" + tipoVehiculo + ", numeroLlantas=" + numeroLlantas
				+ ", numeroAsientos=" + numeroAsientos + ", requiereLicencia=" + requiereLicencia + ", precio=" + precio
				+ "]";
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

}

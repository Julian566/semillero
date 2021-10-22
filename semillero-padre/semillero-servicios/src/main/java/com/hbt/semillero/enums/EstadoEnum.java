package com.hbt.semillero.enums;
/**
 * 
 * <b>Descripción:<b> Clase que determina la enumeracion de estados de un comic
 * <b>Caso de Uso:<b> 
 * @author Julian Rodriguez
 * @version
 */
public enum EstadoEnum {
	
	ACTIVO("enum.estado.activo"),
	INACTIVO("enum.estado.inactivo")
	;
	
	private String estado;
	
	EstadoEnum(String estado) {
		this.estado = estado;
	}
	
	public String getEstadoEnum() {
		return estado;
	}

}

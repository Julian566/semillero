package com.hbt.semillero.enums;
/**
 * 
 * <b>Descripción:<b> Clase que determina la enumeración para representar los tipos de temática
 * aceptados por un comic
 * <b>Caso de Uso:<b> 
 * @author Julian Rodriguez
 * @version
 */
public enum TematicaEnum {

	AVENTURAS("enum.tematica.aventuras"),
	BELICO("enum.tematica.belico"),
	DEPORTIVO("enum.tematica.deportivo"),
	FANTASTICO("enum.tematica.fantastico"),
	CIENCIA_FICCION("enum.tematica.cienciaFiccion"),
	HISTORICO("enum.tematica.historico"),
	HORROR("enum.tematica.horror"),
	HUMORISTICO("enum.tematica.humoristico")
	;
	
	private String descripcion;
	
	TematicaEnum(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
}

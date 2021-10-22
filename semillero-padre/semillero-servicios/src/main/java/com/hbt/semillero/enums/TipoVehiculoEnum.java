package com.hbt.semillero.enums;

public enum TipoVehiculoEnum {
	TERRESTRE("Terrestre",1),
	ACUATICO("acuatico",2),
	AEREO("aereo",3);
	
	private String tipo;
	private int identificador;
	
	TipoVehiculoEnum(String tipo, int identificador) {
		this.tipo =tipo;
		this.identificador =identificador;
	}
	
	public int getIdentificador() {
		return identificador;
	}

	public String getTipo() {
		return tipo;
	}

}

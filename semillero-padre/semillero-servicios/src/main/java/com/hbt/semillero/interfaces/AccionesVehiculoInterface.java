package com.hbt.semillero.interfaces;

import com.hbt.semillero.enums.TipoVehiculoEnum;

public interface AccionesVehiculoInterface {
    public int obtenerVelocidadMaxima();
	
	public Long obtenerPesoMaximoCarga();
	
	public boolean determinarTipoVehiculo(TipoVehiculoEnum tipoVehiculoEnum) throws Exception;
	
	public  default void acelerar() {
		System.out.println("El vehiculo ha iniciado acelerar");
	}

}

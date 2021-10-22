package com.hbt.semillero.entidad;

import com.hbt.semillero.enums.TipoVehiculoEnum;
import com.hbt.semillero.interfaces.AccionesVehiculoInterface;

public class Barco extends Vehiculo implements AccionesVehiculoInterface {
	
	private String nombreCapitan;
	private String puertoLlegada;
	
	public String getNombreCapitan() {
		return nombreCapitan;
	}
	public void setNombreCapitan(String nombreCapitan) {
		this.nombreCapitan = nombreCapitan;
	}
	public String getPuertoLlegada() {
		return puertoLlegada;
	}
	public void setPuertoLlegada(String puertoLlegada) {
		this.puertoLlegada = puertoLlegada;
	}
	
	@Override
	public int obtenerVelocidadMaxima() {
		// TODO Auto-generated method stub
		return 700;
	}

	@Override
	public Long obtenerPesoMaximoCarga() {
		// TODO Auto-generated method stub
		return 50L;
	}

	@Override
	public boolean determinarTipoVehiculo(TipoVehiculoEnum tipoVehiculoEnum) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}
	

}

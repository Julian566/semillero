package com.hbt.semillero.entidad;

import com.hbt.semillero.enums.TipoVehiculoEnum;
import com.hbt.semillero.interfaces.AccionesVehiculoInterface;

public class Bicicleta extends Vehiculo implements AccionesVehiculoInterface {
	
	private String tipoBicicleta;
	private boolean utilizaChalecoReflector;
	
	public String getTipoBicicleta() {
		return tipoBicicleta;
	}
	public void setTipoBicicleta(String tipoBicicleta) {
		this.tipoBicicleta = tipoBicicleta;
	}
	public boolean isUtilizaChalecoReflector() {
		return utilizaChalecoReflector;
	}
	public void setUtilizaChalecoReflector(boolean utilizaChalecoReflector) {
		this.utilizaChalecoReflector = utilizaChalecoReflector;
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

package com.hbt.semillero.entidad;

import com.hbt.semillero.enums.TipoVehiculoEnum;
import com.hbt.semillero.interfaces.AccionesVehiculoInterface;

public class Avion extends Vehiculo implements AccionesVehiculoInterface {

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
		
		if(getTipoVehiculo().getIdentificador()==(tipoVehiculoEnum.getIdentificador())) {
			return true;
		}else {
			throw new Exception("El tipo de vehiculo asignado es erroneo,debe ser aereo");	
			
		}
		// TODO Auto-generated method stub
		
	}

}

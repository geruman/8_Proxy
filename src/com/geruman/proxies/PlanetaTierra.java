package com.geruman.proxies;

public class PlanetaTierra implements Planeta {

	private Boolean destruido;
	private int cuadrante;
	private Double radioEnKilometros;
	public PlanetaTierra(int cuadrante, Double radioEnKilometros) {
		destruido = false;
		this.cuadrante = cuadrante;
		this.radioEnKilometros = radioEnKilometros;
	}
	
	public int getCuadrante() {
		return cuadrante;
	}

	public void setCuadrante(int cuadrante) {
		this.cuadrante = cuadrante;
	}

	public Double getRadioEnKilometros() {
		return radioEnKilometros;
	}

	public void setRadioEnKilometros(Double radioEnKilometros) {
		this.radioEnKilometros = radioEnKilometros;
	}

	@Override
	public Object getDescripcion() {
		if(destruido) {
			return "un planeta hecho trizas...";
		}
		return "un planeta";
	}

	@Override
	public Object destruir() {
		destruido = true;
		return "kaboom!";
	}

}

package com.geruman.proxies;

public class PlanetaProxy implements Planeta {
	private Planeta planetaTierra;
	public PlanetaProxy() {
		planetaTierra = new PlanetaTierra(8,65670d);
	}
	@Override
	public Object getDescripcion() {
		return planetaTierra.getDescripcion();
	}

	@Override
	public Object destruir() {
		return planetaTierra.destruir();
	}

}

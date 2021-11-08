package com.geruman;

import com.geruman.proxies.Planeta;
import com.geruman.proxies.PlanetaProxy;

public class ProxyDemoMain {

	public static void main(String[] args) {
		Planeta planeta = new PlanetaProxy();
		System.out.println(planeta.getDescripcion());
		System.out.println(planeta.destruir());
		System.out.println(planeta.getDescripcion());
	}
}

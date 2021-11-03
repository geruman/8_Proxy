package com.geruman.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.geruman.proxies.Planeta;
import com.geruman.proxies.PlanetaProxy;

class ProxiesTest {

	@Test
	void test() {
		Planeta planeta = new PlanetaProxy();
		assert "un planeta".equals(planeta.getDescripcion());
		assert "kaboom!".equals(planeta.destruir());
		assertEquals("un planeta hecho trizas...",planeta.getDescripcion());
	}

}

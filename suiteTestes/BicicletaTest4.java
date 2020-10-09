package suiteTestes;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import locacao.Bicicleta;

public class BicicletaTest4 {

	@Test
	public void testMarcarDisponibilidade() {
		Bicicleta bicicleta = new Bicicleta(false);
		assertEquals(true, bicicleta.marcarDisponibilidade());
	}

	@Test
	public void testMarcarIndisponibilidade() {
		Bicicleta bicicleta = new Bicicleta(true);
		assertEquals(false, bicicleta.marcarIndisponibilidade());
	}

}

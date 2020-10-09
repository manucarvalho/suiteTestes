package suiteTestes;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import financeiro.MovimentoLocacao;

public class MovimentoLocacaoTest4 {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalcularValorISS() {
		MovimentoLocacao movimentoLocacao1 = new MovimentoLocacao(20.0f);
		assertEquals(1, movimentoLocacao1.calcularValorISS());
		MovimentoLocacao movimentoLocacao2 = new MovimentoLocacao(15.0f);
		assertEquals(0.75, movimentoLocacao2.calcularValorISS());
		MovimentoLocacao movimentoLocacao3 = new MovimentoLocacao(25.0f);
		assertEquals(1.25, movimentoLocacao3.calcularValorISS());
	}

}

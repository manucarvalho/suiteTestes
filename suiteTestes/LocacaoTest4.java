package suiteTestes;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;

import locacao.Bicicleta;
import locacao.Locacao;

public class LocacaoTest4 {

	SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
	
	@Test
	public void testRegistrarLocacao() throws ParseException {
		Bicicleta bicicleta = new Bicicleta();
		Locacao locacao = new Locacao();
		assertEquals("Id locação: 1 data: 08/10/2020 hora inicio: 8 bicicleta: 0", 
				locacao.registrarLocacao(sdf.parse("08/10/2020"), 8 , bicicleta));
	}

	@Test
	public void testRegistrarDevolucao() throws ParseException {
		Bicicleta bicicleta = new Bicicleta(21, "bike", 'D', 4.0f, true);
		Locacao locacao = new Locacao(1, sdf.parse("08/10/2020"), bicicleta, 8, 10);
		float valorLocacao = locacao.registrarDevolucao(10);
		assertTrue(8.0f == valorLocacao);
	}

}

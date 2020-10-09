package financeiro;

import java.util.Date;

import locacao.Locacao;

public class MovimentoLocacao {

	private int id;
	private Date data;
	private Locacao locacao;
	private float valor;
	private float valorISS;
	
	public MovimentoLocacao(float valor) {
		this.valor = valor;
	}
	
	public MovimentoLocacao(int id, Date data, Locacao locacao, float valor) {
		this.id = id;
		this.data = data;
		this.locacao = locacao;
		this.valor = valor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Locacao getLocacao() {
		return locacao;
	}

	public void setLocacao(Locacao locacao) {
		this.locacao = locacao;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public float getValorISS() {
		return valorISS;
	}

	public float calcularValorISS() {
		valorISS = (float) (0.05 * valor);
		return valorISS;
	}
}

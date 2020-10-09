package locacao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Locacao {
	
	SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
	
	private int idLocacao;
	private Date data;
	private Bicicleta bicicleta;
	private int horaInicio;
	private int horaFinal;
	private float valorLocacao;
	
	public Locacao(int idLocacao, Date data, Bicicleta bicicleta, int horaInicio, int horaFinal) {
		this.idLocacao = idLocacao;
		this.data = data;
		this.bicicleta = bicicleta;
		this.horaInicio = horaInicio;
		this.horaFinal = horaFinal;
		this.valorLocacao = registrarDevolucao(horaFinal);
	}
	
	public Locacao() {
		this.idLocacao = 1;
	}
	
	public int getIdLocacao() {
		return idLocacao;
	}

	public void setIdLocacao(int idLocacao) {
		this.idLocacao = idLocacao;
	}

	public Date getData() {
		return data;
	}

	public Bicicleta getBicicleta() {
		return bicicleta;
	}

	public void setBicicleta(Bicicleta bicicleta) {
		this.bicicleta = bicicleta;
	}

	public int getHoraInicio() {
		return horaInicio;
	}

	public int getHoraFinal() {
		return horaFinal;
	}

	public float getValorLocacao() {
		return valorLocacao;
	}
	
	public void setHoraFinal(int horaFinal) {
		this.horaFinal = horaFinal;
	}

	public String registrarLocacao(Date data, int horaInicio, Bicicleta bicicleta) {
		Locacao locacao = new Locacao();
		locacao.data = data;
		locacao.horaInicio = horaInicio;
		locacao.bicicleta = bicicleta;
		return locacao.toString();
	}
	
	public float registrarDevolucao(int horaFinal) {
		setHoraFinal(horaFinal);
		int intervaloTempo = horaFinal - horaInicio;
		valorLocacao = intervaloTempo * bicicleta.getValorLocacaoHora();
		return valorLocacao;
	}
	
	public String toString() {
		return "Id locação: " +
				idLocacao +
				" data: " +
				sdf.format(data) +
				" hora inicio: " +
				horaInicio +
				" bicicleta: " +
				bicicleta.getId();
	}
}

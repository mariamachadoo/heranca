package atividade16_10;

public class Dentista extends ProfissionalSaude {

	private String cro;

	public Dentista(String nome, String especialidade, int valorConsulta) {
		super(nome, especialidade, valorConsulta);
		this.cro = cro;
	}
	@Override
	public void agendarConsulta() {


	}

	public void exibir() {
		super.exibir();
		System.out.println("Cro: " +cro);

	}
}
package atividade16_10;

public abstract class ProfissionalSaude {

	protected String nome;
	protected String especialidade;
	protected int valorConsulta;

	public ProfissionalSaude(String nome, String especialidade, int valorConsulta) {
		super();
		this.nome = nome;
		this.especialidade = especialidade;
		this.valorConsulta = valorConsulta;
	}

	public abstract void agendarConsulta();

	public void exibir () {
		System.out.println("Nome: " +nome+ "Especialidade: " +especialidade+ "Valor Consulta: " +valorConsulta);
	}
}

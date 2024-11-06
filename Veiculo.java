package atividade16_10;

public class Veiculo {
	protected String marca;
	protected String modelo;
	protected String cor;
	protected int ano;

	public Veiculo(String marca, String modelo, String cor, int ano) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
	}	
		public void exibir () {
			System.out.println("Marca: " +marca+ "Modelo: " +modelo+ "Cor: " +cor+ "Ano:" +ano);
	}
}
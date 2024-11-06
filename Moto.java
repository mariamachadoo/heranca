package atividade16_10;

public class Moto extends Veiculo{
	
	private int cilindrada;

	public Moto(String marca, String modelo, String cor, int ano, int cilindrada) {
		super(marca, modelo, cor, ano);
		this.cilindrada = cilindrada;
	}
	@Override
	public void exibir () {
		super.exibir();
		System.out.println("Cilindrada" +cilindrada);
		
	}

}

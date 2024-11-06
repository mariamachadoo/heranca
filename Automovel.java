package atividade16_10;

public class Automovel extends Veiculo{
	
	private int numeroPortas;	
	private String motor;
	
	public Automovel(String marca, String modelo, String cor, int ano, int numeroPortas, String motor) {
		super(marca, modelo, cor, ano);
		this.numeroPortas = numeroPortas;
		this.motor = motor;
	}
    @Override
    public void exibir() {
    	super.exibir();
    	System.out.println("Número de portas: " +numeroPortas+ "Motor: " +motor);

    }	

}

package atividade16_10;

public class Fisioterapeuta extends ProfissionalSaude  {
	
	private String crefito;
	
	public Fisioterapeuta(String nome, String especialidade, int valorConsulta) {
		super(nome, especialidade, valorConsulta);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void agendarConsulta() {
		
	}
	
	 public void exibir() {
	    	super.exibir();
	    	System.out.println("Crefito: " +crefito);

	 }

}

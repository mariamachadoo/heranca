package atividade16_10;

public class PrincipalSaude {

	public static void main(String[] args) {
		
		Medico medico1 = new Medico("Maria", "Cirurgião", 400);
		
		medico1.exibir();
		
		Dentista dentista1 = new Dentista("Isa ", "Geral ", 300);
		
		dentista1.exibir();
		
		Fisioterapeuta fisio1 = new Fisioterapeuta("Maria ", "Pediatra ", 150);
		
		fisio1.exibir();

	}

}

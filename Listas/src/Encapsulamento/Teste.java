package Encapsulamento;
public class Teste {

	public static void main(String[] args) {
		Agenda agenda = new Agenda("Andre"); 
		agenda.adicionar("Andre", "amor amor");
		
		
		Agenda agenda2 = new Agenda("Debora");
		agenda2.adicionar("Andre", "odio odio");
		
		agenda.remover("Andre", "amor amor");
	
	}

}

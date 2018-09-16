package teste;

import negocio.Contato;
//import negocio.Locatario;
import negocio.Proprietario;
import negocio.Imovel;


public class TestaApp {
	public static void main(String[] args) {
		
		Imovel i1 = new Imovel ();
		i1.exibir();
		i1.exibirComodos();
		
		Contato c1 = new Contato();
		c1.exibirContato();
		
		Proprietario p1 = new Proprietario();
		p1.exibir();
		
		//Locatario l1 = new Locatario ();
		//l1.exibir();
						
	}
}
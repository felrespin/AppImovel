package teste;

import negocio.Contato;
import negocio.Locatario;

public class TestaApp {
	public static void main(String[] args) {
		
		Contato c1 = new Contato();
		c1.exibir();
		
		Locatario l1 = new Locatario ();
		l1.exibir();
	}
}

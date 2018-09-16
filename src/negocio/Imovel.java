package negocio;

import java.util.Arrays;

public class Imovel {
	
	private float cotaOrdinaria = 500;
	private float cotaExtra =10;
	private float txGas = 5;
	private float iptu = 99;
	private String [] comodos = {"2 quartos","cozinha","garagem"};
	
	
	private double cacularAluguel() {
						
		return cotaOrdinaria + cotaExtra + txGas + iptu;
	}
	
	public void exibir() {
		System.out.println("O valor do aluguel é R$ " + cacularAluguel () +
				"\nPagavel até o dia 10 em qualquer agência bancária");

	}
	
	public void exibirComodos() {
		System.out.printf("O imóvel possui %s\n", Arrays.deepToString(comodos));
	}
	
	
	public float getCotaOrdinaria() {
		return cotaOrdinaria;
	}
	public void setCotaOrdinaria(float cotaOrdinaria) {
		this.cotaOrdinaria = cotaOrdinaria;
	}
	public float getCotaExtra() {
		return cotaExtra;
	}
	public void setCotaExtra(float cotaExtra) {
		this.cotaExtra = cotaExtra;
	}
	public float getTxGas() {
		return txGas;
	}
	public void setTxGas(float txGas) {
		this.txGas = txGas;
	}
	public float getIptu() {
		return iptu;
	}
	public void setIptu(float iptu) {
		this.iptu = iptu;
	}
	
}

package negocio;

public class Imovel {
	
	private float cotaOrdinaria;
	private float cotaExtra;
	private float txGas;
	private float iptu;
	private boolean vencimento = false;

	public void exibir() {
		System.out.println("");
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
	public boolean isVencimento() {
		return vencimento;
	}
	public void setVencimento(boolean vencimento) {
		this.vencimento = vencimento;
	}

}

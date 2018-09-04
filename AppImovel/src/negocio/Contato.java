package negocio;

public class Contato {
	private String endereco;
	private String cidade;
	private String cep;
	private String uf;
		
	
	public void exibir () {
		System.out.printf("Situado a %s , na cidade de %s com o CEP %s no estado %s.\n",
				endereco,
				cidade,
				cep,uf);
	}
	
	public Contato () {
		endereco = "Rua São José, 90";
		cidade = "Rio de Janeiro";
		cep = "24230-321";
		uf = "RJ";
	}
	
	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}


	public String getUf() {
		return uf;
	}


	public void setUf(String uf) {
		this.uf = uf;
	}


	
	
}

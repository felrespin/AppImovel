package negocio;

public class Locatario {
	
	
	private String endereco;
	private String dtNascimento;
	
	
	public void exibir () {
		//System.out.printf("CPF: %s \n",
			//	cpf
			//	);
	}
	
	public Locatario () {
			
		endereco = "Rua das avenidas,99 apto 101 bl1";
		dtNascimento = "31/02/1999";
	}


	
	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getDtNascimento() {
		return dtNascimento;
	}


	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	
	
	
}

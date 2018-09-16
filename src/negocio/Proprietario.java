package negocio;

public class Proprietario {
	private String contaBancaria;
	private String endereco;
	private String dtNascimento;
	
	public Proprietario() {
		contaBancaria = "Ag 999 CC 9999-9";
		endereco = " Av das américas 5000";
		dtNascimento = "31/02/1999";
	}
	
	
	public void exibir() {
		System.out.println("#Locatario#");
		System.out.printf("Conta Bancaria: %s \n"
				+"endereco: %s \n"
				+"nascido em: %s\n",
				contaBancaria,
				endereco,
				dtNascimento);
	}
	
	
	
	
	public String getContaBancaria() {
		return contaBancaria;
	}
	public void setContaBancaria(String contaBancaria) {
		this.contaBancaria = contaBancaria;
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

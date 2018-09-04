package negocio;

public class Locatario {
	private String nome;
	private String dtNascimento;
	private String cpf;
	private String contaBancaria;
	
	
	public void exibir () {
		System.out.printf("%s, nascido em %s, inscrito no CPF nº %s, conta bancária %s.\n",
				nome,
				dtNascimento,
				cpf,
				contaBancaria);
	}
	
	public Locatario () {
		nome = "Tião Macalé";
		dtNascimento = "31/02/1999";
		cpf = "099.999.999-09";
		contaBancaria = "9999 9999-9";
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getContaBancaria() {
		return contaBancaria;
	}
	public void setContaBancaria(String contaBancaria) {
		this.contaBancaria = contaBancaria;
	}
	
	
}

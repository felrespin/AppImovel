package negocio;

public class Contato {
	private String nome;
	private String email;
	private String telefone;
	private String cpf;
	private String cidade;
	private String cep;
	private String uf;
	
	public Contato () {
		nome = "Fulano"; 
		email = "fulano@email.com";
		telefone = "21 99999-9999";
		cidade = "Rio de Janeiro";
		cep = "24230-321";
		uf = "RJ";
	}
	
	public void exibirContato () {
		System.out.printf("Nome: %s\nEmail: %s\nTelefone: %s\nCidade  %s\nCEP:%s estado %s\n",
				nome,
				email,
				telefone,
				cidade,
				cep,
				uf);
	}
	
	public void exibirBoleto () {
		System.out.printf("Nome: %s\n",
				nome);
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
			
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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

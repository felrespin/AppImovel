package negocio;

public class Locatario {
	
	private String nomeMae;
	private String nomeContatoSos;
	private String telContatoSos;
	private String emailContatoSos;
	
	
	public void exibir () {
		System.out.printf("Nome da mae: %s \n"
						+ "Para emergências:\n"
						+"Contato: %s\n"
						+ "telefone: %s\n"
						+ "email: %s\n",
						nomeMae,
						nomeContatoSos,
						telContatoSos,
						emailContatoSos);
	}
	
	public Locatario () {
			
		nomeMae = "Mae do locatario";
		nomeContatoSos = "Locatario Recado";
		telContatoSos = "21 9 9999-9999";
		emailContatoSos = "locatarioemail@email.com";
		
	}

	
	
	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomeContatoSos() {
		return nomeContatoSos;
	}

	public void setNomeContatoSos(String nomeContatoSos) {
		this.nomeContatoSos = nomeContatoSos;
	}

	public String getTelContatoSos() {
		return telContatoSos;
	}

	public void setTelContatoSos(String telContatoSos) {
		this.telContatoSos = telContatoSos;
	}

	public String getEmailContatoSos() {
		return emailContatoSos;
	}

	public void setEmailContatoSos(String emailContatoSos) {
		this.emailContatoSos = emailContatoSos;
	}

		
}

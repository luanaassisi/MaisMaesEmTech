package pessoas;

public class Voluntario extends Pessoa {

	private String formacao,areaAtuacao;

	
	@Override
	public String toString() {
		return "id:"+getId()+" Nome:" + getNome() + ", Endereco:" + getEndereco() + ", Idade:" + getIdade()
		+ ", Cpf:" + getCpf() + ", Telefone:" + getTelefone() +" "
				+ " Formacao:" + getFormacao() + ", AreaAtuacao:" + getAreaAtuacao();
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public String getAreaAtuacao() {
		return areaAtuacao;
	}

	public void setAreaAtuacao(String areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
	}
	
	
	
	
	
	
	
	
}

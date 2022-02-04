package pessoas;

public class Canditato extends Pessoa {

	private int qtFilhos,idadeFilhos;
	private String escolaridade;
	private double Renda;
	
	
	public int getQtFilhos() {
		return qtFilhos;
	}
	


	@Override
	public String toString() {
		return"id:"+getId()+ " Nome=" + getNome() + ", Endereco:" + getEndereco() + ", Idade:" + getIdade()
		+ ", Cpf:" + getCpf() + ", Telefone:" + getTelefone() + " qtdFilhos:"+ getQtFilhos() + ", IdadeFilhos:" + getIdadeFilhos()
				+ ", Escolaridade:" + getEscolaridade() + ", Renda:" + getRenda();		
	}

	
	
	public void setQtFilhos(int qtFilhos) {
		this.qtFilhos = qtFilhos;
	}
	public int getIdadeFilhos() {
		return idadeFilhos;
	}
	public void setIdadeFilhos(int idadeFilhos) {
		this.idadeFilhos = idadeFilhos;
	}
	public String getEscolaridade() {
		return escolaridade;
	}
	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}
	public double getRenda() {
		return Renda;
	}
	public void setRenda(double renda) {
		Renda = renda;
	}
	
	
	
}

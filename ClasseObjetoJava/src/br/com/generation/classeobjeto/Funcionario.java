package br.com.generation.classeobjeto;

public class Funcionario {

	private String nome, cpf, telefone, enderešo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}
	public double descAVista(double dinheiro) {
		dinheiro *= 0.9;
		return dinheiro;
	}
	public double descFuncionario(double dinheiro) {
		dinheiro *=0.85;
		return dinheiro;
	}
	
	
}

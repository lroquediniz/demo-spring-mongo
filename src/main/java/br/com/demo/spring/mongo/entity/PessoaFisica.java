package br.com.demo.spring.mongo.entity;

import org.springframework.data.annotation.Id;

public class PessoaFisica implements IPessoa {

	@Id
	private String cpf;

	private Pessoa pessoa;

	@Override
	public TipoPessoa getTipoPessoa() {
		return TipoPessoa.FISICA;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

}

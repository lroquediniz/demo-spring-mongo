package br.com.demo.spring.mongo.entity;

import org.springframework.data.annotation.Id;

public class PessoaJuridica implements IPessoa {

    @Id
    private String cnpj;

    private String razaoSocial;

    private Pessoa pessoa;

    @Override
    public TipoPessoa getTipoPessoa() {
        return TipoPessoa.JURIDICA;
    }

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
    
    
}

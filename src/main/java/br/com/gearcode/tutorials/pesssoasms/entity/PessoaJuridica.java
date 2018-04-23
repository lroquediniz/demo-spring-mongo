package br.com.gearcode.tutorials.pesssoasms.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class PessoaJuridica implements IPessoa {

    @Id
    private String cnpj;

    private String razaoSocial;

    private Pessoa pessoa;

    @Override
    public TipoPessoa getTipoPessoa() {
        return TipoPessoa.JURIDICA;
    }
}

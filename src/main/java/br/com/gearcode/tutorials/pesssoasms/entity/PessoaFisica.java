package br.com.gearcode.tutorials.pesssoasms.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class PessoaFisica implements IPessoa {

    @Id
    private String cpf;

    private Pessoa pessoa;

    @Override
    public TipoPessoa getTipoPessoa() {
        return TipoPessoa.FISICA;
    }
}

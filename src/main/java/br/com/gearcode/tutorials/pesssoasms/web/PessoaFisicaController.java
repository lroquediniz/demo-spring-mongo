package br.com.gearcode.tutorials.pesssoasms.web;


import br.com.gearcode.tutorials.pesssoasms.entity.IPessoa;
import br.com.gearcode.tutorials.pesssoasms.entity.Pessoa;
import br.com.gearcode.tutorials.pesssoasms.entity.PessoaFisica;
import br.com.gearcode.tutorials.pesssoasms.entity.PessoaJuridica;
import br.com.gearcode.tutorials.pesssoasms.repo.PessoasRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/pessoas")
public class PessoaFisicaController {

    @Autowired
    private PessoasRepository repository;


    @RequestMapping(method = RequestMethod.POST)
    public void createBook(@RequestBody IPessoa pessoa) {
        repository.save(pessoa);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<IPessoa> findAllBooks() {
        PessoaFisica p = new PessoaFisica();
        p.setCpf("00000000000001");
        p.setPessoa(new Pessoa());
        p.getPessoa().setDataNascimento(new Date());
        p.getPessoa().setNome("PAULO ANDRADE");
        repository.save(p);

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setCnpj("000000000000002");
        pessoaJuridica.setPessoa(new Pessoa());
        pessoaJuridica.getPessoa().setDataNascimento(new Date());
        pessoaJuridica.getPessoa().setNome("Google");
        pessoaJuridica.setRazaoSocial("GOOGLE");
        repository.save(pessoaJuridica);

        return repository.findAll();
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/{id}")
    public void deleteBookWithId(@PathVariable String id) {
        repository.delete(id);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteAllBooks() {
        repository.deleteAll();
    }
}

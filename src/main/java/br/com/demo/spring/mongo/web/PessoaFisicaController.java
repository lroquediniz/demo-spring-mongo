package br.com.demo.spring.mongo.web;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.demo.spring.mongo.entity.IPessoa;
import br.com.demo.spring.mongo.repo.PessoasRepository;

@RestController
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
        /*PessoaFisica p = new PessoaFisica();
        p.setCpf("00000000000003");
        p.setPessoa(new Pessoa());
        p.getPessoa().setDataNascimento(new Date());
        p.getPessoa().setNome("PAULO ANDRADE");
        repository.save(p);

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setCnpj("000000000000004");
        pessoaJuridica.setPessoa(new Pessoa());
        pessoaJuridica.getPessoa().setDataNascimento(new Date());
        pessoaJuridica.getPessoa().setNome("Google");
        pessoaJuridica.setRazaoSocial("GOOGLE");
        repository.save(pessoaJuridica);*/

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

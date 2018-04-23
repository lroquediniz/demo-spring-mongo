package br.com.demo.spring.mongo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.demo.spring.mongo.entity.IPessoa;

/**
 * Created by luan on 19/09/17.
 */
public interface PessoasRepository extends MongoRepository<IPessoa, String> {
}

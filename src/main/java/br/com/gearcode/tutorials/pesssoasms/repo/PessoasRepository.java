package br.com.gearcode.tutorials.pesssoasms.repo;

import br.com.gearcode.tutorials.pesssoasms.entity.IPessoa;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by luan on 19/09/17.
 */
public interface PessoasRepository extends MongoRepository<IPessoa, String> {
}

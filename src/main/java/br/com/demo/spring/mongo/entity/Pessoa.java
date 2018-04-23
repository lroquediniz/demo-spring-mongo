package br.com.demo.spring.mongo.entity;


import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
public class Pessoa {

    private String nome;

    private Date dataNascimento;


}

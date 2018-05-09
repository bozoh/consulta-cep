package com.github.bozoh.consultacep.model;

import lombok.Data;

@Data
public class Endereco {
  private String logradouro;
  private String complemento;
  private String complemento2;
  private String bairro;
  private String cidade;
  private String uf;
  private String cep;
}

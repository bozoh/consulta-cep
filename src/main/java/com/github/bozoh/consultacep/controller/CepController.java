package com.github.bozoh.consultacep.controller;

import com.github.bozoh.consultacep.model.Endereco;
import com.github.bozoh.consultacep.service.CepService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/consulta-cep")
public class CepController {

  @Autowired
  private CepService service;

  @GetMapping("/{cep}")
  public Endereco buscaCep(@PathVariable("cep") String cep) {
    log.debug("buscaCep(" + cep + ")");
    return this.service.buscaCep(cep);
  }
}

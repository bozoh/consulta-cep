# Consulta CEP

O Consulta CEP é um microservice re retorna o endereço de um determinado CEP, ele se utiliza da API dos correios como fonte de dados.
O projeto foi todo feito em java, utilizando o framework spring-boot

## Tópicos

- [Consulta CEP](#consulta-cep)
    - [Tópicos](#tópicos)
    - [Executando o projeto](#executando-o-projeto)
    - [Modo desenvolvedor](#modo-desenvolvedor)

## Executando o projeto

Para gerar um executável desse projeto basta usar a seguinte linha de comando:

```bash
mvn package
```

e depois:

```bash
java java -jar target/consulta-cep-1.0.0.jar
```

Abrir um browser se digitar `http://localhost:8080/consulta-cep/api/cep/<CEP_DESEJADO>`, por exemplo para o CEP 20211-110, devo digitar:  `http://localhost:8080/consulta-cep/api/cep/20211110`

## Modo desenvolvedor

Para executar o projeto em modo desenvolvedor, basta execuar o comando:

```bash
mvn spring-boot:run
```
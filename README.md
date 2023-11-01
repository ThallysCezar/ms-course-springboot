# Projeto de Microsserviços Java com Spring Cloud

Este projeto foi desenvolvido como parte do meu aprendizado em arquitetura de microsserviços utilizando Java 11 e o framework Spring Boot 2.3. Ele abrange os principais conceitos e tecnologias do Spring Cloud, e foi inspirado por cursos e tutoriais de especialistas no campo, incluindo a "Semana Decoder" com Michelli Brito e o curso de Nelio Alves de "Microsserviços Java com Spring Boot e Spring Cloud".

## O que eu aprendi

Durante a minha jornada de aprendizado, explorei diversas áreas e conceitos relevantes para microsserviços, incluindo:

- Modelagem de uma arquitetura de microsserviços.
- Boas práticas e padrões para o desenvolvimento de microsserviços.
- Os principais padrões e padrões de comunicação.
- Implementação de microsserviços de negócios.
- Microsserviços de configurações.
- Uso de padrões de comunicação, como API Gateway e Service Registry.
- Desenvolvimento de microsserviços com Spring Boot.

## Principais Componentes do Projeto

Este projeto abrange vários componentes e tecnologias do ecossistema do Spring Cloud:

- **Ribbon**: Implementação do balanceamento de carga entre microsserviços.
- **OAuth e JWT**: Autenticação e autorização segura com tokens.
- **API Gateway**: Ponto de entrada único para todos os microsserviços.
- **Config Server**: Gerenciamento centralizado de configurações.
- **Feign Client**: Facilitando a comunicação entre os microsserviços.
- **Hystrix**: Tolerância a falhas e recuperação de falhas.
- **Eureka**: Service Registry para gerenciar descoberta de serviços.
- **Zuul**: API Gateway para roteamento e balanceamento de carga.
- **Actuator**: Monitoramento e atualizações em tempo de execução.

## O Projeto

O projeto em si é um sistema de gerenciamento de trabalhadores (Workers). Ele inclui um banco de dados para o cadastro de trabalhadores e um microsserviço de folha de pagamento que se comunica com o microsserviço de trabalhadores para gerar folhas de pagamento.

O objetivo é demonstrar a complexidade de uma arquitetura de microsserviços e como essas tecnologias do Spring Cloud podem ser usadas para criar sistemas escaláveis e eficientes.

## Pré-requisitos

- Java 11
- IDE de sua escolha (Eclipse, IntelliJ, etc.), usando o Spring 2.3

## Como executar o projeto

1. Clone este repositório.
2. Importe o projeto em sua IDE.
3. Execute os microsserviços em ordem:
   - Config Server
   - Eureka Service Registry
   - Os demais microsserviços
4. Acesse o API Gateway para interagir com o sistema.

## Contribuições

Contribuições e sugestões são bem-vindas. Sinta-se à vontade para criar *issues* e *pull requests*.
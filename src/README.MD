---

# Sistema de Gerenciamento de Serviços de Diarista e Clientes em Java

Este repositório contém um conjunto de códigos Java relacionados a um aplicativo de gerenciamento de serviços de diarista e clientes. O aplicativo permite que os usuários insiram informações sobre clientes e diaristas, realizem depósitos com adicional de 10% e controlem as horas de trabalho das diaristas.

## Arquivos

1. **App.java**: Este arquivo contém a classe principal do aplicativo. Ele solicita informações do cliente, como nome, telefone, endereço e valor do depósito. O valor do depósito é aumentado em 10% e adicionado ao saldo do cliente. Também solicita informações da diarista, como nome, telefone, endereço e chave PIX. Por fim, exibe todas as informações fornecidas.

2. **Atendimento.java**: Este arquivo contém a definição da classe `Atendimento`, que controla as horas de trabalho de uma diarista. Ele define um método para definir as horas de trabalho, garantindo que o valor esteja entre 1 e 12 horas.

3. **Diarista.java**: Este arquivo contém a definição da classe `Diarista`, que herda da classe `Pessoa` e implementa a interface `Isaldo`. Ele define métodos para sacar e depositar valores no saldo da diarista, além de definir a chave PIX da diarista.

4. **Isaldo.java**: Este arquivo contém a definição da interface `Isaldo`, que define os métodos `sacar` e `depositar` que devem ser implementados pelas classes que a implementam.

5. **Pessoa.java**: Este arquivo contém a definição da classe abstrata `Pessoa`, que define atributos comuns a clientes e diaristas, como nome, telefone, endereço e saldo. Ele também implementa os métodos da interface `Isaldo`.

6. **Cliente.java**: Este arquivo contém a definição da classe `Cliente`, que herda da classe `Pessoa`. Ele redefine os métodos `sacar` e `depositar` para ajustar o saldo do cliente.

## Objetivo

Este projeto foi desenvolvido como parte de um estudo sobre programação orientada a objetos em Java, com foco em encapsulamento, herança e interfaces. Ele fornece uma base para a construção de um sistema mais complexo de controle de atendimento entre clientes e prestadores de serviço.

--- 

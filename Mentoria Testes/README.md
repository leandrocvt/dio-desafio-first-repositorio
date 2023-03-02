# 💻 Piramide de Testes e TDD

A Pirâmide de Testes é uma estratégia que orienta a criação de testes em diferentes níveis de abstração. Já o TDD (Test-Driven Development) é uma técnica de desenvolvimento que consiste em escrever testes antes do código.

---

## 💡O que é teste de software e qual sua importância?

🔸Processo que valida um sistema ou aplicação

🔸Desde a etapa de criação até a implementação

🔸Os testes devem cobrir o máximo de combinações que podem ser aplicados no software

🔸Abertura de Bugs e novo teste após correção

### Pontos positivos: 

🔹Encontra os bugs em fase de desenvolvimento

🔹Garante a entrega de um software com mais qualidade

🔹Verifica se todos os requisitos foram implementados

🔹Reduz o custo de manutenções e correções de erros de produção

### Tipos de Teste

* Teste de Unidade: lidar com pequenas partes do código desenvolvido.

* Teste de Integração: integração de unidades (Ex: Tela de login que integra com o Banco de dados).

* Teste Operacional: análisa se o sistema está funcionando.

* Teste de Regressão: valida se o que já existe continua funcionando.

* Teste Funcional: valida a funcionalidade escrita pelo usuário. Se tudo que foi solicitado pelo usuário foi de fato desenvolvido conforme o esperado.

* Teste de Interface: teste de usabilidade.

* Teste de Configuração e Segurança: valida se funciona em diversas plataformas e com segurança.

* Teste de Perfomance: analisar como o sistema se comportar em determinadas condições.

* Teste de Carga: valida como que o sistema vai se comportar em sobrecarga.

* Teste de stress: testa situações imprevistas que pode ocorrer.

* Teste de Instalação/Desinstalação: validação da instalação e desinstalação.

---

## TDD (Test Driven Development ou Desenvolvimento Desenvolvidos Orientado por Testes)

🔸Desenvolvimento orientado a testes

🔸Ciclos de repetição: Teste falha - implementação da funcionalidade é realizado - Teste ok

🔸Refatoramento do código com boas práticas

### Pontos positivos: 

🔹Maior cobertura de testes unitários

🔹Testes unitários são executados com maior frequência

🔹Códigos mais limpos

🔹Maior segurança na correção dos bugs

🔹Reforço na cultura da qualidade e as práticas de shift-left

Obs: Shift-left é trazer o teste para esquerda significa que os testes iniciam mais cedos e duram todo o ciclo de desenvolvimento de um software, ou seja, ao invés de todo processo ocorrer no fim do desenvolvimento “à direita” do fluxo, as atividades são antecipadas percorrendo um fluxo sequencial, favorecendo a qualidade nas fases mais iniciais do processo.

---

## BDD (Behavior Driven Development ou Desenvolvimento Orientado ao Comportamento)

🔸Desenvolvimento orientado ao comportamento

🔸Complemento do TDD

🔸Metodologia compartilhada entre QA - Dev - PO (Regra dos 3 amigos)

🔸Given(Dado) - When (Quando) - Then (Então)

### Pontos positivos: 

🔹Produto que responde a expectativa do cliente

🔹Melhor comunicação e integração do time

🔹Documentação dinâmica

--- 

## BDD x TDD

* TDD pensa na qualidade do código

* BDD pensa a partir do ponto de vista do comportamento esperado de uma funcionalidade pelo usuário

* É possível aplicar as duas metodologias no mesmo desenvolvimento

--- 

## Pirâmides de Testes

Base: Testes de Unidade

Meio: Testes de Integração

Topo: Testes Ponta a Ponta (E2E ou Testes de Interface)

![piramide](https://user-images.githubusercontent.com/99419974/222497570-bd9d3689-ceed-4feb-ba06-fd3394078d00.png)

### Pirâmides de Testes - Unitário

Teste de Unidade: 

* Testes realizado na menor parte testável de uma aplicação

* Testes unitários tendem a ser extremamente pequenos e de rápida criação de excecução

* Muitos utilizados na metodolia TDD

* Boas práticas sugerem que desenvolvedores sejam responsáveis pela criação de testes unitários

### Pirâmides de Testes - Integração

Teste de Integração: 

* Tem como objetivo testear um conjunto de unidades interagindo entre si (por exemplo banco de dados, comunicação de interfaces, APIs, micro-serviços)

* Por testarem um conjunto de unidades, os testes de integração acabam sendo mais complexos de fazer do que um teste de unidade

* Caso algum teste falhe, exige maior esforço para identificar o motivo da falha e também é para sua manutenção

* Muitas vezes os testes de integração demandam um ambiente completo para sua execução

### Pirâmides de Testes - E2E

Teste de Ponta a Ponta:

* Tem como objetivo principal simular o comportamento de um usuário final em nossa aplicação

* Muito utilizado na metodolia BDD

* Necessário de uma escolha criteriosa na cobertura dos cenários, uma vez que são testes mais complexos

---

## Certificações de Testes

BSTQB/ISTQB (Brazilian Software Testing Qualifications Board)

🔹CTFL (Certified Tester Foudation Level)

🔹CTFL-AT (Certified Tester Foudation Level, Agile Tester)

ALATS(Associação Latino-Americana de Testes de Software)

🔹Certificação Brasileira de Teste de Software (CBTS)

---

## 📌 Línks Úteis
[Brazilia Software Testing Qualifications Board](https://bstqb.org.br/b9/)

[Julio de Limas](https://www.youtube.com/@JuliodeLimas)

[Lele Maine](https://www.youtube.com/@lelemainechannel)

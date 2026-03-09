🛒 E-commerce Legado - Sistema de Vendas (Módulo 2)

Bem-vindo(a) ao repositório oficial do E-commerce Legado. Este projeto é a base prática para o Módulo 2 da disciplina de Padrões de Projetos de Software com Java.

📜 O Contexto (A Sua Missão)

Após o seu excelente trabalho refatorando o núcleo financeiro do JavaBank, a diretoria o(a) transferiu para a principal fonte de renda da empresa: a plataforma de E-commerce.

Infelizmente, o cenário aqui é crítico. A plataforma vende milhares de produtos diariamente, mas o código atual está causando prejuízos. O sistema cai constantemente, a adição de novos recursos demora semanas e a leitura do código é um pesadelo.

Como Engenheiro(a) de Software, você identificou que o problema está na forma como os objetos nascem. A regra de negócio está fortemente acoplada à criação de instâncias.

🚨 Os Sintomas (O que você vai consertar):

Quedas no Banco de Dados: O sistema cria uma nova conexão física com o banco de dados toda vez que precisa salvar algo (new DatabaseConnection()). Em dias de promoção, o banco atinge o limite de conexões e o site sai do ar.

Alto Acoplamento em Pagamentos: Para adicionar o meio de pagamento "PIX", o programador anterior precisou abrir a classe central de Checkout e adicionar mais um else if gigante.

Construtores Monstruosos: Para criar um simples Pedido, o desenvolvedor é obrigado a passar dezenas de parâmetros no construtor, resultando em códigos ilegíveis como: new Pedido("João", 500.0, null, true, false, 0.0);.

A sua missão é refatorar a forma como o sistema gerencia o ciclo de vida dos objetos aplicando os Padrões de Projeto Criacionais (GoF).

🛠️ Pré-requisitos e Setup

O nosso ambiente oficial de desenvolvimento continua sendo o IntelliJ IDEA.

Java JDK 21 instalado.

IntelliJ IDEA (Community ou Ultimate) instalado.

Git configurado na sua máquina.

Como iniciar:

Abra o IntelliJ IDEA.

Na tela de boas-vindas, clique em Get from VCS.

Cole a URL deste repositório:

https://github.com/prof-salu/EcommerceLegado.git

Clique em Clone.

No painel de projeto à esquerda, expanda a pasta azul src e abra o arquivo Main.java.

Clique na seta verde (Play) ao lado do método main para rodar o sistema e ver os problemas acontecerem no seu console.

🎯 Laboratórios de Refatoração

Siga a sua Apostila de Laboratório para aplicar as correções abaixo:

1. O Ponto de Acesso Global (Singleton)

Objetivo: Impedir que o sistema crie múltiplas conexões com o banco de dados.

Ação: Bloquear o uso da palavra new (construtor privado) e fornecer um método estático global que retorna sempre a mesma e única instância do banco de dados na memória.

2. A Terceirização da Criação (Factory Method)

Objetivo: Retirar a responsabilidade do Checkout de saber "como" criar um método de pagamento.

Ação: Criar uma classe PagamentoFactory que recebe uma string (ex: "PIX") e devolve o objeto correto pronto para uso, respeitando a interface Pagamento.

3. A Construção Passo a Passo (Builder)

Objetivo: Eliminar o anti-pattern do "Construtor Telescópico" (cheio de valores nulos e booleanos sem sentido).

Ação: Criar um PedidoBuilder para montar o pedido de forma fluente e legível, configurando o cliente, o produto e opções (como embalagem de presente) um passo de cada vez.

⚠️ Regra de Ouro do Repositório

Existe uma branch neste repositório chamada solucao que contém o código perfeitamente refatorado com os padrões GoF.

NÃO MUDE PARA A BRANCH SOLUÇÃO ANTES DE TENTAR! O processo de aprendizagem em Arquitetura de Software exige prática. Leia o código legado, sinta a dificuldade de modificá-lo e aplique o padrão por conta própria. O professor debaterá a solução ideal ao final da aula.

Mãos à obra e vamos salvar o E-commerce! 🚀

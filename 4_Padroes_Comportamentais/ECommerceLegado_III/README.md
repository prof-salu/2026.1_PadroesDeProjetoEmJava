🧠 E-commerce - Comportamento e Notificações (Módulo 4)

Bem-vindo(a) ao repositório do Módulo 4 da disciplina de Padrões de Projetos de Software!

📜 A Sua Missão

A nossa plataforma está escalando. O sistema agora precisa reagir a eventos de pagamento, os pedidos passam por estados complexos (Novo, Pago, Enviado) e o time de marketing cria uma regra de desconto nova toda semana.

O código atual está repleto de blocos if/switch e dependências engessadas. A sua missão é aplicar os Padrões Comportamentais (GoF) para criar algoritmos flexíveis e distribuir responsabilidades de forma dinâmica.

🎯 Laboratórios:

O Grito do Pedido (Observer): Desacoplar o processo de finalização de compra, criando "Assinantes" (NotaFiscal, Transportadora) que ouvem o Checkout.

A Máquina de Estados (State): Eliminar os switch/case da classe Pedido, transformando os status (Novo, Pago, Enviado) em objetos inteligentes que sabem como se comportar.

A Guerra dos Descontos (Strategy): Extrair a matemática pesada do CarrinhoDeCompras e criar estratégias injetáveis (VIP, Black Friday).

Atenção: A branch solucao contém o gabarito. Tente implementar por conta própria primeiro!




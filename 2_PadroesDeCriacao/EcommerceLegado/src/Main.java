public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE E-COMMERCE (LEGADO) ===\n");

        // ------------------------------------------------------------------------
        // LABORATÓRIO 1: O Problema do Singleton
        // O sistema está abrindo 3 conexões diferentes. Se 1000 clientes
        // comprarem ao mesmo tempo, o banco de dados vai cair.
        // ------------------------------------------------------------------------
        System.out.println("--- Conectando ao Banco de Dados ---");
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        DatabaseConnection db3 = DatabaseConnection.getInstance();

        System.out.println("O db1 é igual ao db2? " + (db1 == db2)); // Imprime 'false' (São instâncias diferentes)
        System.out.println();


        // ------------------------------------------------------------------------
        // LABORATÓRIO 3: O Problema do Builder
        // Um pesadelo de ler e manter. O que significa "null, true, false"?
        // ------------------------------------------------------------------------
        System.out.println("--- Criando Pedido ---");
        Pedido pedido1 = new Pedido.PedidoBuilder()
                            .comCliente("Juca")
                            .comProduto("Iphone 17", 7999.99)
                            .comEndereco("Rua ABC, 123")
                            .comEmbalagemPresente()
                            .comTaxaFrete(10)
                            .build();

        Pedido pedido2 = new Pedido.PedidoBuilder()
                            .comCliente("Ana")
                            .comProduto("Notebook Dell", 3500)
                            .comEntregaExpressa()
                            .build();

        System.out.println("Criado: " + pedido1.toString());
        System.out.println("Criado: " + pedido2.toString());
        System.out.println();


        // ------------------------------------------------------------------------
        // LABORATÓRIO 2: O Problema do Factory Method
        // Alto acoplamento. Toda vez que um novo meio de pagamento for criado (ex: Criptomoeda),
        // precisaremos abrir a classe Main (ou Checkout) e adicionar um novo 'else if'.
        // ------------------------------------------------------------------------
        System.out.println("--- Processando Pagamento ---");
        String tipoPagamentoEscolhido = "debito"; // Simula a escolha do utilizador na tela

        try{
            Pagamento pagamento = PagamentoFactory.criarPagamento(tipoPagamentoEscolhido);
            pagamento.processar(pedido1.getValor());
            // Salvando no banco (usando uma das várias conexões criadas)
            db1.salvarPedido(pedido1.toString());
        }catch(IllegalArgumentException e){
            e.printStackTrace();
        }
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("=== E-COMMERCE (PROBLEMAS COMPORTAMENTAIS) ===\n");

        System.out.println("--- 1. Aplicando o OBSERVER ---");
        Pedido p1 = new Pedido(1000.0);
        Checkout checkout = new Checkout();

        checkout.adicionarAcao(new Email());
        checkout.adicionarAcao(new Transportadora());
        checkout.adicionarAcao(new NotaFiscal());
        checkout.adicionarAcao(new SMS());

        checkout.finalizarCompra(p1);

        System.out.println();

        System.out.println("--- 2. Aplicando o STATE ---");
        Pedido p2 = new Pedido(500.0);
        p2.setStatus(new EstadoEmSeparacao());

        try{
            p2.cancelar();
        }catch (IllegalStateException e){
            System.out.println(e.getMessage());
        }

        System.out.println();

        System.out.println("--- 3. Aplicando o STRATEGY ---");
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras(2000.0);

        carrinho.setTipoDesconto(new DescontoVIP());
        carrinho.setTipoDesconto(new DescontoBlackFriday());

        System.out.println("Total a pagar: R$ " + carrinho.calcularTotal());
    }
}
public class EstadoNovo implements EstadoPedido{
    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Pedido CANCELADO sem custos");
    }
}

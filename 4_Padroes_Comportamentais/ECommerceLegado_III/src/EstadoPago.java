public class EstadoPago implements EstadoPedido{
    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Pedido CANCELADO. Reembolso solicitado.");
    }
}

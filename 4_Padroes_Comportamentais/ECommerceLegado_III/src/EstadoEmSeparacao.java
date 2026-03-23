public class EstadoEmSeparacao implements EstadoPedido{
    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Pedido CANCELADO. Estornando o valor.");
    }
}

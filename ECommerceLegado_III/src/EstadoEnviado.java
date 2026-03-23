public class EstadoEnviado implements EstadoPedido{
    @Override
    public void cancelar(Pedido pedido) {
        throw new IllegalStateException("Erro. Não foi possivel cancelar. " +
                                        "Pedido em transito.");
    }
}

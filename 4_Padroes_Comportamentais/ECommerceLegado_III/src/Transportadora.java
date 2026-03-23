public class Transportadora implements AcoesDePagamento{
    public void agendar(Pedido pedido) {
        System.out.println("Transportadora notificada para coleta.");
    }

    @Override
    public void executar(Pedido pedido) {
        System.out.println("Transportadora notificada para coleta.");
    }
}
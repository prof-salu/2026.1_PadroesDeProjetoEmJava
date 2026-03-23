public class SMS implements AcoesDePagamento{
    @Override
    public void executar(Pedido pedido) {
        System.out.println("Seu pedido esta sendo separado.");
    }
}

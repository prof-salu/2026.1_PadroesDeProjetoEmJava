public class Email implements AcoesDePagamento{
    public void enviar(Pedido pedido) {
        System.out.println("Enviando e-mail de confirmação ao cliente.");
    }

    @Override
    public void executar(Pedido pedido) {
        System.out.println("Enviando e-mail de confirmação ao cliente");
    }
}
public class MensageiroSMS implements Mensageiro{
    @Override
    public void enviarMensagem(double saldo) {
        System.out.println("[SMS] ==> Saldo negativado! [" + saldo + "]");
    }
}

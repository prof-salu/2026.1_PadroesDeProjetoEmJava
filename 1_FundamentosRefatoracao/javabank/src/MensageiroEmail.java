public class MensageiroEmail implements Mensageiro{
    @Override
    public void enviarMensagem(double saldo) {
        System.out.println("[@Email] ==> Saldo negativado! [R$ " + saldo + "]");
    }
}

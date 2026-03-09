public class PagamentoPix implements Pagamento {
    @Override
    public void processar(double valor) {
        System.out.println("[PAGAMENTO] Gerando QRCode PIX no valor de R$ " + valor + ".");
    }
}
public class PagamentoBoleto implements Pagamento {
    @Override
    public void processar(double valor) {
        System.out.println("[PAGAMENTO] Gerando Boleto no valor de R$ " + valor + ".");
    }
}

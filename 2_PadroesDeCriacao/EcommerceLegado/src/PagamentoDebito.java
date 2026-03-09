public class PagamentoDebito implements Pagamento{
    @Override
    public void processar(double valor) {
        System.out.println("[PAGAMENTO] Processando R$ " + valor + " via Cartão de Débito.");
    }
}

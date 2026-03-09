public class PagamentoFactory {

    public static Pagamento criarPagamento(String tipo){
        if(tipo == null){
            throw new IllegalArgumentException("Tipo de pagamento não pode ser nulo!");
        }

        switch (tipo.toUpperCase()){
            case "CREDITO":
                return new PagamentoCredito();
            case "PIX":
                return new PagamentoPix();
            case "BOLETO":
                return new PagamentoBoleto();
            case "DEBITO":
                return new PagamentoDebito();
            default:
                throw new IllegalArgumentException("Forma de pagamento invalida");
        }
    }
}
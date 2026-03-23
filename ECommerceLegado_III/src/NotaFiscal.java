public class NotaFiscal implements AcoesDePagamento{
    public void gerar(Pedido pedido) {
        System.out.println("Gerando NF para pedido valor: " + pedido.getValor());
    }

    @Override
    public void executar(Pedido pedido) {
        System.out.println("Gerando Nota Fiscal para pedido de valor: " + pedido.getValor());
    }
}
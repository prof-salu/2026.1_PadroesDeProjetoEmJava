public class CarrinhoDeCompras {
    private double valorTotal;
    private TipoDesconto tipoDesconto; // "VIP", "BLACKFRIDAY", "NENHUM"

    public CarrinhoDeCompras(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setTipoDesconto(TipoDesconto tipoDesconto){
        this.tipoDesconto = tipoDesconto;
    }

    public double calcularTotal() {
        if(tipoDesconto == null){
            //Se nao tem cupom aplicado.
            return valorTotal;
        }else{
            //Aplica o cupom de desconto
            return tipoDesconto.calcularDesconto(valorTotal);
        }
    }
}
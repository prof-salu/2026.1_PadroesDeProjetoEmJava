public class Pedido {
    private final String cliente;
    private final String enderecoEntrega;
    private final String produto;
    private final double valor;
    private final String cupomDesconto;
    private final boolean embalagemPresente;
    private final boolean entregaExpressa;
    private final double taxaFrete;

    // Construtor privado recebendo o builder
    public Pedido(PedidoBuilder builder) {
        this.cliente = builder.cliente;
        this.enderecoEntrega = builder.enderecoPedido;
        this.produto = builder.produto;
        this.valor = builder.valor;
        this.cupomDesconto = builder.cupomDesconto;
        this.embalagemPresente = builder.embalagemPresente;
        this.entregaExpressa = builder.entregaExpressa;
        this.taxaFrete = builder.taxaFrete;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "cliente='" + cliente + '\'' +
                ", produto='" + produto + '\'' +
                ", valor=" + valor +
                ", presente=" + embalagemPresente +
                '}';
    }

    public static class PedidoBuilder{
        //Atributos obrigatorios
        private String cliente;
        private String produto;
        private double valor;

        //Atributos opcionais
        private String enderecoPedido;
        private String cupomDesconto;
        private boolean embalagemPresente;
        private boolean entregaExpressa;
        private double taxaFrete;

        //Métodos fluentes
        public PedidoBuilder comCliente(String cliente){
            this.cliente = cliente;
            return this;
        }

        public PedidoBuilder comProduto(String produto, double valor){
            this.produto = produto;
            this.valor = valor;
            return this;
        }

        public PedidoBuilder comEndereco(String endereco){
            this.enderecoPedido = endereco;
            return this;
        }

        public PedidoBuilder comCupomDesconto(String cupomDesconto){
            this.cupomDesconto = cupomDesconto;
            return this;
        }

        public PedidoBuilder comEmbalagemPresente(){
            this.embalagemPresente = true;
            return this;
        }

        public PedidoBuilder comEntregaExpressa(){
            this.entregaExpressa = true;
            return this;
        }

        public PedidoBuilder comTaxaFrete(double taxaFrete){
            this.taxaFrete = taxaFrete;
            return this;
        }

        //Construtor final
        public Pedido build(){
            if(cliente == null || produto == null){
                throw  new IllegalArgumentException("Cliente e produto são obrigatórios!");
            }

            return new Pedido(this);
        }
    }
}
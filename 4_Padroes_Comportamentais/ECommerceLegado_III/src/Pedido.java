public class Pedido {
    private double valor;
    private EstadoPedido estadoAtual;

    public Pedido(double valor) {
        this.valor = valor;
        this.estadoAtual = new EstadoNovo();
    }

    public double getValor() {
        return valor;
    }

    public void setStatus(EstadoPedido estadoAtual) {
        this.estadoAtual = estadoAtual;
    }

    public void cancelar() {
        estadoAtual.cancelar(this);
    }
}

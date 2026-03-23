public class DescontoBlackFriday implements TipoDesconto{
    @Override
    public double calcularDesconto(double valor) {
        return valor * 0.5; //50%
    }
}

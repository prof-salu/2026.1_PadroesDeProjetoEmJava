public class DescontoVIP implements TipoDesconto{
    @Override
    public double calcularDesconto(double valor) {
        return valor * 0.9; //desconto de 10%
    }
}

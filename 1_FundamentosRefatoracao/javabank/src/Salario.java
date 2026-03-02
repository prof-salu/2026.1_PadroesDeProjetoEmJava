public class Salario extends Conta{
    public Salario(double saldo, Mensageiro mensageiro) {
        super(saldo, mensageiro);
    }

    @Override
    public void debitarTaxaManutencao() {
        descontar(0);
    }
}

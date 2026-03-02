public class Poupanca extends Conta{

    public Poupanca(double saldo, Mensageiro mensageiro) {
        super(saldo, mensageiro);
    }

    @Override
    public void debitarTaxaManutencao() {
        descontar(5);
    }
}

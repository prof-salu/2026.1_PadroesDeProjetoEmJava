public class Corrente extends Conta{

    public Corrente(double saldo, Mensageiro mensageiro){
        super(saldo, mensageiro);
    }

    @Override
    public void debitarTaxaManutencao() {
        descontar(15);
    }
}

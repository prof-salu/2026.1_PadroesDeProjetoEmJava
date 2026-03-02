public abstract class Conta {
    private double saldo;
    private Mensageiro mensageiro;

    public Conta(double saldo, Mensageiro mensageiro){
        this.saldo = saldo;
        this.mensageiro = mensageiro;
    }

    public double getSaldo(){
        return saldo;
    }

    public void saque(double valor){
        if (valor > 0){
            this.saldo -= valor;
        }

        if(saldo < 0){
            mensageiro.enviarMensagem(getSaldo());
        }
    }

    protected void descontar(double valor){
        saldo -= valor;
    }

    public abstract void debitarTaxaManutencao();
}

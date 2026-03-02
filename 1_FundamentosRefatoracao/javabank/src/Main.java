public class Main {
    public static void main(String[] args) {
        Mensageiro sms = new MensageiroSMS();
        Mensageiro email = new MensageiroEmail();

        Conta cc = new Corrente(1000, sms);
        Conta cp = new Poupanca(1000, email);
        Conta salario = new Salario(1000, email);

        //Efetuando os saques
        cc.saque(1500);
        cp.saque(1500);
        salario.saque(1500);
        System.out.println("Saldos após os saques");
        System.out.println("[CC] Saldo: " + cc.getSaldo());
        System.out.println("[CP] Saldo: " + cp.getSaldo());
        System.out.println("[Salario] Saldo: " + salario.getSaldo());

        //Aplicando as taxas de manutenção

        cc.debitarTaxaManutencao();
        cp.debitarTaxaManutencao();
        salario.debitarTaxaManutencao();

        System.out.println("Aplicando as taxas de manutenção");
        System.out.println("[CC] Saldo: " + cc.getSaldo());
        System.out.println("[CP] Saldo: " + cp.getSaldo());
        System.out.println("[Salario] Saldo: " + salario.getSaldo());
    }
}
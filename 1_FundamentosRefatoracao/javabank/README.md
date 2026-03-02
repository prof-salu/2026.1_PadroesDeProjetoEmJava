classDiagram
%% Interface e Implementações (Notificadores)
class Notificador {
<<interface>>
+enviar(mensagem: String) void
}

    class NotificadorEmail {
        +enviar(mensagem: String) void
    }

    class NotificadorSMS {
        +enviar(mensagem: String) void
    }

    Notificador <|.. NotificadorEmail : Implements
    Notificador <|.. NotificadorSMS : Implements

    %% Classe Abstrata e Especializações (Contas)
    class Conta {
        <<abstract>>
        -saldo: double
        -notificador: Notificador
        +Conta(saldoInicial: double, notificador: Notificador)
        +sacar(valor: double) void
        +depositar(valor: double) void
        +getSaldo() double
        #descontar(valor: double) void
        +debitarTaxaManutencao()* void
    }

    class ContaCorrente {
        +ContaCorrente(saldoInicial: double, notificador: Notificador)
        +debitarTaxaManutencao() void
    }

    class ContaPoupanca {
        +ContaPoupanca(saldoInicial: double, notificador: Notificador)
        +debitarTaxaManutencao() void
    }

    class ContaSalario {
        +ContaSalario(saldoInicial: double, notificador: Notificador)
        +debitarTaxaManutencao() void
    }

    Conta <|-- ContaCorrente : Extends
    Conta <|-- ContaPoupanca : Extends
    Conta <|-- ContaSalario : Extends

    %% Relacionamento (Injeção de Dependência)
    Conta o-- Notificador : Tem-um (Agregação)

    %% Ponto de Entrada
    class Main {
        +main(args: String[]) void
    }
    
    Main ..> Conta : Instancia
    Main ..> Notificador : Instancia
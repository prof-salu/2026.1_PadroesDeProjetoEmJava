import java.util.ArrayList;
import java.util.List;

public class Checkout {

    private List<AcoesDePagamento> listaAcoes = new ArrayList<>();

    public void adicionarAcao(AcoesDePagamento acao){
        listaAcoes.add(acao);
    }

    public void finalizarCompra(Pedido pedido) {
        System.out.println("Pagamento aprovado!");

        for(AcoesDePagamento acao : listaAcoes) {
            acao.executar(pedido);
        }
    }
}

public class DatabaseConnection {
    //Singleton

    //1. Atributo estático
    private static DatabaseConnection instancia;

    //2. Contrutor privado.
    private DatabaseConnection() {
        System.out.println("[BANCO DE DADOS] Nova conexão física criada! (Consumindo recursos...)");
        try {
            // Simulando o tempo de abertura de uma conexão pesada
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //3. Ponto global de acesso
    public static DatabaseConnection getInstance(){
        if(instancia == null){
            instancia = new DatabaseConnection();
        }

        return DatabaseConnection.instancia;
    }

    public void salvarPedido(String dados) {
        System.out.println("[BANCO DE DADOS] Salvando pedido no banco: " + dados);
    }
}

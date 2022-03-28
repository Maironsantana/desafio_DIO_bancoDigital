public class ContaCorrente extends Conta{

    String tipoConta = "CORRENTE";

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        System.out.println("### EXTRATO CONTA CORRENTE ###");
        InfoGeralConta();
    }

    public void  imprimirNome(){
        super.getNomeCliente();
    }

    public Object imprimirTipo(){
        System.out.println("CONTA "+tipoConta);
        return null;
    }

}

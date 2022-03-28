public class ContaPoupanca extends Conta{

    String tipoConta = "POUPANÇA";

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        System.out.println("### EXTRATO CONTA POUPANÇA ###");
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

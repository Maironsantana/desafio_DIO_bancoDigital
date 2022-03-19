public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Mairon");

        Conta cc = new ContaCorrente(cliente1);
        Conta cp = new ContaPoupanca(cliente1);
        cc.depositar(100);
        cc.transferir(50,cp);
        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}

public class Main {

    public static void main(String[] args) {

        Banco banco = new Banco("Loren Ipsum Bank");

        Cliente cliente1 = new Cliente();
        cliente1.setNome("JOÃO");
        Conta cc = new ContaCorrente(cliente1);
        Conta cp = new ContaPoupanca(cliente1);

        banco.setContas(cc);
        banco.setContas(cp);
        banco.imprimirListContas();

        System.out.println("\nTESTANDO DEPÓSITO...\n.");
        cc.depositar(100);
        cc.imprimirExtrato();

        System.out.println("\nTESTANDO TRANSFERÊNCIA...\n.");;
        cc.transferir(50,cp);
        cp.imprimirExtrato();
        cc.imprimirExtrato();

    }
}
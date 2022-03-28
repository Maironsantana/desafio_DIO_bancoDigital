public abstract class Conta implements InterConta{

    private static final int AGENCIA_PADRAO = 10001;
    private static int SEQUENCIAL = 500001;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void getNomeCliente(){
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
    }

    protected void InfoGeralConta() {
        System.out.println(String.format("Agencia: %d", getAgencia()));
        System.out.println(String.format("Conta: %d", getNumero()));
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Saldo: %.2f", getSaldo()));
    }


    public int getAgencia() {
        return this.agencia;
    }

    public int getNumero() {
        return this.numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

}

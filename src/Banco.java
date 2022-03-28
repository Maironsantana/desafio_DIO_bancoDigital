import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Banco {

    private String nome = "Lorem Ipsum Bank";
    private List<Conta> contas = new ArrayList<Conta>();

    public Banco(String nome){
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(Conta conta){
        this.contas.add(conta);
    }

    public void imprimirListContas(){
        System.out.println("#### "+ getNome().toUpperCase()+" ####"+"\n#### LISTA DE CONTAS ####");
        for(Conta conta : contas){
            conta.imprimirTipo();
            conta.imprimirNome();
        }
    }

}

import java.util.Observable;
import java.util.Observer;

public class Cliente implements Observer {

    private String nome;
    private String ultimaNotificacao;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void cadastrar(Biblioteca biblioteca){ biblioteca.addObserver(this);}


    public void update(Observable biblioteca, Object arg) {
    this.ultimaNotificacao = this.nome + " cadastrado para receber o " + biblioteca.toString();
    }
}

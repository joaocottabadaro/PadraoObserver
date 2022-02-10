import java.util.Observable;

public class Biblioteca extends Observable {

    private String livro;
    private String autor;
private Integer anoPublicacao;



    public Biblioteca(String livro, String autor, Integer anoPublicacao ) {
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
        this.livro = livro;
    }

public void cadastrarLivro(){
        setChanged();
        notifyObservers();
}

    @Override
    public String toString() {
        return
                "livro='" + livro + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao
                ;
    }
}

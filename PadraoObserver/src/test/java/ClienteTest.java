import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClienteTest {


    @Test
   public void deveNotificarCliente(){
        Biblioteca biblioteca = new Biblioteca("Harry Potter e a Pedra Filosofal", "JK Rowling", 1997);
        Cliente cliente = new Cliente("Victor");
        cliente.cadastrar(biblioteca);
        biblioteca.cadastrarLivro();
        assertEquals("Victor cadastrado para receber o livro='Harry Potter e a Pedra Filosofal', autor='JK Rowling', anoPublicacao=1997", cliente.getUltimaNotificacao());
    }

    @Test
    public void deveNotificarClientes(){
        Biblioteca biblioteca = new Biblioteca("Harry Potter e o Calice de fogo", "JK Rowling", 2005);
        Cliente cliente = new Cliente("Victor");
        Cliente cliente2 = new Cliente("Pedro");
        cliente.cadastrar(biblioteca);
        cliente2.cadastrar(biblioteca);
        biblioteca.cadastrarLivro();
        assertEquals("Victor cadastrado para receber o livro='Harry Potter e o Calice de fogo', autor='JK Rowling', anoPublicacao=2005", cliente.getUltimaNotificacao());
        assertEquals("Pedro cadastrado para receber o livro='Harry Potter e o Calice de fogo', autor='JK Rowling', anoPublicacao=2005", cliente2.getUltimaNotificacao());
    }

    @Test
    public void naoDeveNotificarCliente(){
        Biblioteca biblioteca = new Biblioteca("Harry Potter e a Pedra Filosofal", "JK Rowling", 1997);
        Cliente cliente = new Cliente("Joao");
        biblioteca.cadastrarLivro();
        assertEquals(null , cliente.getUltimaNotificacao());
    }


    @Test
    public void deveNotificarCliente1(){
        Biblioteca biblioteca = new Biblioteca("Harry Potter e a ordem da fenix", "JK Rowling", 2002);
        Cliente cliente = new Cliente("Breno");
        Cliente cliente2 = new Cliente("Marco Aurelio");
        cliente.cadastrar(biblioteca);
        biblioteca.cadastrarLivro();
        assertEquals("Breno cadastrado para receber o livro='Harry Potter e a ordem da fenix', autor='JK Rowling', anoPublicacao=2002", cliente.getUltimaNotificacao());
        assertEquals(null , cliente2.getUltimaNotificacao());
    }
}

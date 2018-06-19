package lista.listaEncadeada;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hugo
 */
public class ListaEncadeadaTest {

    public ListaEncadeadaTest() {
    }

    @Test
    public void teste1() {
        ListaEncadeada listaEncadeada = new ListaEncadeada<>();
        assertEquals(true, listaEncadeada.estaVazia());
    }

    @Test
    public void teste2() {
        ListaEncadeada<Integer> listaEncadeada = new ListaEncadeada<>();
        listaEncadeada.inserir(1);
        listaEncadeada.inserir(2);
        listaEncadeada.inserir(3);
        listaEncadeada.inserir(4);
        listaEncadeada.inserir(5);
        assertEquals(false, listaEncadeada.estaVazia());
    }

    @Test
    public void teste3() {
        ListaEncadeada<Integer> listaEncadeada = new ListaEncadeada<>();
        listaEncadeada.inserir(5);

        NoLista<Integer> noLista = listaEncadeada.obterNo(0);
        int resultado = noLista.getInfo();
        assertEquals(noLista, listaEncadeada.obterNo(0));
    }

    @Test
    public void teste4() {
        ListaEncadeada<Integer> listaEncadeada = new ListaEncadeada<>();
        listaEncadeada.inserir(5);
        listaEncadeada.inserir(10);
        listaEncadeada.inserir(15);

        assertEquals(3, listaEncadeada.obterComprimento());
        assertEquals("15, 10, 5", listaEncadeada.toString());
    }

    @Test
    public void teste5() {
        ListaEncadeada<Integer> listaEncadeada = new ListaEncadeada<>();
        listaEncadeada.inserir(5);
        listaEncadeada.inserir(10);
        listaEncadeada.inserir(15);
        listaEncadeada.inserir(20);

        NoLista<Integer> noLista = listaEncadeada.buscar(20);
        int resultado = noLista.getInfo();
        assertEquals(20, resultado);
    }

    @Test
    public void teste7() {
        ListaEncadeada<Integer> listaEncadeada = new ListaEncadeada<>();
        listaEncadeada.inserir(5);
        listaEncadeada.inserir(10);
        listaEncadeada.inserir(15);
        listaEncadeada.inserir(20);
        assertEquals(null, listaEncadeada.buscar(50));
    }

    @Test
    public void teste8() {
        ListaEncadeada<Integer> listaEncadeada = new ListaEncadeada<>();
        listaEncadeada.inserir(5);
        listaEncadeada.inserir(10);
        listaEncadeada.inserir(15);
        listaEncadeada.inserir(20);
        listaEncadeada.retirar(20);
        assertEquals("15, 10, 5", listaEncadeada.toString());
    }

    @Test
    public void teste9() {
        ListaEncadeada<Integer> listaEncadeada = new ListaEncadeada<>();
        listaEncadeada.inserir(5);
        listaEncadeada.inserir(10);
        listaEncadeada.inserir(15);
        listaEncadeada.inserir(20);
        listaEncadeada.retirar(15);
        assertEquals("20, 10, 5", listaEncadeada.toString());
    }

    @Test
    public void teste10() {
        ListaEncadeada<Integer> listaEncadeada = new ListaEncadeada<>();
        listaEncadeada.inserir(5);
        listaEncadeada.inserir(10);
        listaEncadeada.inserir(15);
        listaEncadeada.inserir(20);

        NoLista<Integer> noLista = listaEncadeada.obterNo(0);
        int resultado = noLista.getInfo();
        assertEquals(20, resultado);
    }

}

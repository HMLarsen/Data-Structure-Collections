package lista;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hugo
 */
public class ListaOrdenadaTest {

    public ListaOrdenadaTest() {
    }

    @Test
    public void teste1() {
        ListaOrdenada<Integer> lo = new ListaOrdenada();
        lo.inserir(100);
        lo.inserir(20);
        lo.inserir(70);
        lo.inserir(1);
        assertEquals("1, 20, 70, 100", lo.toString());
    }

    @Test
    public void teste2() {
        ListaOrdenada<Integer> lo = new ListaOrdenada();
        lo.inserir(0);
        lo.inserir(10);
        lo.inserir(20);
        lo.inserir(30);
        lo.inserir(40);
        lo.inserir(50);
        lo.inserir(60);
        lo.inserir(70);
        lo.inserir(80);
        lo.inserir(90);
        lo.inserir(100);
        assertEquals(2, lo.buscar(20));
    }

    @Test
    public void teste3() {
        ListaOrdenada<Integer> lo = new ListaOrdenada();
        lo.inserir(0);
        lo.inserir(10);
        lo.inserir(20);
        lo.inserir(30);
        lo.inserir(40);
        lo.inserir(50);
        lo.inserir(60);
        lo.inserir(70);
        lo.inserir(80);
        lo.inserir(90);
        lo.inserir(100);
        assertEquals(4, lo.buscar(40));
    }

    @Test
    public void teste4() {
        ListaOrdenada<Integer> lo = new ListaOrdenada();
        lo.inserir(0);
        lo.inserir(10);
        lo.inserir(20);
        lo.inserir(30);
        lo.inserir(40);
        lo.inserir(50);
        lo.inserir(60);
        lo.inserir(70);
        lo.inserir(80);
        lo.inserir(90);
        lo.inserir(100);
        assertEquals(7, lo.buscar(70));
    }

    @Test
    public void teste5() {
        ListaOrdenada<Integer> lo = new ListaOrdenada();
        lo.inserir(0);
        lo.inserir(10);
        lo.inserir(20);
        lo.inserir(30);
        lo.inserir(40);
        lo.inserir(50);
        lo.inserir(60);
        lo.inserir(70);
        lo.inserir(80);
        lo.inserir(90);
        lo.inserir(100);
        assertEquals(10, lo.buscar(100));
    }

    @Test
    public void teste6() {
        ListaOrdenada<Integer> lo = new ListaOrdenada();
        lo.inserir(0);
        lo.inserir(10);
        lo.inserir(20);
        lo.inserir(30);
        lo.inserir(40);
        lo.inserir(50);
        lo.inserir(60);
        lo.inserir(70);
        lo.inserir(80);
        lo.inserir(90);
        lo.inserir(100);
        assertEquals(-1, lo.buscar(85));
    }

}

package lista;

import lista.simples.ListaEstatica;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hugo
 */
public class ListaEstaticaTest {

    public ListaEstaticaTest() {
    }
    
    @Test
    public void teste1() {
        ListaEstatica le = new ListaEstatica();
        le.inserir(5);
        le.inserir(10);
        le.inserir(15);
        le.inserir(20);
        assertEquals("5, 10, 15, 20", le.toString());
    }
    
    @Test
    public void teste2() {
        ListaEstatica le = new ListaEstatica();
        le.inserir(5);
        le.inserir(10);
        le.inserir(15);
        le.inserir(20);
        assertEquals(4, le.getTamanho());
    }
    
    @Test
    public void teste3() {
        ListaEstatica le = new ListaEstatica();
        le.inserir(5);
        le.inserir(10);
        le.inserir(15);
        le.inserir(20);
        assertEquals(2, le.buscar(15));
    }
    
    @Test
    public void teste4() {
        ListaEstatica le = new ListaEstatica();
        le.inserir(5);
        le.inserir(10);
        le.inserir(15);
        le.inserir(20);
        assertEquals(-1, le.buscar(30));
    }
    
    @Test
    public void teste5() {
        ListaEstatica le = new ListaEstatica();
        le.inserir(5);
        le.inserir(10);
        le.inserir(15);
        le.inserir(20);
        le.retirar(10);
        assertEquals("5, 15, 20, tamanho 3", le.toString() + ", tamanho " + le.getTamanho());
    }
    
    @Test
    public void teste6() {
        ListaEstatica le = new ListaEstatica();
        le.inserir(1);
        le.inserir(2);
        le.inserir(3);
        le.inserir(4);
        le.inserir(5);
        le.inserir(6);
        le.inserir(7);
        le.inserir(8);
        le.inserir(9);
        le.inserir(10);
        le.inserir(11);
        le.inserir(12);
        le.inserir(13);
        le.inserir(14);
        le.inserir(15);
        assertEquals("1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, tamanho 15",
                le.toString() + ", tamanho " + le.getTamanho());
    }
    
    @Test
    public void teste7() {
        ListaEstatica le = new ListaEstatica();
        le.inserir(5);
        le.inserir(10);
        le.inserir(15);
        le.inserir(20);
        assertEquals(20, le.obterElemento(3));
    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void teste8() {
        ListaEstatica le = new ListaEstatica();
        le.inserir(5);
        le.inserir(10);
        le.inserir(15);
        le.inserir(20);
        le.obterElemento(5);
    }
    
    @Test
    public void teste9() {
        ListaEstatica le = new ListaEstatica();
        le.inserir(5);
        le.inserir(10);
        le.inserir(15);
        le.inserir(20);
        le.liberar();
        assertEquals(true, le.estaVazia());
    }
    
    @Test
    public void teste10() {
        ListaEstatica le = new ListaEstatica();
        le.inserir(5);
        le.inserir(10);
        le.inserir(15);
        le.inserir(20);
        le.inverter();
        assertEquals("20, 15, 10, 5", le.toString());
    }
    
    @Test
    public void teste11() {
        ListaEstatica le = new ListaEstatica();
        le.inserir(5);
        le.inserir(10);
        le.inserir(15);
        le.inserir(20);
        le.inserir(25);
        le.inverter();
        assertEquals("25, 20, 15, 10, 5", le.toString());
    }

}
package lista.listaEncadeada;

import lista.listaDuplamenteEncadeada.ListaDupla;
import lista.listaDuplamenteEncadeada.NoListaDupla;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hugo
 */
public class ListaDuplaTest {

    public ListaDuplaTest() {
    }

    @Test
    public void teste1() {
        ListaDupla<Integer> listaDupla = new ListaDupla<>();
        listaDupla.inserir(5);
        listaDupla.inserir(10);
        listaDupla.inserir(15);
        listaDupla.inserir(20);
        assertEquals("20, 15, 10, 5", listaDupla.toString());
    }

    @Test
    public void teste2() {
        ListaDupla<Integer> listaDupla = new ListaDupla<>();
        listaDupla.inserir(5);
        listaDupla.inserir(10);
        listaDupla.inserir(15);
        listaDupla.inserir(20);
        
        NoListaDupla<Integer> noListaDupla = listaDupla.buscar(20);
        int resultado = noListaDupla.getInfo();
        assertEquals(20, resultado);
    }

    @Test
    public void teste3() {
        ListaDupla<Integer> listaDupla = new ListaDupla<>();
        listaDupla.inserir(5);
        listaDupla.inserir(10);
        listaDupla.inserir(15);
        listaDupla.inserir(20);
        
        NoListaDupla<Integer> noListaDupla = listaDupla.buscar(10);
        int resultado = noListaDupla.getInfo();
        assertEquals(10, resultado);
    }

    @Test
    public void teste4() {
        ListaDupla<Integer> listaDupla = new ListaDupla<>();
        listaDupla.inserir(5);
        listaDupla.inserir(10);
        listaDupla.inserir(15);
        listaDupla.inserir(20);
        listaDupla.retirar(20);
        assertEquals("15, 10, 5", listaDupla.toString());
        System.out.println("Teste 4:");
        listaDupla.exibirOrdemInversa();
    }

    @Test
    public void teste5() {
        ListaDupla<Integer> listaDupla = new ListaDupla<>();
        listaDupla.inserir(5);
        listaDupla.inserir(10);
        listaDupla.inserir(15);
        listaDupla.inserir(20);
        listaDupla.retirar(10);
        assertEquals("20, 15, 5", listaDupla.toString());
        System.out.println("Teste 5:");
        listaDupla.exibirOrdemInversa();
    }
    
    @Test
    public void teste6() {
        ListaDupla<Integer> listaDupla = new ListaDupla<>();
        listaDupla.inserir(5);
        listaDupla.inserir(10);
        listaDupla.inserir(15);
        listaDupla.inserir(20);
        listaDupla.retirar(5);
        assertEquals("20, 15, 10", listaDupla.toString());
        System.out.println("Teste 6:");
        listaDupla.exibirOrdemInversa();
    }
    
    @Test
    public void teste7() {
        ListaDupla<Integer> listaDupla = new ListaDupla<>();
        listaDupla.inserir(5);
        listaDupla.inserir(10);
        listaDupla.inserir(15);
        listaDupla.inserir(20);
        
        NoListaDupla<Integer> no5 = listaDupla.buscar(5);
        NoListaDupla<Integer> no10 = listaDupla.buscar(10);
        NoListaDupla<Integer> no15 = listaDupla.buscar(15);
        NoListaDupla<Integer> no20 = listaDupla.buscar(20);
        
        listaDupla.liberar();
        
        assertNull(no5.getAnterior());
        assertNull(no5.getProximo());
        assertNull(no10.getAnterior());
        assertNull(no10.getProximo());
        assertNull(no15.getAnterior());
        assertNull(no15.getProximo());
        assertNull(no20.getAnterior());
        assertNull(no20.getProximo());
        
        assertNull(listaDupla.getPrimeiro());
    }
}
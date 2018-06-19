package fila;

import fila.excecao.FilaCheiaException;
import fila.excecao.FilaVaziaException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hugo
 */
public class FilaVetorTest {

    public FilaVetorTest() {
    }

    @Test
    public void teste1() {
        FilaVetor<Integer> fila = new FilaVetor<>(1);
        assertEquals(true, fila.estaVazia());
    }

    @Test
    public void teste2() {
        FilaVetor<Integer> fila = new FilaVetor<>(5);
        fila.inserir(10);
        assertEquals(false, fila.estaVazia());
    }

    @Test
    public void teste3() {
        FilaVetor<Integer> fila = new FilaVetor<>(10);
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);

        int ultimoEmfilado = fila.retirar();
        assertEquals(10, ultimoEmfilado);
        ultimoEmfilado = fila.retirar();
        assertEquals(20, ultimoEmfilado);
        ultimoEmfilado = fila.retirar();
        assertEquals(30, ultimoEmfilado);
        assertEquals(true, fila.estaVazia());
    }

    @Test(expected = FilaCheiaException.class)
    public void teste4() {
        FilaVetor<Integer> fila = new FilaVetor<>(3);
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        fila.inserir(40);
    }

    @Test(expected = FilaVaziaException.class)
    public void teste5() {
        FilaVetor<Integer> fila = new FilaVetor<>(5);
        fila.retirar();
    }

    @Test
    public void teste6() {
        FilaVetor<Integer> fila = new FilaVetor<>(5);
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);

        int ultimoEmfilado = fila.peek();
        assertEquals(10, ultimoEmfilado);
        int ultimoRetirado = fila.retirar();
        assertEquals(10, ultimoRetirado);
    }

    @Test
    public void teste7() {
        FilaVetor<Integer> fila = new FilaVetor<>(5);
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        fila.liberar();
        assertEquals(true, fila.estaVazia());
    }

    @Test
    public void teste8() {
        FilaVetor<Integer> fila = new FilaVetor<>(5);
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        
        FilaVetor<Integer> fila2 = new FilaVetor<>(3);
        fila2.inserir(40);
        fila2.inserir(50);
        
        FilaVetor<Integer> novaFila = fila.criarFilaConcatenada(fila2);
        assertEquals("10, 20, 30, 40, 50", novaFila.toString());
        assertEquals("10, 20, 30", fila.toString());
        assertEquals("40, 50", fila2.toString());
        //assertEquals(8, novaFila.);
    }

}

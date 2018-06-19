package pilha;

import pilha.excecao.PilhaVaziaException;
import pilha.excecao.PilhaCheiaException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hugo
 */
public class PilhaVetorTest {

    public PilhaVetorTest() {
    }

    @Test
    public void teste1() {
        PilhaVetor<Integer> pilha = new PilhaVetor<>(1);
        assertEquals(true, pilha.estaVazia());
    }

    @Test
    public void teste2() {
        PilhaVetor<Integer> pilha = new PilhaVetor<>(5);
        pilha.push(10);
        assertEquals(false, pilha.estaVazia());
    }

    @Test
    public void teste3() {
        PilhaVetor<Integer> pilha = new PilhaVetor<>(10);
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        int ultimoEmpilhado = pilha.pop();
        assertEquals(30, ultimoEmpilhado);
        ultimoEmpilhado = pilha.pop();
        assertEquals(20, ultimoEmpilhado);
        ultimoEmpilhado = pilha.pop();
        assertEquals(10, ultimoEmpilhado);
        assertEquals(true, pilha.estaVazia());
    }

    @Test(expected = PilhaCheiaException.class)
    public void teste4() {
        PilhaVetor<Integer> pilha = new PilhaVetor<>(3);
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.push(40);
    }

    @Test(expected = PilhaVaziaException.class)
    public void teste5() {
        PilhaVetor<Integer> pilha = new PilhaVetor<>(5);
        pilha.pop();
    }

    @Test
    public void teste6() {
        PilhaVetor<Integer> pilha = new PilhaVetor<>(5);
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        int ultimoEmpilhado = pilha.peek();
        assertEquals(30, ultimoEmpilhado);
    }

    @Test
    public void teste7() {
        PilhaVetor<Integer> pilha = new PilhaVetor<>(5);
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.liberar();
        assertEquals(true, pilha.estaVazia());
    }

    @Test
    public void teste8() {
        PilhaVetor<Integer> pilha = new PilhaVetor<>(5);
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        
        PilhaVetor<Integer> pilha2 = new PilhaVetor<>(2);
        pilha2.push(40);
        pilha2.push(50);
        
        pilha.concatenar(pilha2);
        assertEquals("50, 40, 30, 20, 10", pilha.toString());
    }

}

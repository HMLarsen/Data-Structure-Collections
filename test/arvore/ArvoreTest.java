package arvore;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hugo
 */
public class ArvoreTest {

    public ArvoreTest() {
    }

    private Arvore<Integer> criarArvorePadrao() {
        NoArvore<Integer> no2 = new NoArvore<>(2);
        NoArvore<Integer> no5 = new NoArvore<>(5);
        NoArvore<Integer> no6 = new NoArvore<>(6);
        NoArvore<Integer> no7 = new NoArvore<>(7);
        no2.inserirFilho(no7);
        no2.inserirFilho(no6);
        no2.inserirFilho(no5);

        NoArvore<Integer> no3 = new NoArvore<>(3);
        NoArvore<Integer> no8 = new NoArvore<>(8);
        no3.inserirFilho(no8);

        NoArvore<Integer> no4 = new NoArvore<>(4);
        NoArvore<Integer> no9 = new NoArvore<>(9);
        NoArvore<Integer> no10 = new NoArvore<>(10);
        no4.inserirFilho(no10);
        no4.inserirFilho(no9);

        NoArvore<Integer> no1 = new NoArvore<>(1);
        no1.inserirFilho(no4);
        no1.inserirFilho(no3);
        no1.inserirFilho(no2);

        Arvore<Integer> arvore = new Arvore<>();
        arvore.setRaiz(no1);
        return arvore;
    }

    @Test
    public void teste1() {
        Arvore<Integer> arvore = criarArvorePadrao();
        assertEquals("<1<2<5><6><7>><3<8>><4<9><10>>>", arvore.toString());
    }

    @Test
    public void teste2() {
        Arvore<Integer> arvore = criarArvorePadrao();
        assertEquals(true, arvore.pertence(7));
    }

    @Test
    public void teste3() {
        Arvore<Integer> arvore = criarArvorePadrao();
        assertEquals(false, arvore.pertence(55));
    }

    @Test
    public void teste4() {
        Arvore<Integer> arvore = criarArvorePadrao();
        assertEquals(10, arvore.contarNos());
    }

}
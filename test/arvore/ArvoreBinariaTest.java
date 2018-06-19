package arvore;

import arvore.binaria.ArvoreBinaria;
import arvore.binaria.NoArvoreBinaria;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hugo
 */
public class ArvoreBinariaTest {

    public ArvoreBinariaTest() {
    }

    @Test
    public void teste1() {
        ArvoreBinaria<Integer> arv = new ArvoreBinaria<>();
        assertEquals(true, arv.estaVazia());
    }

    @Test
    public void teste2() {
        ArvoreBinaria<Integer> arv = new ArvoreBinaria<>();
        NoArvoreBinaria<Integer> no = new NoArvoreBinaria<>(5);
        arv.setRaiz(no);
        assertEquals(false, arv.estaVazia());
    }

    @Test
    public void teste3() {
        ArvoreBinaria<Integer> arv = new ArvoreBinaria<>();
        
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3, no5, no6);
        
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2, null, no4);
        
        NoArvoreBinaria<Integer> raiz = new NoArvoreBinaria<>(1, no2, no3);
        
        arv.setRaiz(raiz);
        assertEquals("<1<2<><4<><>>><3<5<><>><6<><>>>>", arv.toString());
    }

    @Test
    public void teste4() {
        ArvoreBinaria<Integer> arv = new ArvoreBinaria<>();
        
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3, no5, no6);
        
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2, null, no4);
        
        NoArvoreBinaria<Integer> raiz = new NoArvoreBinaria<>(1, no2, no3);
        
        arv.setRaiz(raiz);
        assertEquals(true, arv.pertence(1));
    }

    @Test
    public void teste5() {
        ArvoreBinaria<Integer> arv = new ArvoreBinaria<>();
        
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3, no5, no6);
        
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2, null, no4);
        
        NoArvoreBinaria<Integer> raiz = new NoArvoreBinaria<>(1, no2, no3);
        
        arv.setRaiz(raiz);
        assertEquals(true, arv.pertence(3));
    }

    @Test
    public void teste6() {
        ArvoreBinaria<Integer> arv = new ArvoreBinaria<>();
        
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3, no5, no6);
        
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2, null, no4);
        
        NoArvoreBinaria<Integer> raiz = new NoArvoreBinaria<>(1, no2, no3);
        
        arv.setRaiz(raiz);
        assertEquals(true, arv.pertence(6));
    }

    @Test
    public void teste7() {
        ArvoreBinaria<Integer> arv = new ArvoreBinaria<>();
        
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3, no5, no6);
        
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2, null, no4);
        
        NoArvoreBinaria<Integer> raiz = new NoArvoreBinaria<>(1, no2, no3);
        
        arv.setRaiz(raiz);
        assertEquals(false, arv.pertence(10));
    }

    @Test
    public void teste8() {
        ArvoreBinaria<Integer> arv = new ArvoreBinaria<>();
        
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3, no5, no6);
        
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2, null, no4);
        
        NoArvoreBinaria<Integer> raiz = new NoArvoreBinaria<>(1, no2, no3);
        
        arv.setRaiz(raiz);
        assertEquals(6, arv.contarNos());
    }

}

package ordenacao;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hugo
 */
public class OrdenacaoTest {

    public OrdenacaoTest() {
    }

    private void testar(OrdenacaoAbstract<Integer> ordenacao) {
        Integer[] vetor = new Integer[]{70, 2, 88, 15, 90, 30};
        ordenacao.setInfo(vetor);
        ordenacao.ordenar();

        assertSame(vetor[0], 2);
        assertSame(vetor[1], 15);
        assertSame(vetor[2], 30);
        assertSame(vetor[3], 70);
        assertSame(vetor[4], 88);
        assertSame(vetor[5], 90);
    }

    @Test
    public void teste1() {
        OrdenacaoBolha<Integer> ordenacaoBolha = new OrdenacaoBolha<>();
        testar(ordenacaoBolha);
    }

    @Test
    public void teste2() {
        OrdenacaoQuickSort<Integer> ordenacaoQuickSort = new OrdenacaoQuickSort<>();
        testar(ordenacaoQuickSort);
    }

    @Test
    public void teste3() {
        OrdenacaoMergeSort<Integer> ordenacaoMergeSort = new OrdenacaoMergeSort<>();
        testar(ordenacaoMergeSort);
    }

}

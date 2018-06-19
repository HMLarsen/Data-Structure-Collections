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

    @Test
    public void teste1() {
        Integer[] vetor = new Integer[6];
        vetor[0] = 70;
        vetor[1] = 2;
        vetor[2] = 88;
        vetor[3] = 15;
        vetor[4] = 90;
        vetor[5] = 30;

        OrdenacaoBolha<Integer> ordenacaoBolha = new OrdenacaoBolha<>();
        ordenacaoBolha.setInfo(vetor);
        ordenacaoBolha.ordenar();

        String ordem = "";

        for (int i = 0; i <= ordenacaoBolha.getInfo().length - 1; i++) {
            if (ordem.isEmpty()) {
                ordem = String.valueOf(ordenacaoBolha.getInfo()[i]);
            } else {
                ordem += "," + String.valueOf(ordenacaoBolha.getInfo()[i]);
            }
        }

        assertEquals("2,15,30,70,88,90", ordem);
    }

    @Test
    public void teste2() {
        Integer[] vetor = new Integer[6];
        vetor[0] = 70;
        vetor[1] = 2;
        vetor[2] = 88;
        vetor[3] = 15;
        vetor[4] = 90;
        vetor[5] = 30;

        OrdenacaoQuickSort<Integer> ordenacaoQuickSort = new OrdenacaoQuickSort<>();
        ordenacaoQuickSort.setInfo(vetor);
        ordenacaoQuickSort.ordenar();

        String ordem = "";

        for (int i = 0; i <= ordenacaoQuickSort.getInfo().length - 1; i++) {
            if (ordem.isEmpty()) {
                ordem = String.valueOf(ordenacaoQuickSort.getInfo()[i]);
            } else {
                ordem += "," + String.valueOf(ordenacaoQuickSort.getInfo()[i]);
            }
        }

        assertEquals("2,15,30,70,88,90", ordem);
    }

    @Test
    public void teste3() {
        Integer[] vetor = new Integer[6];
        vetor[0] = 70;
        vetor[1] = 2;
        vetor[2] = 88;
        vetor[3] = 15;
        vetor[4] = 90;
        vetor[5] = 30;

        OrdenacaoMergeSort<Integer> ordenacaoMergeSort = new OrdenacaoMergeSort<>();
        ordenacaoMergeSort.setInfo(vetor);
        ordenacaoMergeSort.ordenar();

        String ordem = "";

        for (int i = 0; i <= ordenacaoMergeSort.getInfo().length - 1; i++) {
            if (ordem.isEmpty()) {
                ordem = String.valueOf(ordenacaoMergeSort.getInfo()[i]);
            } else {
                ordem += "," + String.valueOf(ordenacaoMergeSort.getInfo()[i]);
            }
        }

        assertEquals("2,15,30,70,88,90", ordem);
    }

}

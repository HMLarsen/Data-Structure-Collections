package lista.ex3;

/**
 *
 * @author hugo
 */
public class ListaEstatica {

    private int[] info;
    private int tamanho;
    private static final int TAMANHO_PADRAO = 10;

    public ListaEstatica() {
        info = new int[TAMANHO_PADRAO];
        tamanho = 0;
    }

    public void inserir(int valor) {
        if (info.length == tamanho) {
            redimensionar();
        }

        info[tamanho] = valor;
        tamanho++;
    }

    private void redimensionar() {
        int[] novo = new int[tamanho + TAMANHO_PADRAO];

        for (int i = 0; i < tamanho; i++) {
            novo[i] = info[i];
        }

        info = novo;
    }

    public void exibir() {
        String str = "";

        for (int i = 0; i < tamanho; i++) {
            str += info[i] + ", ";
        }

        System.out.println(String.copyValueOf(str.toCharArray(), 0, str.length() - 2));
    }

    public int buscar(int valor) {
        for (int i = 0; i < tamanho; i++) {
            if (info[i] == valor) {
                return i;
            }
        }

        return -1;
    }

    public void retirar(int valor) {
        int posicao = buscar(valor);

        if (posicao > -1) {
            for (int i = posicao; i < tamanho - 1; i++) {
                info[i] = info[i + 1];
            }

            tamanho--;
        }
    }

    public void liberar() {
        info = new int[TAMANHO_PADRAO];
        tamanho = 0;
    }

    public void inverter() {
        int ultimoElemento = tamanho - 1;
        int elementoAtual;

        for (int i = 0; i < ultimoElemento; i++) {
            elementoAtual = info[i];
            info[i] = info[ultimoElemento];
            info[ultimoElemento] = elementoAtual;
            ultimoElemento--;
        }
    }

    public int obterElemento(int posicao) throws IndexOutOfBoundsException {
        if (posicao < tamanho) {
            return info[posicao];
        } else {
            throw new IndexOutOfBoundsException("Posição inexistente ou não ocupada!");
        }
    }

    public void inserirOrdenado(int valor) {
        if (info.length == tamanho) {
            redimensionar();
        }

        boolean comecaIncremento = false;
        int bckp = -1;

        for (int i = 0; i < tamanho; i++) {
            if ((info[i] <= valor) && (info[i + 1] >= valor)) {
                bckp = info[i + 1];
                info[i + 1] = valor;
                comecaIncremento = true;
                i = i + 2;
            }

            if (comecaIncremento) {
                info[i] = bckp;
                bckp = info[i + 1];
            }
        }

        info[tamanho] = valor;
        tamanho++;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        String str = "";

        for (int i = 0; i < tamanho; i++) {
            if (i == (tamanho - 1)) {
                str += info[i];
            } else {
                str += info[i] + ", ";
            }
        }

        return str;
    }
}

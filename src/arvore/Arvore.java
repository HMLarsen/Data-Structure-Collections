package arvore;

/**
 *
 * @author hugo
 */
public class Arvore<T> {

    private NoArvore<T> raiz;

    public Arvore() {
        raiz = null;
    }

    public void setRaiz(NoArvore<T> raiz) {
        this.raiz = raiz;
    }

    public NoArvore<T> getRaiz() {
        return raiz;
    }

    public boolean pertence(T info) {
        if (raiz == null) {
            return false;
        } else {
            return pertence(raiz, info);
        }
    }

    private boolean pertence(NoArvore<T> no, T info) {
        if (no.getInfo() == info) {
            return true;
        } else {
            NoArvore p = no.getPrimeiro();

            while (p != null) {
                if (pertence(p, info)) {
                    return true;
                }

                p = p.getProximo();
            }

            return false;
        }
    }

    @Override
    public String toString() {
        if (raiz == null) {
            return "";
        } else {
            return obterRepresentacaoTextual(raiz);
        }
    }

    private String obterRepresentacaoTextual(NoArvore<T> no) {
        String retorno = "<" + no.getInfo();
        NoArvore<T> p = no.getPrimeiro();

        while (p != null) {
            retorno += obterRepresentacaoTextual(p);
            p = p.getProximo();
        }

        return retorno + ">";
    }

    public int contarNos() {
        if (raiz == null) {
            return 0;
        } else {
            return contarNos(raiz);
        }
    }

    private int contarNos(NoArvore<T> no) {
        int qtde = 1;
        NoArvore<T> p = no.getPrimeiro();

        while (p != null) {
            qtde += contarNos(p);
            p = p.getProximo();
        }

        return qtde;
    }

}

package arvore;

/**
 *
 * @author hugo
 */
public class NoArvore<T> {

    private T info;
    private NoArvore<T> primeiro; //primeiro filho
    private NoArvore<T> proximo; //próximo irmão

    public NoArvore(T info) {
        this.info = info;
    }

    public void inserirFilho(NoArvore sa) {
        sa.setProximo(primeiro);
        primeiro = sa;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public NoArvore<T> getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(NoArvore<T> primeiro) {
        this.primeiro = primeiro;
    }

    public NoArvore<T> getProximo() {
        return proximo;
    }

    public void setProximo(NoArvore<T> proximo) {
        this.proximo = proximo;
    }
}

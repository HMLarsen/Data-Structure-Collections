package arvore.busca;

/**
 *
 * @author hlarsen
 */
public abstract class ArvoreBinariaAbstract<T> {

    private NoArvoreBinaria<T> raiz;

    public ArvoreBinariaAbstract() {
        raiz = null;
    }

    protected void setRaiz(NoArvoreBinaria<T> raiz) {
        this.raiz = raiz;
    }

    public NoArvoreBinaria<T> getRaiz() {
        return this.raiz;
    }

    public boolean estaVazia() {
        return raiz == null;
    }

    public boolean pertence(T info) {
        return buscar(info) != null;
    }

    public abstract NoArvoreBinaria<T> buscar(T info);

    @Override
    public String toString() {
        return arvorePre(raiz);
    }

    private String arvorePre(NoArvoreBinaria no) {
        if (no == null) {
            return "<>";
        }

        String retorno = "<";
        retorno += no.getInfo();
        retorno += arvorePre(no.getEsquerda());
        retorno += arvorePre(no.getDireita());
        retorno += ">";
        return retorno;
    }

    public int contarNos() {
        return contarNos(raiz);
    }

    private int contarNos(NoArvoreBinaria<T> no) {
        if (no == null) {
            return 0;
        }

        return contarNos(no.getEsquerda()) + contarNos(no.getDireita()) + 1;
    }

}

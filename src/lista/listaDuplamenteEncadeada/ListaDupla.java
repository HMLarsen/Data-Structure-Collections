package lista.listaDuplamenteEncadeada;

/**
 *
 * @author hugo
 */
public class ListaDupla<T> {

    private NoListaDupla<T> primeiro;

    public ListaDupla() {
        this.primeiro = null;
    }

    public NoListaDupla<T> getPrimeiro() {
        return primeiro;
    }

    public void inserir(T info) {
        NoListaDupla novo = new NoListaDupla(info);
        novo.setProximo(primeiro);
        novo.setAnterior(null);

        if (primeiro != null) {
            primeiro.setAnterior(novo);
        }

        primeiro = novo;
    }

    public boolean estaVazia() {
        return (primeiro == null);
    }

    public NoListaDupla<T> buscar(T info) throws IndexOutOfBoundsException {
        NoListaDupla<T> aux = primeiro;

        while (aux != null) {
            if (aux.getInfo().equals(info)) {
                return aux;
            }

            aux = aux.getProximo();
        }

        return null;
    }

    public void retirar(T info) {
        NoListaDupla p = buscar(info);

        if (p != null) { // achou
            if (primeiro == p) { // primeiro elemento ?
                primeiro = p.getProximo();
            } else {
                p.getAnterior().setProximo(p.getProximo());
            }

            if (p.getProximo() != null) { // não é o último?
                p.getProximo().setAnterior(p.getAnterior());
            }
        }
    }

    public int obterComprimento() {
        NoListaDupla<T> aux = primeiro;
        int count = 0;

        while (aux != null) {
            count++;
            aux = aux.getProximo();
        }

        return count;
    }

    public NoListaDupla<T> obterNo(int posicao) throws IndexOutOfBoundsException {
        if (posicao < 0) {
            throw new IndexOutOfBoundsException("A posição informada está negativa!");
        }

        NoListaDupla<T> aux = primeiro;
        int auxPosicao = 0;

        while (aux != null) {
            if (posicao == auxPosicao) {
                return aux;
            }

            auxPosicao++;
            aux = aux.getProximo();
        }

        throw new IndexOutOfBoundsException("A posição informada é maior que o tamanho da lista!");
    }
    
    public void liberar() {
        NoListaDupla<T> p = primeiro;
        NoListaDupla<T> bkp;

        while (p != null) {
            bkp = p.getProximo();
            p.setAnterior(null);
            p.setProximo(null);
            p = bkp;
        }
        
        primeiro = null;
    }
    
    public NoListaDupla<T> obterUltimo() {
        NoListaDupla<T> ultimo = primeiro;
        NoListaDupla<T> p = primeiro;
        
        while (p != null) {
            ultimo = p;
            p = p.getProximo();
        }
        
        return ultimo;
    }
    
    public void exibirOrdemInversa() {
        NoListaDupla<T> p = obterUltimo();

        while (p != null) {
            System.out.println(p.getInfo());
            p = p.getAnterior();
        }
    }

    @Override
    public String toString() {
        NoListaDupla<T> aux = primeiro;
        String str = "";

        while (aux != null) {
            if (aux == primeiro) {
                str += aux.getInfo();
            } else {
                str += ", " + aux.getInfo();
            }

            aux = aux.getProximo();
        }

        return str;
    }
}

package mapa;

/**
 *
 * @author hugo
 */
public class NoMapa<T> {

    private int chave;
    private T info;

    public int getChave() {
        return chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (getClass() != obj.getClass()) {
            return false;
        } else {
            NoMapa outro = (NoMapa) obj;
            return chave == outro.getChave();
        }
    }

}

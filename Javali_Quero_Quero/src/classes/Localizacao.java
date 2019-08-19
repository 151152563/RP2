package classes;

public class Localizacao {

    private int linha;
    private int coluna;

    public Localizacao(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
        //foi acrescentado o this.
    }

    public boolean equals(Object obj) {
        // retirei o instanceof
        if (obj instanceof Localizacao) {//voltado para o anterior, parece que foi alterado de forma incorreta
            Localizacao outra = (Localizacao) obj;
            return this.linha == outra.getLinha() && this.coluna == outra.getColuna();
        } else {
            return false;
        }

    }
// foi adicionad o set da linha e coluna.

    public String toString() {
        return linha + "," + coluna;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    @Override
    public int hashCode() {
        return (linha << 16) + coluna;
    }

    public int getLinha() {
        return linha;
    }

    public int getColuna() {
        return coluna;
    }
}

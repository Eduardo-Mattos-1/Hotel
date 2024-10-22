public class Quarto {
    private int numero;
    private int tipo;
    private float preco;
    private boolean disponivel=true;

    public Quarto() {
    }

    public Quarto(int numero, int tipo, float preco, boolean disponivel) {
        this.numero = numero;
        this.tipo = tipo;
        this.preco = preco;
        this.disponivel = disponivel;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public boolean isDisponivel() {
        return disponivel;
    }



    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Quarto{" +
                "numero=" + numero +
                ", tipo=" + tipo +
                ", preco=" + preco +
                ", disponivel=" + disponivel +
                '}';
    }
}

package blackjack;

public class blackjack {
    
    private String carta;
    private int valor;

    public blackjack(String carta, int valor) {
        this.carta = carta;
        this.valor = valor;
    }

    public String getCarta() {
        return carta;
    }
    public void setCarta(String carta) {
        this.carta = carta;
    }
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }

}

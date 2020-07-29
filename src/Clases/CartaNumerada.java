package Clases;

public class CartaNumerada extends Carta {

    private int num;
    private Palo palo;

    public CartaNumerada(int num, Palo palo) {
        super(num, palo);
        this.palo = palo;
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public Palo getPalo() {
        return palo;
    }

    @Override
    public String toString() {
        return num + " de " + this.getPalo();
    }

}

package Clases;

import java.util.*;

public class Mazo {

    private final ArrayList<Carta> LISTA_CARTAS;

    public Mazo() {
        this.LISTA_CARTAS = new ArrayList<>();
        this.generarCartas();
        Collections.shuffle(LISTA_CARTAS);
    }

    public boolean isMazoVacio() {
        return this.LISTA_CARTAS.isEmpty();
    }

    public int getCartasRestantes() {
        return this.LISTA_CARTAS.size();
    }

    public Carta retirarCarta() {
        return this.LISTA_CARTAS.remove(0);
    }

    private void generarCartas() {
        for (Palo palo : Palo.values()) {
            for (int i = 0; i < 12; i++) {
                this.LISTA_CARTAS.add(new CartaNumerada((i + 1), palo));
            }
        }
        for (int i = 0; i < 2; i++) {
            this.LISTA_CARTAS.add(new Comodin("/imagenes/comodin/comodin.jpg"));
        }
    }

//  TEST
//    private void generarCartas() {
//        this.LISTA_CARTAS.add(new CartaNumerada(1, Palo.ESPADA));
//        this.LISTA_CARTAS.add(new CartaNumerada(2, Palo.ESPADA));
//        this.LISTA_CARTAS.add(new CartaNumerada(3, Palo.ESPADA));
//        this.LISTA_CARTAS.add(new CartaNumerada(4, Palo.ESPADA));
//        this.LISTA_CARTAS.add(new CartaNumerada(5, Palo.ESPADA));
//        this.LISTA_CARTAS.add(new CartaNumerada(6, Palo.ESPADA));
//        this.LISTA_CARTAS.add(new CartaNumerada(7, Palo.ESPADA));
//        this.LISTA_CARTAS.add(new CartaNumerada(8, Palo.ESPADA));
//        this.LISTA_CARTAS.add(new CartaNumerada(9, Palo.ESPADA));
//        this.LISTA_CARTAS.add(new CartaNumerada(10, Palo.ESPADA));
//        this.LISTA_CARTAS.add(new CartaNumerada(11, Palo.ESPADA));
//        this.LISTA_CARTAS.add(new CartaNumerada(12, Palo.ESPADA));
//        this.LISTA_CARTAS.add(new CartaNumerada(1, Palo.COPA));
//        this.LISTA_CARTAS.add(new CartaNumerada(2, Palo.COPA));
//        this.LISTA_CARTAS.add(new CartaNumerada(3, Palo.COPA));
//        this.LISTA_CARTAS.add(new CartaNumerada(4, Palo.COPA));
//        this.LISTA_CARTAS.add(new CartaNumerada(5, Palo.COPA));
//        this.LISTA_CARTAS.add(new CartaNumerada(6, Palo.COPA));
//        this.LISTA_CARTAS.add(new CartaNumerada(7, Palo.COPA));
//        this.LISTA_CARTAS.add(new CartaNumerada(8, Palo.COPA));
//        this.LISTA_CARTAS.add(new CartaNumerada(9, Palo.COPA));
//        this.LISTA_CARTAS.add(new CartaNumerada(10, Palo.COPA));
//        this.LISTA_CARTAS.add(new CartaNumerada(11, Palo.COPA));
//        this.LISTA_CARTAS.add(new CartaNumerada(12, Palo.COPA));
//        this.LISTA_CARTAS.add(new CartaNumerada(1, Palo.ORO));
//        this.LISTA_CARTAS.add(new CartaNumerada(2, Palo.ORO));
//        this.LISTA_CARTAS.add(new CartaNumerada(3, Palo.ORO));
//        this.LISTA_CARTAS.add(new CartaNumerada(4, Palo.ORO));
//        this.LISTA_CARTAS.add(new CartaNumerada(5, Palo.ORO));
//        this.LISTA_CARTAS.add(new CartaNumerada(6, Palo.ORO));
//        this.LISTA_CARTAS.add(new CartaNumerada(7, Palo.ORO));
//        this.LISTA_CARTAS.add(new CartaNumerada(8, Palo.ORO));
//        this.LISTA_CARTAS.add(new CartaNumerada(9, Palo.ORO));
//        this.LISTA_CARTAS.add(new CartaNumerada(10, Palo.ORO));
//        this.LISTA_CARTAS.add(new CartaNumerada(11, Palo.ORO));
//        this.LISTA_CARTAS.add(new CartaNumerada(12, Palo.ORO));
//        this.LISTA_CARTAS.add(new CartaNumerada(1, Palo.BASTO));
//        this.LISTA_CARTAS.add(new CartaNumerada(2, Palo.BASTO));
//        this.LISTA_CARTAS.add(new CartaNumerada(3, Palo.BASTO));
//        this.LISTA_CARTAS.add(new CartaNumerada(4, Palo.BASTO));
//        this.LISTA_CARTAS.add(new CartaNumerada(5, Palo.BASTO));
//        this.LISTA_CARTAS.add(new CartaNumerada(6, Palo.BASTO));
//        this.LISTA_CARTAS.add(new CartaNumerada(7, Palo.BASTO));
//        this.LISTA_CARTAS.add(new CartaNumerada(8, Palo.BASTO));
//        this.LISTA_CARTAS.add(new CartaNumerada(9, Palo.BASTO));
//        this.LISTA_CARTAS.add(new CartaNumerada(10, Palo.BASTO));
//        this.LISTA_CARTAS.add(new CartaNumerada(11, Palo.BASTO));
//        this.LISTA_CARTAS.add(new CartaNumerada(12, Palo.BASTO));
//        this.LISTA_CARTAS.add(new Comodin());
//        this.LISTA_CARTAS.add(new Comodin());
//    }
} // Cierre de clase

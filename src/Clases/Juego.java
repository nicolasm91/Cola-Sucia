package Clases;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Juego {

    private final int NOMBRE_MAXCHAR = 16;
    private Jugador jug;
    private Mazo m;
    private VistaCS vista;

    public Juego() {
        this.vista = new VistaCS("Cola Sucia - Melichopulos Nicolás");
        this.vista.estadoDefault();
    }

    public void Iniciar() {
        this.vista.setVisible(true);
        this.vista.voltearCartaListener(new BotonVoltearCartaListener());
        this.vista.iniciarPartidaListener(new BotonIniciarListener());
        this.vista.hoverVoltearCartaListener(new BotonIniciarHoverListener());
    }

    private void inicializarJugador() throws NombreInvalidoException {
        String name = this.vista.preguntarNombre();
        if (name == null || name.equalsIgnoreCase("")) {
            throw new NombreInvalidoException("Nombre inválido | Debe ingresar un nombre");
        } else if (name.length() <= NOMBRE_MAXCHAR) {
            this.jug = new Jugador(name, 0);
        } else {
            throw new NombreInvalidoException("Nombre inválido | Excede 16 caracteres");
        }
    }

    public void iniciarPartida() {
        try {
            this.inicializarJugador();
            this.vista.partidaEnCurso(this.jug.getNombre(), this.jug.getScore());
            this.m = new Mazo();
            this.vista.actualizarCartasRestantes(this.m.getCartasRestantes());
        } catch (NombreInvalidoException ex) {
            this.vista.mostrarMensajeError(ex.getMessage());
        }
    }

    private String identificarCarta(Carta aux) {
        return aux.getimgdir().toLowerCase();

    }

    private void checkMazoVacio() {
        if (this.m.isMazoVacio()) {
            this.vista.vistaMazoVacio();
        }
    }

    public void jugada() {
        Carta aux = this.m.retirarCarta();
        this.vista.mostrarCarta(aux.toString());
        this.vista.mostrarFotoCarta(identificarCarta(aux));
        this.checkMazoVacio();
        if (isCSucio(aux)) {
            finPartida();
        } else {
            this.sumarPunto();
        }
        this.vista.actualizarCartasRestantes(this.m.getCartasRestantes());
    }

    private boolean isCSucio(Carta c) {
        if (c instanceof CartaNumerada) {
            return (((CartaNumerada) c).getNum() == 1 && ((CartaNumerada) c).getPalo() == Palo.ORO);
        }
        return false;
    }

    private void sumarPunto() {
        int score = this.jug.getScore();
        score++;
        this.jug.setScore(score);
        this.vista.actualizarScore(score);
    }

    private void finPartida() {
        //"Partida finalizada | Puntaje final: "+this.jug.getScore
        this.vista.finPartida(this.jug.getScore());
    }

    //          ------------------ Listeners ------------------
    private class BotonVoltearCartaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            jugada();
        }
    } // Cierre de clase privada

    private class BotonIniciarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            iniciarPartida();
        }
    } // Cierre de clase privada

    private class BotonIniciarHoverListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            vista.tamanioFuenteVoltearCarta(16);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            vista.tamanioFuenteVoltearCarta(14);
        }

    } // Cierre de clase privada

} // Cierre de clase Juego

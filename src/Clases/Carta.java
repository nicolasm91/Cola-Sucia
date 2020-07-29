package Clases;

public abstract class Carta {

    private String imgdir;

    // Constructor cartas numeradas
    public Carta(int num, Palo palo) {
        imgdir = "/imagenes/" + palo + "/" + num + ".jpg";
    }

    // Constructor comodines
    public Carta(String imgdir) {
        this.imgdir = imgdir;
    }

    public String getimgdir() {
        return this.imgdir;
    }

}

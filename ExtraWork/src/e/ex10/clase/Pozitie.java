package e.ex10.clase;

public class Pozitie implements Flyweight {
    private int x;
    private int y;
    private String culoareTricou;

    public Pozitie(String culoareTricou, int x, int y) {
        this.culoareTricou = culoareTricou;
        this.x = x;
        this.y = y;
    }

    @Override
    public void afiseaza(Dimensiune dimensiune) {
        System.out.printf("Omul de la poziția (%d;%d) cu tricou %s va fi desenat cu dimensiunile H:%.2f l:%.2f%n",
                this.x, this.y, this.culoareTricou, dimensiune.getInaltime(), dimensiune.getLatime());
    }

    public boolean eAcesta(int x, int y, String culoareTricou)
    {
        return this.x == x && this.y == y && this.culoareTricou.equals(culoareTricou);
    }
}

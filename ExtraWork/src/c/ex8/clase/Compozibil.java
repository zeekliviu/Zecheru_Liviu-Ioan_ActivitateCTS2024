package c.ex8.clase;

public interface Compozibil {
    void adauga(Compozibil c);
    void sterge(Compozibil c);
    Compozibil get(int index);
    void afiseaza(String indent);
}

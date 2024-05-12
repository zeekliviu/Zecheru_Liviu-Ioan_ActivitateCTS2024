package f.ex6.clase;

public interface Compozabil {
    void adauga(Compozabil compozabil);
    void sterge(Compozabil compozabil);
    Compozabil getCompozabil(int index);
    void afiseaza(String indent);
}

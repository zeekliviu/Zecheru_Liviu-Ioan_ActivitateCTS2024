package model.animale;

public class Leu extends Animal{
    public Leu(int varsta, int nrPicioare, String name) {
        super(varsta, nrPicioare, name);
    }

    @Override
    public void mananca(String mancare) {
        System.out.println(new StringBuilder("Leul ").append(getName()).append(" mănâncă ").append(mancare).append("."));
    }
}

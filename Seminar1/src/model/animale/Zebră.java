package model.animale;

public class Zebră extends Animal{
    public Zebră(int varsta, int nrPicioare, String name) {
        super(varsta, nrPicioare, name);
    }

    @Override
    public void mananca(String mancare) {
        System.out.println(new StringBuilder("Zebra ").append(getName()).append(" mănâncă ").append(mancare).append("."));
    }
}

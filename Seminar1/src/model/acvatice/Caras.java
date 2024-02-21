package model.acvatice;

public class Caras extends Peste {
    public Caras(int nrInotatoare, String rasa) {
        super(nrInotatoare, rasa);
    }

    @Override
    public void mananca(String mancare) {
        System.out.println(new StringBuilder("Carasul din rasa ").append(getRasa()).append(" mănâncă ").append(mancare).append("."));
    }
}

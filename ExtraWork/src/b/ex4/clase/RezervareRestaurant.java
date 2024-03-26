package b.ex4.clase;

import java.util.Date;

public class RezervareRestaurant implements Clonabil{
    private String nume;
    private int nrPersoane;
    private int oraRezervare;
    private Date dataRezervare;

    public RezervareRestaurant(String nume, int nrPersoane, int oraRezervare, Date dataRezervare) {
        this.nume = nume;
        if(nrPersoane < 0 || nrPersoane > 10)
            throw new IllegalArgumentException("Numarul de persoane trebuie sa fie intre 0 si 10 deoarece nu avem mese mari.");
        this.nrPersoane = nrPersoane;
        if(oraRezervare < 10 || oraRezervare > 23)
            throw new IllegalArgumentException("Ora rezervarii trebuie sa fie intre 10 si 23. Restaurantul este curățat între 0 și 10.");
        this.oraRezervare = oraRezervare;
        if(dataRezervare.before(new Date()))
            throw new IllegalArgumentException("Data rezervarii trebuie sa fie in viitor.");
        this.dataRezervare = dataRezervare;
    }
    @Override
    public Clonabil cloneaza() {
        RezervareRestaurant rezervareRestaurant = new RezervareRestaurant();
        rezervareRestaurant.nume = this.nume;
        rezervareRestaurant.nrPersoane = this.nrPersoane;
        rezervareRestaurant.oraRezervare = this.oraRezervare;
        rezervareRestaurant.dataRezervare = (Date) this.dataRezervare.clone();
        return rezervareRestaurant;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setNrPersoane(int nrPersoane) {
        if(nrPersoane < 0 || nrPersoane > 10)
            throw new IllegalArgumentException("Numarul de persoane trebuie sa fie intre 0 si 10 deoarece nu avem mese mari.");
        this.nrPersoane = nrPersoane;
    }

    public void setOraRezervare(int oraRezervare) {
        if(oraRezervare < 10 || oraRezervare > 23)
            throw new IllegalArgumentException("Ora rezervarii trebuie sa fie intre 10 si 23. Restaurantul este curățat între 0 și 10.");
        this.oraRezervare = oraRezervare;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("RezervareRestaurant{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", oraRezervare=").append(oraRezervare);
        sb.append(", dataRezervare=").append(dataRezervare);
        sb.append('}');
        return sb.toString();
    }

    public void setDataRezervare(Date dataRezervare) {
        if(dataRezervare.before(new Date()))
            throw new IllegalArgumentException("Data rezervarii trebuie sa fie in viitor.");
        this.dataRezervare = dataRezervare;
    }

    private RezervareRestaurant() {
    }
}

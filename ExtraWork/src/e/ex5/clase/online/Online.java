package e.ex5.clase.online;

import org.apache.commons.lang3.RandomStringUtils;

public class Online implements Rezervabil{

    private String meci;
    private int loc;
    private String nume;

    public Online(int loc, String meci, String nume) {
        this.loc = loc;
        this.meci = meci;
        this.nume = nume;
    }

    public String getMeci() {
        return meci;
    }

    public int getLoc() {
        return loc;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public void iaBilet() {
        System.out.printf("S-a achiziționat bilet prin eBilet.ro la meciul %s, loc %d pe numele %s. ID Bilet: %s%n", this.meci, this.loc, this.nume, RandomStringUtils.randomNumeric(8));
    }
}

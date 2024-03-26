package f.ex3.clase;

public class AutobuzLinie {
    private String model;
    private String sofer;
    private boolean opresteLaCapat;
    private boolean deschideUsi;
    private String textEcran;

    AutobuzLinie() {
        this.model = "";
        this.sofer = "";
        this.opresteLaCapat = false;
        this.deschideUsi = false;
        this.textEcran = "";
    }

    void setModel(String model) {
        this.model = model;
    }

    void setSofer(String sofer) {
        this.sofer = sofer;
    }

    void setOpresteLaCapat(boolean opresteLaCapat) {
        this.opresteLaCapat = opresteLaCapat;
    }

    void setDeschideUsi(boolean deschideUsi) {
        this.deschideUsi = deschideUsi;
    }

    void setTextEcran(String textEcran) {
        this.textEcran = textEcran;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AutobuzLinie{");
        sb.append("model='").append(model).append('\'');
        sb.append(", sofer='").append(sofer).append('\'');
        sb.append(", opresteLaCapat=").append(opresteLaCapat);
        sb.append(", deschideUsi=").append(deschideUsi);
        sb.append(", textEcran='").append(textEcran).append('\'');
        sb.append('}');
        return sb.toString();
    }

    AutobuzLinie cloneaza() {
            AutobuzLinie clone = new AutobuzLinie();
            clone.textEcran = this.textEcran;
            clone.deschideUsi = this.deschideUsi;
            clone.opresteLaCapat = this.opresteLaCapat;
            clone.sofer = this.sofer;
            clone.model = this.model;
            return clone;
    }
}

package f.ex3.clase;

public class BuilderAutobuz implements Construibil{
    private AutobuzLinie autobuz = new AutobuzLinie();
    @Override
    public AutobuzLinie build() {
        AutobuzLinie clona = autobuz.cloneaza();
        autobuz = new AutobuzLinie();
        return clona;
    }
    public BuilderAutobuz setModel(String model) {
        autobuz.setModel(model);
        return this;
    }

    public BuilderAutobuz setSofer(String sofer) {
        autobuz.setSofer(sofer);
        return this;
    }

    public BuilderAutobuz setOpresteLaCapat(boolean opresteLaCapat) {
        autobuz.setOpresteLaCapat(opresteLaCapat);
        return this;
    }

    public BuilderAutobuz setDeschideUsi(boolean deschideUsi) {
        autobuz.setDeschideUsi(deschideUsi);
        return this;
    }

    public BuilderAutobuz setTextEcran(String textEcran) {
        autobuz.setTextEcran(textEcran);
        return this;
    }
}

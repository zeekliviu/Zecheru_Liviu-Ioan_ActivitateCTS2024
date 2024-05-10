package d.ex16.clase;

public abstract class ContBancar {
    protected ContBancar succesor;

    protected void setSuccesor(ContBancar succesor) {
        this.succesor = succesor;
    }

    public abstract void plateste(float suma);
}

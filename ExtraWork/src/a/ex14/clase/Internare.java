package a.ex14.clase;

public abstract class Internare {
    protected Internare succesor;
    public abstract void interneaza(String numePacient);
    public void setSuccesor(Internare succesor){this.succesor = succesor;}
}

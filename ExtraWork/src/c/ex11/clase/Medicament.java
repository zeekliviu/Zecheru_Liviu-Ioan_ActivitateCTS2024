package c.ex11.clase;

public class Medicament {
    private String cod;
    private Platibil modalitate;
    private float pret;

    public Medicament(String cod, float pret)
    {
        this.cod = cod;
        this.modalitate = new Cash();
        this.pret = pret;
        System.out.printf("Prețul inițial al medicamentului: %.2f RON%n", this.pret);
    }

    public void setModalitate(Platibil modalitate) {
        this.modalitate = modalitate;
    }

    public void plateste(float suma)
    {
        if(this.pret>0 && suma <= this.pret && this.pret > 0.01f)
        {
            System.out.printf("Din prețul medicamentului cu codul %s. ", this.cod);
            this.modalitate.plateste(suma);
            this.pret-=suma;
        }
//        else
//        {
//            System.out.printf("Nu poți achita %.2f deoarece valoarea rămasă de achitat este %.2f. Nu eliberăm rest!%n", suma, this.pret);
//        }
    }

    public float getPret() {
        return pret;
    }
}

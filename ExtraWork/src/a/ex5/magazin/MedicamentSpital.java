package a.ex5.magazin;

public class MedicamentSpital implements Medicament{
    @Override
    public void achizitioneazaMedicament() {
        prezintaReteta();
        System.out.println("Medicament achiziționat de la spital.");
    }

    @Override
    public void prezintaReteta() {
        System.out.println("Rețetă prezentată.");
    }
}

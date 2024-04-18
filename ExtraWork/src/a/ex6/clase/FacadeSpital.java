package a.ex6.clase;

public class FacadeSpital {
    private Medic medic;
    private Salon salon;

    public FacadeSpital(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }

    public void sePoateInterna(Pacient pacient)
    {
        if(medic.eInternabil(pacient) && pacient.eInternabil() && salon.eVreunPatLiber())
        {
            System.out.println("Se poate interna!");
        }
        else {
            System.out.println("Nu se poate interna!");
        }
    }
}

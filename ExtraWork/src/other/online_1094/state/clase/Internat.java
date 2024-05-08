package other.online_1094.state.clase;

public class Internat implements StarePacient{
    Internat(){}
    @Override
    public void setareStare(Pacient pacient) {
       pacient.setStare(this);
    }
}

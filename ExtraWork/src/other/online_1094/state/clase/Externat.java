package other.online_1094.state.clase;

public class Externat implements StarePacient{
    Externat(){}
    @Override
    public void setareStare(Pacient pacient) {
        pacient.setStare(this);
    }
}

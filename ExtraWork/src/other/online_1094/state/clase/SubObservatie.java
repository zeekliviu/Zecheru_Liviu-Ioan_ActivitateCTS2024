package other.online_1094.state.clase;

public class SubObservatie implements StarePacient{
    SubObservatie(){}
    @Override
    public void setareStare(Pacient pacient) {
        pacient.setStare(this);
    }
}

package other.singletonregistry.clase;

import java.time.LocalDate;

public class Aviz {
    private LocalDate dataLimita;

    public Aviz(LocalDate dataLimita) {
        this.dataLimita = dataLimita;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Aviz{");
        sb.append("dataLimita=").append(dataLimita);
        sb.append('}');
        return sb.toString();
    }
}

package a.ex4.clase;

public class Reteta implements Clonabil{
    private float cantitateMorfina;
    private float cantitateChinina;
    private float cantitateErgotamina;

    public Reteta(float cantitateMorfina, float cantitateChinina, float cantitateErgotamina) {
        if(cantitateMorfina < 0 || cantitateMorfina > 100)
            throw new IllegalArgumentException("Cantitatea de morfina trebuie sa fie intre 0 si 100");
        this.cantitateMorfina = cantitateMorfina;
        if(cantitateChinina < 0 || cantitateChinina > 25)
            throw new IllegalArgumentException("Cantitatea de chinina trebuie sa fie intre 0 si 25");
        this.cantitateChinina = cantitateChinina;
        if(cantitateErgotamina < 0 || cantitateErgotamina > 50)
            throw new IllegalArgumentException("Cantitatea de ergotamina trebuie sa fie intre 0 si 50");
        this.cantitateErgotamina = cantitateErgotamina;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Reteta{");
        sb.append("cantitateMorfina=").append(cantitateMorfina);
        sb.append(", cantitateChinina=").append(cantitateChinina);
        sb.append(", cantitateErgotamina=").append(cantitateErgotamina);
        sb.append('}');
        return sb.toString();
    }

    public void setCantitateMorfina(float cantitateMorfina) {
        if(cantitateMorfina < 0 || cantitateMorfina > 100)
            throw new IllegalArgumentException("Cantitatea de morfina trebuie sa fie intre 0 si 100");
        this.cantitateMorfina = cantitateMorfina;
    }

    public void setCantitateChinina(float cantitateChinina) {
        this.cantitateChinina = cantitateChinina;
    }

    public void setCantitateErgotamina(float cantitateErgotamina) {
        this.cantitateErgotamina = cantitateErgotamina;
    }

    private Reteta() {
    }

    @Override
    public Clonabil copiaza() {
        Reteta reteta = new Reteta();
        reteta.cantitateMorfina = this.cantitateMorfina;
        reteta.cantitateChinina = this.cantitateChinina;
        reteta.cantitateErgotamina = this.cantitateErgotamina;
        return reteta;
    }
}

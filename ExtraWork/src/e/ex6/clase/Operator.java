package e.ex6.clase;

public class Operator {
    public boolean verificaBilet(Buletin buletin, Bilet bilet)
    {
        if(buletin.getNume().equals(bilet.getNume()))
        {
            System.out.println("Numele din buletin corespunde cu cel de pe bilet");
        }
        else
        {
            System.out.println("Numele de pe buletin nu corespunde cu cel de pe bilet!");
        }
        return buletin.getNume().equals(bilet.getNume());
    }

    public boolean cautataPolitie(Politie politie, Buletin buletin)
    {
        if(!politie.eCautatDePolitie(buletin))
        {
            System.out.println("Persoana nu e cautata de politie.");
        }
        else
        {
            System.out.println("Persoana e cautata de politie!");
        }
        return politie.eCautatDePolitie(buletin);
    }

    public boolean areAntecedente(Persoana persoana)
    {
        if(persoana.isCazier())
        {
            System.out.println("Persoana are antecedente!");
        }
        else
        {
            System.out.println("Persoana nu are antecedente.");
        }
        return persoana.isCazier();
    }

    public void permiteAcces(Politie politie, Persoana persoana)
    {
        if(verificaBilet(persoana.getBuletin(), persoana.getBilet()) && !cautataPolitie(politie, persoana.getBuletin()) && !areAntecedente(persoana))
        {
            System.out.println("Acces permis!");
        }
        else
        {
            System.out.println("Acces interzis!");
        }
    }
}

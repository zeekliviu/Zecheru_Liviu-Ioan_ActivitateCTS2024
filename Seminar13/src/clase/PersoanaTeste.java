package clase;

import org.junit.*;

import java.util.List;

import static org.junit.Assert.*;

public class PersoanaTeste {

    @Test
    public void getSexM() {
        IPersoana persoana = new Persoana("gigi", "10214034103312");
        assertEquals("M", persoana.getSex());
    }

    @Test
    public void getSexF()
    {
        IPersoana persoana = new Persoana("Gina", "2435345421461");
        assertEquals("F", persoana.getSex());
    }

    @Test
    public void getSuperiorBoundary()
    {
        IPersoana persoana = new Persoana("Andrei", "8021103123456");
        assertEquals("F", persoana.getSex());
    }

    @Test
    public void getSexCrossCheck()
    {
        IPersoana persoana = new Persoana("Maria", "5029874199431");
        assertEquals(persoana.getSex(), ((Persoana)persoana).CNP.charAt(0) % 2 == 0 ? "F" : "M");
    }

    @Test(expected = IllegalArgumentException.class)
    public void getSexErrorCondition()
    {
        IPersoana persoana = new Persoana("Gigi", "a");
        persoana.getSex();
    }

    @Test(expected = IllegalArgumentException.class)
    public void getError()
    {
        IPersoana persoana = new Persoana("Gigi", "");
        persoana.getSex();
    }

    @Test(timeout=100)
    public void getPerformance()
    {
       IPersoana persoana = new Persoana("Ana", "7824347261234");
       persoana.getSex();
    }

    @Test
    public void getConformSex()
    {
        IPersoana persoana = new Persoana("Ana", "7824347261234");
        assertTrue(List.of("M", "F").contains(persoana.getSex()));
    }

    @Test
    public void getSexOrder()
    {
        IPersoana femeie = new Persoana("Maria", "29283570987123");
        IPersoana barbat = new Persoana("Marian", "1394875098123");
        assertTrue(barbat.getSex().compareTo(femeie.getSex()) > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getSexNullValue()
    {
        IPersoana femeie = new Persoana("Maria", null);
        femeie.getSex();
    }

    @Test(expected = IllegalArgumentException.class)
    public void getSexCardinalitate()
    {
        IPersoana femeie = new Persoana("Maria", "09283570987123");
        femeie.getSex();
    }
}
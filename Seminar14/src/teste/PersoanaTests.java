package teste;

import clase.Persoana;
import org.junit.*;

import static org.junit.Assert.*;

public class PersoanaTests {

    @Test
    public void getSexReturnM() {
        Persoana persoana1= new Persoana("Mihai", "1021103123456");
        assertEquals("M", persoana1.getSex());
    }

    @Test
    public void getSexReturnF() {
        Persoana persoana1= new Persoana("Maria", "2021103123456");
        assertEquals("F", persoana1.getSex());
    }

    @Test
    public void testSuperiorBoundary(){
        Persoana persoana2= new Persoana("Maria", "8021103123456");
        assertEquals("F", persoana2.getSex());
    }

    @Test
    public void getSexCrossCheck(){
        Persoana persoana=new Persoana("Maria","60893674912");
        String expected=(persoana.CNP.charAt(0)%2==0? "F": "M");
        assertEquals(expected,persoana.getSex());
    }

    @Test(expected= IllegalArgumentException.class)
    public void getSexErrorCondition(){
        Persoana persoana=new Persoana("Maria","s0893674912");
        persoana.getSex();
    }

    @Test(expected = IllegalArgumentException.class)
    public void getErrorEmptyString(){
        Persoana persoana=new Persoana("Maria", "");
        persoana.getSex();
    }

    @Test(timeout = 200)
    public void getPerformance(){
        Persoana persoana=new Persoana("Ana", "68790985673543");
        persoana.getSex();
    }

    @Test
    public void getConformance(){
        Persoana persoana=new Persoana("Maria", "18790985673543");
        String expected=persoana.getSex();
        assertTrue(expected.equals("F")||expected.equals("M"));
    }

    @Test
    public void getSexOrder(){
        Persoana persoana=new Persoana("Maria", "28790985673543");
        Persoana persoana1=new Persoana("Marius", "18790985673543");
        String expected=persoana.getSex();
        assertTrue(persoana1.getSex().compareTo(persoana.getSex()) > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getSexNullValue(){
        Persoana persoana=new Persoana("Maria", null);
        persoana.getSex();
    }

    @Test(expected = IllegalArgumentException.class)
    public void getSexZeroValue(){
        Persoana persoana=new Persoana("Maria", "0000000000000");
        persoana.getSex();
    }








}
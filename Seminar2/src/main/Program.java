package main;

import java.io.FileNotFoundException;
import java.util.List;

import clase.Aplicant;
import readers.AngajatReader;
import readers.AplicantReader;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		try {
			AplicantReader angajatReader = new AngajatReader();
			listaAngajati = angajatReader.read("angajati.txt");
			for(Aplicant angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}

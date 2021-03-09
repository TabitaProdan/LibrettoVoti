package it.polito.tdp.librettovoti.model;

import java.util.ArrayList;
import java.util.List;

public class Libretto {

	private List <Voto> voti;
	//può essere poi una ArrayList o LinkedList
	//ma è buon uso all'inizio definirla in base all'interfaccia List
	//e poi si implementa a seconda delle esigente
	
	//la lista è un interfaccia di tipo generics
	//può contenere diversi tipi di oggetti 
	//il cui tipo va specificato tra <>
	
	public Libretto () {
		this.voti = new ArrayList <>(); //qua abbiamo inizializzato la variabile
	}
	
	public void add (Voto v) {
		voti.add(v);
	}
	
	public String toString() {
		String s = "";
		for (Voto v : this.voti) {
			s += v.toString() + "\n";
		}
		return s;
	}
	
}

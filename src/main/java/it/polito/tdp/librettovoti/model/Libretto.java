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
	
	//Punto 2 più possibilità
	/*
	public void stampaVotiUguali (int punteggio) {
		//sitampa i voti sulla console 
		//se io gli voglio sull'interfaccia fìgrafica da qui non lo posso farre		
	}
	
	public String votiUguali (int punteggio) {
		//sarà poi il chiamnte, che può essere un altra classe
		//che li stampa sulla console 
		//o l'interfaccia grafica 
		//a stamparli
		//però cosa devo stampare, il nome, la data ??
		//il prossimo metodo risolve
	}
	*/
	public List<Voto> votiUguali2 (int punteggio){
		//unico problema è che espone all'esterno 
		//la struttura dati interna
		
		//lo stesso ogggetto contenuto in due liste diverse
		List<Voto> risultato = new ArrayList<>();
		
		for (Voto v : this.voti) {
			if (v.getVoto()==punteggio) {
				risultato.add(v);
			}
		}
		return risultato;	
	}

	public Libretto votiUguali (int punteggio) {
		//io ti restituisco il libretto e poi tu decidi cosa fartene
		
		Libretto ris = new Libretto ();
		
		for (Voto v : this.voti) {
			if (v.getVoto()==punteggio) {
				//ris.voti.add(v);
				ris.add(v);
			}
		}
		return ris;
	}
	
	public Voto ricercaCorso (String nomeCorso) {
		Voto ris = null;
		
		for (Voto v : this.voti) {
			if (v.getNomeCorso().equals(nomeCorso)) {
				ris = v;
				break;
			}
		}
		return ris;
	}
}

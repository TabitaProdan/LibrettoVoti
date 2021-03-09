package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;

//POJO - PLAIN OLD JAVA OBJECT
//JAVA BEAN 
//Semplice contenitore dati, non ha logica

//il seguente blocco permette di fornire una
//documentazione della classe o di un metodo 
/**
 * Memorizza il risultato di un esame singolo
 * @author tabita
 *
 */

public class Voto {
	private String nomeCorso;
	private int voto;
	private LocalDate data;
	
	/**
	 * Costruttore della classe voto
	 * @param nomeCorso 
	 * @param voto
	 * @param data
	 */
	
	public Voto(String nomeCorso, int voto, LocalDate data) {
		super();
		this.nomeCorso = nomeCorso;
		this.voto = voto;
		this.data = data;
	}

	public String getNomeCorso() {
		return nomeCorso;
	}

	public void setNomeCorso(String nomeCorso) {
		this.nomeCorso = nomeCorso;
	}

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Esame " + nomeCorso + " superato con " + voto + " in data " + data;
	}
	
	
	
	
	
	
}

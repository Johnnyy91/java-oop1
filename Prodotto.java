package org.lessons.java.shop;



public class Prodotto {

	
	String nome;
	String descrizione;
	float prezzo;
	float iva;
	int codice;
	
	
	
	public Prodotto(int codice, String nome, String descrizione, float prezzo, int iva) {
		super();
		
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.iva = iva;
		this.codice=codice;
	}
	
	
	
	float prezzoBase() {
		
		return prezzo;
	}
	
	float prezzoConIva() {
		return (prezzo * iva) /100;
	}

	String nomeCompleto() {
		return nome + codice;
	}
	
}

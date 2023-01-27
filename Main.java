package org.lessons.java.shop;

import java.util.Random;

public class Main {

	public static void main(String[] args) {


		Random r = new Random();
		
		int codiceRandom = r.nextInt(100000000);
		
		Prodotto p  = new Prodotto(codiceRandom,"Tablet","Top gamma",300, 22);
		

		System.out.println("Codice prodotto : " + codiceRandom);
	

		System.out.println("Prezzo base del prodotto : " + p.prezzoBase());
		

		System.out.println("Prezzo + I.V.A. del prodotto : " + p.prezzoConIva());
		
		

			System.out.println("Nome completo del prodotto : " + p.nomeCompleto());
	}
	}


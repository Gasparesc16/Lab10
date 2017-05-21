package it.polito.tdp.porto.model;

public class Creator {
	
	private Author autore;
	private Paper articolo;
	
	public Creator(Author autore, Paper articolo) {
	
		this.autore = autore;
		this.articolo = articolo;
	}

	/**
	 * @return the autore
	 */
	public Author getAutore() {
		return autore;
	}

	/**
	 * @return the articolo
	 */
	public Paper getArticolo() {
		return articolo;
	}
	
	
	
	

}

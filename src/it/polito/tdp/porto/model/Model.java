package it.polito.tdp.porto.model;

import java.util.List;

import it.polito.tdp.porto.db.PortoDAO;

public class Model {
	
	private PortoDAO dao;
	
	private List<Author> autori = null;
	
	
	
	
	

	public Model() {
		
		
		dao = new PortoDAO();
	}






	public List<Author> getAllAuthor() {
		
		if(this.autori == null)
			this.autori = dao.getAllAuthor();
			 
		
		
		return autori;
	}

}

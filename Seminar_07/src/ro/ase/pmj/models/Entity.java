package ro.ase.pmj.models;

import java.io.Serializable;

public class Entity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	
	Entity(int id){
		this.id = id;
	}
	
	Entity(){
		
	}

}

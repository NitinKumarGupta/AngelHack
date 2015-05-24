package models;

import javax.persistence.*;

import play.db.ebean.Model;
import play.db.ebean.Model.Finder;
import play.data.validation.Constraints.*;

@Entity
public class Menu extends Model {
	
	public Long id;
	public String dishName;
	public int dishPrice;
	@ManyToOne
	public Caterer caterer;
	
	public Menu(){
		
	}
	
	public Menu(String dishName, int dishPrice){
		
		this.dishName = dishName;
		this.dishPrice = dishPrice;
	}
	
}

package models;

import java.util.List;

import javax.persistence.*;

import play.db.ebean.Model;
import play.db.ebean.Model.Finder;
import play.data.validation.Constraints.*;

@Entity
public class Caterer extends Model{
	@Id
	public Long id;
	public String catererName;
	public String email;
	public String address;
	public String location;
	public String cuisine;
	@OneToMany(mappedBy="caterer")
	public List<Menu> menu;
	@OneToMany(mappedBy="caterer")
	public List<Review> reviews;
	public Caterer(){
		
	}
	
	public Caterer(String catererName, String email,  String address){
		this.catererName = catererName;
		this.email = email;
		this.address = address;
	}
	
	public static Finder<Long, Caterer> find(){
		return new Finder<>(Long.class, Caterer.class);
	}


}

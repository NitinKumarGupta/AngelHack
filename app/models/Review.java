package models;
import javax.persistence.*;

import play.db.ebean.Model;
import play.db.ebean.Model.Finder;
import play.data.validation.Constraints.*;

@Entity
public class Review {
	@Id
	public Long id;
	public String reviewerName;
	public String review;
	public int rating;
	@ManyToOne
	public Caterer caterer;
	
	public Review(){
		
	}
	
	public Review(String reviewerName, String review, int rating){
		this.reviewerName = reviewerName;
		this.review = review;
		this.rating = rating;
	}

}

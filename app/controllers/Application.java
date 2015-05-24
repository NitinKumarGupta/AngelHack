package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(home.render());
    }
    
    public static Result find(String catererName){
    	return ok(caterers.render(catererName));
    }

    public static Result details(){
    	return ok(caterer.render());
    }
    
    public static Result review(){
    	return ok(review.render());
    }
    
    
}

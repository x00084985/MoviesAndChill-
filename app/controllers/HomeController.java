package controllers;

import play.api.Environment;
import play.mvc.*;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import views.html.*;

import models.*;
/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
public Result movies() {

	List<Movie> moviesList = Movie.findAll();

	return ok(movies.render());
	
	}	

    	public Result index() {
        return ok(index.render());
    }

 	public Result action() {
        return ok(action.render());
    }

	public Result comedy() {
        return ok(comedy.render());
    }
	
	public Result form() {
        return ok(form.render());
    }
	
	public Result help() {
        return ok(help.render());
    }
	
	public Result horror() {
        return ok(horror.render());
    }
	
	
	public Result newsaction_1() {
        return ok(newsaction_1.render());
    }
	
	public Result newsaction_2() {
        return ok(newsaction_2.render());
    }
	
	public Result newsaction_3() {
        return ok(newsaction_3.render());
    }
	
	public Result newscomedy_1() {
        return ok(newscomedy_1.render());
    }
	
	public Result newscomedy_2() {
        return ok(newscomedy_2.render());
    }
	
	public Result newscomedy_3() {
        return ok(newscomedy_3.render());
    }
	
	public Result newshorror_1() {
        return ok(newshorror_1.render());
    }
	
	public Result newshorror_2() {
        return ok(newshorror_2.render());
    }

	public Result newshorror_3() {
        return ok(newshorror_3.render());
    }
	
	
	public Result signup() {
    	return ok(signup.render());	
    }



}

package models;

import java.util.*;
import javax.persistence.*;

import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;
@Entity
public class Movie extends Model {

	@Id
	private Long id;
	
	@Constraints.Required
	private String name;
	
	@Constraints.Required
	private String description;
	
	@Constraints.Required
	private int stock;
	
	@Constraints.Required
	private double price;

	public Movie() {
	}

	public Movie(Long id, String name, String description,
		       int stock, double price) {
		this.id=id;
		this.name=name;
		this.description=description;
		this.stock=stock;
		this.price=price;
	}

	public static Finder<Long,Movie> find = new Finder<Long,Movie>     							(Movie.class);

	public static List<Movie> findAll() {
		return Movie.find.all();
	}

	public Long getid() {
		return id;
	}

	public void setid(Long id) {
		this.id = id;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {	
		this.name = name;
	}

	public String getdescription() {
		return description;
	}

	public void setdescription(String description) {
		this.description = description;
	}
	
	public int getstock() {
		return stock;	
	}

	public void setstock(int stock) {
		this.stock = stock;
	}

	public double getprice() {
		return price;
	}
	
	public void setprice(double price) {
		this.price = price;
	}

}


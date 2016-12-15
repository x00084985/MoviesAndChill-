package Model;

import java.util.*;
//import javax.persistence.*;

import play.data.format.*;
import play.data.validation.*;

//import com.avaje.ebean.*;

@Entity 
public class Product extends Model{

   @ID
   private Long ID;
   private String MovieName;
   private String Genre;
   private int Stock;
   private double Price;

   public Product() {
   }
 

   public Product(Long ID, String MovieName, String Genre, int Stock, double    Price){
    this.ID = ID;
    this.MovieName = MovieName;
    this.Genre =  Genre;
    this.Stock = Stock;
    this.Price = Price;
}  
   public Long getID() {
     return id; 
  }

  public void setID(Long ID) {
     this.ID = ID;
 }
  public String getMovieName() {
     return MovieName;
}
  public void setMovieName(String MovieName){ 
     this.MovieName = MovieName;
}
   public String getGenre() {
     return Genre;
}
  public void setGenre(String Genre){ 
     this.Genre = Genre;
}
    public int getStock() {
     return Stock;
}
  public void setStock(int Stock){ 
     this.Stock = Stock;
}
   public double getPrice() {
     return Price;
}
  public void setPrice(double Price){ 
     this.Price = Price;
}
}


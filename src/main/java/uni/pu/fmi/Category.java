package uni.pu.fmi;
import java.util.*;

/**
 * 
 */
public class Category {

	  private String categoryName;
	    public Set<Offer> offer;
	    
    public Category() {
    }

    public String getName() {
       
        return categoryName;
    }

    public void setName(String categoryName) {
      this.categoryName=categoryName;
    }
}
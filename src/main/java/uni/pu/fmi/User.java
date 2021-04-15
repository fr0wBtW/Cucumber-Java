package uni.pu.fmi;
import java.util.*;


public class User {
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String password;
    public Set<Offer> Offer;
    

    public User() {
    }
    public User(String username, String password, String email) {
		this.username = username;
		this.password = password;
		this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
  this.username=username;
    }

 
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
    password=this.password;
    }

    
    public String getFirstName() {
     
        return firstName;
    }


    public void setFirstname(String firstName) {
        this.firstName=firstName;
        
    }


    public String getLastName() {
    
        return lastName;
    }


    public void setLastName(String lastName) {
  this.lastName=lastName;
    }


    public String getEmail() {
      
        return email;
    }


    public void setEmail(String email) {
        this.email=email;
    }

    public void getOffer() {
    	this.Offer=Offer;
    }


    public void setOffer(Set<Offer> offer) {
      this.Offer=offer;
      
    }
    
    public void addOffer(Offer Offer) {
    	((Set<Offer>) Offer).add(Offer);
    }
    }


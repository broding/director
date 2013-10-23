package nl.basroding.director.models.data;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author basroding
 */
@Entity
public class Driver 
{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    
    private String forName;
    
    private String surName;
    
    @ManyToOne
    private Team team;
    
    @ManyToOne
    private Country country;
    
    @Embedded
    private Attributes attributes;

    public int getId() 
    {
	return id;
    }

    public String getSurName() 
    {
	return surName;
    }
    
    public String getForName() 
    {
	return forName;
    }

    public Team getTeam() 
    {
	return team;
    }

    public Country getCountry() 
    {
	return country;
    }

    public Attributes getAttributes() 
    {
	return attributes;
    }

    public void setCountry(Country country) 
    {
	this.country = country;
    }
    
    public static Driver createDummy()
    {
	Driver driver = new Driver();
	
	driver.forName = "Bas";
	driver.surName = "Roding";
	driver.attributes = Attributes.createDummy();
	
	return driver;
    }
}

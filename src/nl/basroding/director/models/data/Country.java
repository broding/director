package nl.basroding.director.models.data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author basroding
 */
@Entity
public class Country 
{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String name;

    public int getId() 
    {
	return id;
    }

    public String getName() 
    {
	return name;
    }
    
    public static Country createDummy()
    {
	Country country = new Country();
	
	country.name = "Holland";
	
	return country;
    }
}

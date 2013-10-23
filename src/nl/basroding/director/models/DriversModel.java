package nl.basroding.director.models;

import nl.basroding.director.models.data.Driver;
import java.util.ArrayList;
import org.hibernate.Session;

/**
 *
 * @author basroding
 */
public class DriversModel extends Model
{
    private ArrayList<Driver> drivers;
    
    public DriversModel()
    {
	drivers = new ArrayList<Driver>();
    }
    
    public ArrayList<Driver> getAll()
    {
	return drivers;
    }
    
    public Driver getWithId(int id)
    {
	for(Driver driver : drivers)
	{
	    if(driver.getId() == id)
		return driver;
	}
	
	return null;
    }

    @Override
    public void loadFromDatabase(Session session) 
    {
	drivers = (ArrayList<Driver>) session.createCriteria(Driver.class).list();
    }
}

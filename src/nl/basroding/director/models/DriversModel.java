package nl.basroding.director.models;

import nl.basroding.director.models.data.Driver;
import com.almworks.sqlite4java.SQLiteConnection;
import com.almworks.sqlite4java.SQLiteException;
import com.almworks.sqlite4java.SQLiteStatement;
import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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
	return null;
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
    public void loadFromDatabase(SQLiteConnection db) 
    {
	try {
	    SQLiteStatement statement = db.prepare("SELECT * FROM drivers");
	    //statement.dispose();
	} 
	catch (SQLiteException ex) {
	    Logger.getLogger(DriversModel.class.getName()).log(Level.SEVERE, null, ex);
	}
    }
    
    
}

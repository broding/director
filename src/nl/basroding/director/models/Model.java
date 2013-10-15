package nl.basroding.director.models;

import com.almworks.sqlite4java.SQLiteConnection;
import com.almworks.sqlite4java.SQLiteException;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author basroding
 */
public class Model 
{
    protected SQLiteConnection getDatabaseConnection()
    {
	try {
	    SQLiteConnection db = new SQLiteConnection(new File("/tmp/database"));
	    db.open(true);
	    
	    return db;
	} 
	
	catch (SQLiteException ex) {
	    Logger.getLogger(DriversModel.class.getName()).log(Level.SEVERE, null, ex);
	}
	
	return null;
    }
    
    public void loadFromDatabase(SQLiteConnection db)
    {
	
    }
}

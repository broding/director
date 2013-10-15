package nl.basroding.director;

import com.almworks.sqlite4java.SQLiteConnection;
import com.almworks.sqlite4java.SQLiteException;
import com.badlogic.gdx.Gdx;
import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import nl.basroding.director.models.DriversModel;
import nl.basroding.director.models.Model;

/**
 *
 * @author basroding
 */
public final class ModelCollection 
{
    private DriversModel driversModel;
    private ArrayList<Model> models;
    
    public ModelCollection()
    {
	models = new ArrayList<Model>();
	
	addModel(driversModel = new DriversModel());
	
	File file = Gdx.files.internal("savefile.sqlite").file();
	SQLiteConnection db = new SQLiteConnection(file);
	
	try {
	    db.open(true);
	    
	    for(Model model : models)
		model.loadFromDatabase(db);
	   
	} catch (SQLiteException ex) {
	    Logger.getLogger(ModelCollection.class.getName()).log(Level.SEVERE, null, ex);
	}
	
	db.dispose();
    }
    
    private void addModel(Model model)
    {
	models.add(model);
    }

    public DriversModel getDriversModel() 
    {
	return driversModel;
    }
}

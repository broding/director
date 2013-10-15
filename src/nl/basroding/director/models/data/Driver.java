package nl.basroding.director.models.data;

import com.almworks.sqlite4java.SQLiteException;
import com.almworks.sqlite4java.SQLiteStatement;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author basroding
 */
public class Driver 
{
    private int id;
    private String forName;
    private String surName;
    private short attributeSteering;
    private short attributeConcentration;
    private short attributePressure;
    
    public Driver(SQLiteStatement statement)
    {
	try {
	    id = statement.columnInt(0);
	    forName = statement.columnString(1);
	    surName = statement.columnString(2);
	} catch (SQLiteException ex) {
	    Logger.getLogger(Driver.class.getName()).log(Level.SEVERE, null, ex);
	}
    }

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

    public short getAttributeSteering()
    {
	return attributeSteering;
    }

    public short getAttributeConcentration() 
    {
	return attributeConcentration;
    }

    public short getAttributePressure()
    {
	return attributePressure;
    }
}

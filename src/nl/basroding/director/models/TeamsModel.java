package nl.basroding.director.models;

import nl.basroding.director.models.data.Driver;
import com.almworks.sqlite4java.SQLiteConnection;
import com.almworks.sqlite4java.SQLiteException;
import com.almworks.sqlite4java.SQLiteStatement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import nl.basroding.director.models.data.Team;
import org.hibernate.Session;

/**
 *
 * @author basroding
 */
public class TeamsModel extends Model
{
    private ArrayList<Team> teams;
    
    public TeamsModel()
    {
	teams = new ArrayList<Team>();
    }
    
    public ArrayList<Team> getAll()
    {
	return teams;
    }
    
    public Team getWithId(int id)
    {
	for(Team team : teams)
	{
	    if(team.getId() == id)
		return team;
	}
	
	return null;
    }

    @Override
    public void loadFromDatabase(Session session) 
    {
	teams = (ArrayList<Team>) session.createCriteria(Team.class).list();
    }
}

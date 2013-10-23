package nl.basroding.director.models.data;

import java.util.ArrayList;
import java.util.List;
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
public class Team 
{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    
    private String name;
    
    @OneToMany
    private List<Driver> drivers = new ArrayList<Driver>();
    
    public int getId() 
    {
	return id;
    }

    public String getName() 
    {
	return name;
    }

    public List<Driver> getDrivers() 
    {
	return drivers;
    }
    
    public static Team createDummy()
    {
	Team team = new Team();
	
	team.name = "Ferrari";
	
	return team;
    }
}

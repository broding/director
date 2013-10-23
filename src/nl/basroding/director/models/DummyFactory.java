package nl.basroding.director.models;

import nl.basroding.director.models.data.Country;
import nl.basroding.director.models.data.Driver;
import nl.basroding.director.models.data.Team;
import org.hibernate.Session;

/**
 *
 * @author basroding
 */
public class DummyFactory
{
    public static void insertDummyData(Session session)
    {
	Country country = Country.createDummy();
	Driver driver1 = Driver.createDummy();
	driver1.setCountry(country);
	Driver driver2 = Driver.createDummy();
	driver2.setCountry(country);
	Driver driver3 = Driver.createDummy();
	driver3.setCountry(country);
	Driver driver4 = Driver.createDummy();
	driver4.setCountry(country);
	
	Team team1 = Team.createDummy();
	Team team2 = Team.createDummy();
	Team team3 = Team.createDummy();
	
	team1.getDrivers().add(driver2);
	team1.getDrivers().add(driver1);
	team1.getDrivers().add(driver3);
	team1.getDrivers().add(driver4);
	
	session.save(country);
	
	session.save(team1);
	session.save(team2);
	session.save(team3);
	
	session.save(driver1);
	session.save(driver2);
	session.save(driver3);
	session.save(driver4);
	
    }
}

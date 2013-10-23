package nl.basroding.director.models.data;
import javax.persistence.Embeddable;

/**
 *
 * @author basroding
 */
@Embeddable
public class Attributes 
{
    private int handling;
    private int concentration;
    private int pressure;
    private int singlelap;
    private int wetweather;
    private int endurance;
    private int setup;
    private int influence;

    public int getHandling() 
    {
	return handling;
    }

    public int getConcentration() 
    {
	return concentration;
    }

    public int getPressure()
    {
	return pressure;
    }

    public int getSinglelap() 
    {
	return singlelap;
    }

    public int getWetweather()
    {
	return wetweather;
    }

    public int getEndurance() 
    {
	return endurance;
    }

    public int getSetup()
    {
	return setup;
    }

    public int getInfluence()
    {
	return influence;
    }
    
    public static Attributes createDummy()
    {
	Attributes attributes = new Attributes();
	
	attributes.handling = 50;
	attributes.concentration = 50;
	attributes.pressure = 50;
	attributes.singlelap = 50;
	attributes.wetweather = 50;
	attributes.endurance = 50;
	attributes.setup = 50;
	attributes.influence = 50;
	
	return attributes;
    }
}

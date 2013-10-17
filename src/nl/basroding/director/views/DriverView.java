package nl.basroding.director.views;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import nl.basroding.director.models.data.Driver;
import nl.basroding.director.views.actors.BigDriverProfile;

/**
 *
 * @author basroding
 */
public class DriverView extends View
{
    private Driver driver;
    
    public DriverView(Driver driver)
    {
	this.driver = driver;
    }
    
    @Override
    public void initialize() 
    {
	BigDriverProfile profile = new BigDriverProfile(driver);
	profile.setX(400);
	profile.setY(400);
	
	Texture texture = new Texture("images/backgrounds/grojean.jpg");
	Image image = new Image(texture);
	
	addActor(image);
	addActor(profile);
    }
}

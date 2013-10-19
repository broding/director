package nl.basroding.director.views.actors.team.driver;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import nl.basroding.director.models.data.Driver;
import nl.basroding.director.views.actors.basic.TitledWindow;

/**
 *
 * @author basroding
 */
public class DriverAttributes extends TitledWindow
{
    private Driver driver;
    
    public DriverAttributes(Driver driver)
    {
	super("Attributes", 536, 270);
	
	this.driver = driver;
	
	Label nameLabel = new Label(driver.getForName() + " " + driver.getSurName(), new Skin(Gdx.files.internal("images/ui_atlas/skin.skin")));
	
	this.addActor(nameLabel);
    }
}

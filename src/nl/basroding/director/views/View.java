package nl.basroding.director.views;

import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import nl.basroding.director.Director;
import nl.basroding.director.controllers.Controller;

/**
 *
 * @author basroding
 */
public class View extends Group
{
    private Director director;
    private Skin defaultSkin;
    
    public View()
    {
    }
    
    final public void setup(Director director, Skin defaultSkin)
    {
	this.defaultSkin = defaultSkin;
	this.director = director;
    }
    
    public void initialize()
    {
	
    }
    
    public void update()
    {
	
    }
    
    protected void switchController(Controller controller)
    {
	this.director.setController(controller);
    }

    protected Skin getDefaultSkin() 
    {
	return defaultSkin;
    }
    
}

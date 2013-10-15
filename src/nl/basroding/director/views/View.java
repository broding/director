package nl.basroding.director.views;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

/**
 *
 * @author basroding
 */
public class View 
{
    private Stage stage;
    
    public View()
    {
    }
    
    final public void setup(Stage stage)
    {
	this.stage = stage;
    }
    
    public void initialize()
    {
	
    }
    
    public void update()
    {
	
    }
    
    protected void addActor(Actor actor)
    {
	stage.addActor(actor);
    }
}

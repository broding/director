package nl.basroding.director.views;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import nl.basroding.director.views.components.Component;

/**
 *
 * @author basroding
 */
public class View 
{
    private Stage stage;
    private Skin defaultSkin;
    
    public View()
    {
    }
    
    final public void setup(Stage stage, Skin defaultSkin)
    {
	this.defaultSkin = defaultSkin;
	this.stage = stage;
    }
    
    public void initialize()
    {
	
    }
    
    public void update()
    {
	
    }
    
    public void draw()
    {
        stage.act(Gdx.graphics.getDeltaTime());
        stage.draw();
    }
    
    public void dispose(InputMultiplexer multiplexer)
    {
	multiplexer.removeProcessor(stage);
    }
    
    protected void addActor(Actor actor)
    {
	stage.addActor(actor);
    }
    
    protected void addActor(Component component)
    {
	component.setup(defaultSkin);
	component.initialize();
	stage.addActor(component);
    }
    

    public Skin getDefaultSkin() 
    {
	return defaultSkin;
    }
    
}

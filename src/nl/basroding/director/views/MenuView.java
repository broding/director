package nl.basroding.director.views;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.SelectBox;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import nl.basroding.director.controllers.DriverController;

/**
 *
 * @author basroding
 */
public class MenuView extends View
{
    public TextButton buttonNextDriver;
    
    @Override
    public void initialize()
    {
	buttonNextDriver = new TextButton("Next", this.getDefaultSkin());
	buttonNextDriver.addListener(new ChangeListener() {

	    @Override
	    public void changed(ChangeListener.ChangeEvent event, Actor actor) 
	    {
		DriverController newController = new DriverController();
		switchController(newController);
		newController.showId(1);
	    }
	    
	});
	Texture texture = new Texture("images/backgrounds/grojean.jpg");
	Image image = new Image(texture);
	
	addActor(image);
	addActor(buttonNextDriver);
    }
}

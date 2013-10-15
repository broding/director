package nl.basroding.director.views;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.SelectBox;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;

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
	Texture texture = new Texture("images/backgrounds/grojean.jpg");
	Image image = new Image(texture);
	
	addActor(image);
	addActor(buttonNextDriver);
    }
}

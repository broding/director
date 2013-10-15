package nl.basroding.director.views.components;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import nl.basroding.director.models.data.Driver;

/**
 *
 * @author basroding
 */
public class BigDriverProfile extends Component
{
    private Driver driver;
    
    public BigDriverProfile(Driver driver)
    {
	this.driver = driver;
    }
    
    @Override
    public void initialize()
    {
	Texture texture = new Texture("images/tests/grosjean.jpg");
	
	Label nameLabel = new Label(driver.getForName() + " " + driver.getSurName(), this.getDefaultSkin());
	Image image = new Image(texture);
	image.setX(0);
	image.setY(0);
	
	this.addActor(image);
	this.addActor(nameLabel);
    }
}

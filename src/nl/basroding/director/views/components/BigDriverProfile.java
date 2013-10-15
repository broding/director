package nl.basroding.director.views.components;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import nl.basroding.director.models.data.Driver;

/**
 *
 * @author basroding
 */
public class BigDriverProfile extends Component
{
    public BigDriverProfile(Driver driver)
    {
	Texture texture = new Texture("images/tests/grosjean.jpg");
	Image image = new Image(texture);
	image.setX(0);
	image.setY(0);
	
	this.addActor(image);
    }
}

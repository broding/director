package nl.basroding.director.views;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.Rectangle;
import nl.basroding.director.views.actors.basic.FilledRectangle;

/**
 *
 * @author basroding
 */
public class TopbarView extends View
{
    public final static int HEIGHT = 50;
    
    @Override
    public void initialize()
    {
	FilledRectangle bg = new FilledRectangle(new Rectangle(0, Gdx.graphics.getHeight() - HEIGHT, Gdx.graphics.getWidth(), HEIGHT), new Color(0f, 0f, 0f, 1f));
	
	addActor(bg);
    }
}

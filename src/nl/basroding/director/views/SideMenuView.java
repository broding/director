package nl.basroding.director.views;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.SelectBox;
import nl.basroding.director.views.actors.basic.FilledRectangle;

/**
 *
 * @author basroding
 */
public class SideMenuView extends View
{
    
    @Override
    public void initialize()
    {
	FilledRectangle bg = new FilledRectangle(new Rectangle(0, 0, 200, 800));
	
	addActor(bg);
    }
}

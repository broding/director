package nl.basroding.director.views.actors.basic;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Group;

/**
 *
 * @author basroding
 */
public class Window extends Group
{
    public final static int MARGIN = 8;
    
    private FilledRectangle background;
    private FilledRectangle border;
    
    public Window(int width, int height)
    {
	this.setWidth(width + 2);
	this.setHeight(height + 4);
	
	background = new FilledRectangle(new Rectangle(0,0, width, height), new Color(0.98f, 0.98f, 0.98f, 1f));
	border = new FilledRectangle(new Rectangle(-1,-3, width+2, height+4), new Color(0.83f, 0.83f, 0.83f, 1f));
	
	addActor(border);
	addActor(background);
	
    }
}

package nl.basroding.director.views.actors.basic;

import com.badlogic.gdx.scenes.scene2d.ui.Label;
import nl.basroding.director.views.TableFactory;

/**
 *
 * @author basroding
 */
public class TitledWindow extends Window
{
    public TitledWindow(String title, int width, int height)
    {
	super(width, height);
	
	String stringTitle = title;
	
	Label titleLabel = new Label(stringTitle, TableFactory.defaultSkin, "window_title");
	titleLabel.setPosition(Window.MARGIN * 2, height - Window.MARGIN - titleLabel.getHeight() - Window.MARGIN / 2);
	addActor(titleLabel);
	
    }
}

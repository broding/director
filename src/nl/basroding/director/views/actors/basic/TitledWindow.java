package nl.basroding.director.views.actors.basic;

import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import java.util.ArrayList;
import nl.basroding.director.views.TableFactory;

/**
 *
 * @author basroding
 */
public class TitledWindow extends Window
{
    private ArrayList<TextButton> buttons;
    
    public TitledWindow(String title, int width, int height)
    {
	super(width, height);
	
	this.buttons = new ArrayList<TextButton>(4);
	Label titleLabel = new Label(title, TableFactory.defaultSkin, "window_title");
	titleLabel.setPosition(Window.MARGIN * 2, height - Window.MARGIN - titleLabel.getHeight() - Window.MARGIN / 2);
	addActor(titleLabel);
    }
    
    public TextButton addButton(String string)
    {
	TextButton button = new TextButton(string, TableFactory.defaultSkin, "titled_window");
	button.setPosition(getWidth() - button.getWidth() - Window.MARGIN * 2, this.getHeight() - Window.MARGIN * 2 - button.getHeight() - Window.MARGIN / 2);
	buttons.add(button);
	this.addActor(button);
	
	return button;
    }
}

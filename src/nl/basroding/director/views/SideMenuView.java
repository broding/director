package nl.basroding.director.views;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.SelectBox;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import nl.basroding.director.views.actors.basic.FilledRectangle;
import nl.basroding.director.views.actors.components.buttons.SidebarButton;

/**
 *
 * @author basroding
 */
public class SideMenuView extends View
{
    SidebarButton specialButton;
    SidebarButton button1;
    SidebarButton button2;
    SidebarButton button3;
    SidebarButton button4;
    
    @Override
    public void initialize()
    {
	FilledRectangle bg = new FilledRectangle(new Rectangle(0, 0, 133, 800), new Color(0.23f, 0.14f, 0.14f, 1f));
	
	specialButton = new SidebarButton("Go to weekend", "desk", this.getDefaultSkin(), true);
	specialButton.setWidth(133);
	specialButton.setHeight(72);
	specialButton.setY(600);
	
	button1 = new SidebarButton("Desk", "desk", this.getDefaultSkin());
	button1.setWidth(133);
	button1.setHeight(72);
	button1.setY(specialButton.getY() - 72);
	
	button2 = new SidebarButton("Team", "team", this.getDefaultSkin());
	button2.setWidth(133);
	button2.setHeight(72);
	button2.setY(button1.getY() - 72);
	
	button3 = new SidebarButton("Car", "car", this.getDefaultSkin());
	button3.setWidth(133);
	button3.setHeight(72);
	button3.setY(button2.getY() - 72);
	
	button4 = new SidebarButton("Season", "cup", this.getDefaultSkin());
	button4.setWidth(133);
	button4.setHeight(72);
	button4.setY(button3.getY() - 72);
	
	
	addActor(bg);
	addActor(specialButton);
	addActor(button1);
	addActor(button2);
	addActor(button3);
	addActor(button4);
    }

    @Override
    public void dispose(InputMultiplexer multiplexer)
    {
	super.dispose(multiplexer);
    }
    
    
    
    private void addButton(int height)
    {
	FilledRectangle button = new FilledRectangle(new Rectangle(0, 0, 133, 65), new Color(0.40f, 0.14f, 0.14f, 1f));
	button.setY(height);
    }
}

package nl.basroding.director.views;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.Rectangle;
import nl.basroding.director.views.actors.basic.FilledRectangle;
import nl.basroding.director.views.actors.buttons.SidebarButton;

/**
 *
 * @author basroding
 */
public class SideMenuView extends View
{
    public final static int WIDTH = 133;
    
    SidebarButton specialButton;
    SidebarButton button1;
    SidebarButton button2;
    SidebarButton button3;
    SidebarButton button4;
    
    @Override
    public void initialize()
    {
	FilledRectangle bg = new FilledRectangle(new Rectangle(0, 0, WIDTH, 800), new Color(0.23f, 0.14f, 0.14f, 1f));
	
	specialButton = new SidebarButton("Go to weekend", "desk", this.getDefaultSkin(), true);
	specialButton.setWidth(WIDTH);
	specialButton.setHeight(72);
	specialButton.setY(600);
	
	button1 = new SidebarButton("Desk", "desk", this.getDefaultSkin());
	button1.setWidth(WIDTH);
	button1.setHeight(72);
	button1.setY(specialButton.getY() - 72);
	
	button2 = new SidebarButton("Team", "team", this.getDefaultSkin());
	button2.setWidth(WIDTH);
	button2.setHeight(72);
	button2.setY(button1.getY() - 72);
	
	button3 = new SidebarButton("Car", "car", this.getDefaultSkin());
	button3.setWidth(WIDTH);
	button3.setHeight(72);
	button3.setY(button2.getY() - 72);
	
	button4 = new SidebarButton("Season", "cup", this.getDefaultSkin());
	button4.setWidth(WIDTH);
	button4.setHeight(72);
	button4.setY(button3.getY() - 72);
	
	
	addActor(bg);
	addActor(specialButton);
	addActor(button1);
	addActor(button2);
	addActor(button3);
	addActor(button4);
    }
}

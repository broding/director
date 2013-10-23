package nl.basroding.director.views;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import nl.basroding.director.controllers.DeskController;
import nl.basroding.director.controllers.TeamController;
import nl.basroding.director.views.actors.basic.FilledRectangle;
import nl.basroding.director.views.actors.buttons.SidebarButton;

/**
 *
 * @author basroding
 */
public class SideMenuView extends View
{
    public final static int WIDTH = 133;
    
    SidebarButton buttonRace;
    SidebarButton buttonDesk;
    SidebarButton buttonTeam;
    SidebarButton buttonCar;
    SidebarButton buttonSeason;
    
    @Override
    public void initialize()
    {
	FilledRectangle bg = new FilledRectangle(new Rectangle(0, 0, WIDTH, 800), new Color(0.23f, 0.14f, 0.14f, 1f));
	
	buttonRace = new SidebarButton("Go to weekend", "race", this.getDefaultSkin(), true);
	buttonRace.setWidth(WIDTH);
	buttonRace.setHeight(72);
	buttonRace.setY(600);
	
	buttonDesk = new SidebarButton("Desk", "desk", this.getDefaultSkin());
	buttonDesk.setWidth(WIDTH);
	buttonDesk.setHeight(72);
	buttonDesk.setY(buttonRace.getY() - 72);
	buttonDesk.addListener(new ChangeListener() {

	    @Override
	    public void changed(ChangeListener.ChangeEvent event, Actor actor) 
	    {
		SideMenuView.this.switchController(new DeskController());
	    }
	});
	
	buttonTeam = new SidebarButton("Team", "team", this.getDefaultSkin());
	buttonTeam.setWidth(WIDTH);
	buttonTeam.setHeight(72);
	buttonTeam.setY(buttonDesk.getY() - 72);
	buttonTeam.addListener(new ChangeListener() {

	    @Override
	    public void changed(ChangeListener.ChangeEvent event, Actor actor) 
	    {
		SideMenuView.this.switchController(new TeamController());
	    }
	});
	
	buttonCar = new SidebarButton("Car", "car", this.getDefaultSkin());
	buttonCar.setWidth(WIDTH);
	buttonCar.setHeight(72);
	buttonCar.setY(buttonTeam.getY() - 72);
	
	buttonSeason = new SidebarButton("Season", "cup", this.getDefaultSkin());
	buttonSeason.setWidth(WIDTH);
	buttonSeason.setHeight(72);
	buttonSeason.setY(buttonCar.getY() - 72);
	
	addActor(bg);
	addActor(buttonRace);
	addActor(buttonDesk);
	addActor(buttonTeam);
	addActor(buttonCar);
	addActor(buttonSeason);
    }
}

package nl.basroding.director.views;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import nl.basroding.director.models.data.Driver;
import nl.basroding.director.views.actors.basic.TitledWindow;
import nl.basroding.director.views.actors.basic.Window;
import nl.basroding.director.views.actors.team.driver.BigDriverProfile;

/**
 *
 * @author basroding
 */
public class DriversView extends ContentView
{
    // Models
    private Driver driver1;
    private Driver driver2;
    
    // Components
    private Window contract;
    private Window history;
    
    // Buttons
    public Button buttonDriver1More;
    public Button buttonDriver2More;
    
    public DriversView(Driver driver1, Driver driver2)
    {
	super("Drivers", new Texture(Gdx.files.internal("images/backgrounds/ferrari.jpg")));

	this.driver1 = driver1;
	this.driver2 = driver2;
    }
    
    @Override
    public void initialize() 
    {
	Table bigTable = TableFactory.createPageTable();
	
	TitledWindow windowDriver1 = new TitledWindow("1st Driver - " + driver1.getForName() + " " + driver1.getSurName(), 536, 300);
	TitledWindow windowDriver2 = new TitledWindow("2nd Driver - " + driver2.getForName() + " " + driver2.getSurName(), 536, 300);
	TitledWindow windowDriverStats1 = new TitledWindow("Reserve driver - ", 536, 190);
	TitledWindow windowDriverStats2 = new TitledWindow("Reserve driver - ", 536, 190);
	
	windowDriver1.addActor(new BigDriverProfile(driver1));
	windowDriver2.addActor(new BigDriverProfile(driver2));
	
	buttonDriver1More = windowDriver1.addButton("Full profile");
	buttonDriver2More = windowDriver2.addButton("Full profile");
	
	bigTable.add(windowDriver1).pad(Window.MARGIN);
	bigTable.add(windowDriver2).pad(Window.MARGIN);
	bigTable.row();
	bigTable.add(windowDriverStats1).pad(Window.MARGIN);
	bigTable.add(windowDriverStats2).pad(Window.MARGIN);
	
	addActor(bigTable);
    }
}

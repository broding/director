package nl.basroding.director.views;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import nl.basroding.director.models.data.Driver;
import nl.basroding.director.views.actors.basic.Window;
import nl.basroding.director.views.actors.team.driver.BigDriverProfile;
import nl.basroding.director.views.actors.team.driver.DriverAttributes;

/**
 *
 * @author basroding
 */
public class DriverView extends ContentView
{
    // Models
    private Driver driver;
    
    // Components
    private BigDriverProfile profile;
    private DriverAttributes attributes;
    private Window contract;
    private Window history;
    private Window something;
    
    public DriverView(Driver driver)
    {
	super(driver.getForName() + " " + driver.getSurName(), new Texture(Gdx.files.internal("images/backgrounds/ferrari.jpg")));
	
	this.driver = driver;
    }
    
    @Override
    public void initialize() 
    {
	Table bigTable = TableFactory.createPageTable();
	Table leftTable = new Table();
	Table rightTable = new Table();
	Table rightBottomTable = new Table();
	
	Window windowProfile = new Window(536, 270);
	
	windowProfile.addActor(profile = new BigDriverProfile(driver));
	attributes = new DriverAttributes(driver);
	contract = new Window(536, 400);
	history = new Window(260, 200);
	something = new Window(260, 200);
	
	leftTable.add(windowProfile).pad(Window.MARGIN);
	leftTable.row();    
	leftTable.add(attributes).pad(Window.MARGIN);
	
	rightTable.add(contract).pad(Window.MARGIN);
	rightTable.row();
	rightTable.add(rightBottomTable);
	rightBottomTable.add(history).pad(Window.MARGIN);
	rightBottomTable.add(something).pad(Window.MARGIN);
	
	bigTable.add(leftTable).top();
	bigTable.add(rightTable).top();
	addActor(bigTable);
    }
}

package nl.basroding.director.views.actors.team.driver;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.List;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import nl.basroding.director.models.data.Driver;
import nl.basroding.director.views.TableFactory;
import nl.basroding.director.views.actors.basic.TabbedList;
import nl.basroding.director.views.actors.basic.Window;

/**
 *
 * @author basroding
 */
public class BigDriverProfile extends Window
{
    private Driver driver;
    
    public BigDriverProfile(Driver driver)
    {
	super(536, 270);
	
	this.driver = driver;
	
	Table table = new Table();
	table.size(536, 270);
	table.top();
	table.left();
	table.pad(Window.MARGIN * 2);
	
	String[] items = {"Name\t" + driver.getForName() + " " + driver.getSurName()};
	TabbedList list = new TabbedList(items, TableFactory.defaultSkin);
	list.setColumnGap(20f);
	list.setHeader("Time\tName");
	
	Texture texture = new Texture("images/tests/grosjean.jpg");
	
	Label nameLabel = new Label(driver.getForName() + " " + driver.getSurName(), new Skin(Gdx.files.internal("images/ui_atlas/skin.skin")));
	Image image = new Image(texture);
	image.setX(0);
	image.setY(0);
	
	//table.add(image).pad(Window.MARGIN);
	table.add(list).pad(Window.MARGIN).top();
	
	this.addActor(table);
    }
}

package nl.basroding.director.views.actors.team.driver;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.List;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import nl.basroding.director.models.data.Driver;
import nl.basroding.director.views.TableFactory;
import nl.basroding.director.views.actors.basic.TableList;
import nl.basroding.director.views.actors.basic.Window;

/**
 *
 * @author basroding
 */
public class BigDriverProfile extends Group
{
    private Driver driver;
    
    public BigDriverProfile(Driver driver)
    {
	this.driver = driver;
	
	Table table = new Table();
	table.top();
	table.left();
	table.setFillParent(true);
	table.pad(Window.MARGIN * 2);
	
	TableList list = new TableList(2, TableFactory.defaultSkin);
	list.addItem("Name", driver.getForName() + " " + driver.getSurName());
	list.addItem("Nationality", driver.getCountry().getName());
	list.addItem("Age", "28");
	list.addItem("Personality", "Professional");
	list.addItem("Races driven", 131);
	list.addItem("Races won", 37);
	list.addItem("Championships won", 2);
	list.addItem("Team", driver.getTeam().getName());
	list.setColumnStyle(0, TableFactory.defaultSkin, "bold");
	
	Texture texture = new Texture("images/season/drivers/profile/" + driver.getId() + ".png");
	
	Image image = new Image(texture);
	image.setX(0);
	image.setY(0);
	image.setWidth(20);
	
	table.add(image).pad(Window.MARGIN);
	table.add(list).top().pad(Window.MARGIN);
	
	this.setSize(536, 270);
	this.addActor(table);
    }
}

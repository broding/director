package nl.basroding.director.controllers;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import nl.basroding.director.views.DriverView;
import nl.basroding.director.views.DriversView;
import nl.basroding.director.views.SideMenuView;

/**
 *
 * @author basroding
 */
public class TeamController extends Controller
{   
    @Override
    public void index()
    {
	DriversView view = new DriversView(this.getModelCollection().getDriversModel().getWithId(1), this.getModelCollection().getDriversModel().getWithId(2));
	this.setView(view);
	
	view.buttonDriver1More.addListener(new ChangeListener() {

	    @Override
	    public void changed(ChangeListener.ChangeEvent event, Actor actor)
	    {
		showDriverWithId(1);
	    }
	});
	
	view.buttonDriver2More.addListener(new ChangeListener() {

	    @Override
	    public void changed(ChangeListener.ChangeEvent event, Actor actor)
	    {
		showDriverWithId(2);
	    }
	});
    }
    
    private void showDriverWithId(int id)
    {
	DriverView view = new DriverView(this.getModelCollection().getDriversModel().getWithId(id));
	this.setView(view);
    }
}

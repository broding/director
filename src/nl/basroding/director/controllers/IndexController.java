package nl.basroding.director.controllers;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import nl.basroding.director.Director;
import nl.basroding.director.models.data.Driver;
import nl.basroding.director.views.DriverView;
import nl.basroding.director.views.MenuView;

/**
 *
 * @author basroding
 */
public class IndexController extends Controller
{   
    @Override
    public void index()
    {
	MenuView view = new MenuView();
	this.setView(view);
	
	view.buttonNextDriver.addListener(new ChangeListener() {

	    @Override
	    public void changed(ChangeListener.ChangeEvent event, Actor actor) 
	    {
		changeToDriverView();
	    }
	});
    }
    
    private void changeToDriverView()
    {
	setView(new DriverView(getModelCollection().getDriversModel().getWithId(1)));
    }
}

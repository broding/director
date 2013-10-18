package nl.basroding.director.controllers;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import nl.basroding.director.Director;
import nl.basroding.director.models.data.Driver;
import nl.basroding.director.views.DriverView;
import nl.basroding.director.views.MenuView;
import nl.basroding.director.views.TopMenuView;

/**
 *
 * @author basroding
 */
public class IndexController extends Controller
{   
    TopMenuView topMenuView;
    MenuView menuView;
    
    @Override
    public void index()
    {
	topMenuView = new TopMenuView();
	
	menuView = new MenuView();
	
	this.addView(menuView);
	this.addView(topMenuView);
	
	menuView.buttonNextDriver.addListener(new ChangeListener() {

	    @Override
	    public void changed(ChangeListener.ChangeEvent event, Actor actor) 
	    {
		DriverController newController = new DriverController();
		setController(newController);
		newController.showId(1);
	    }
	    
	});
    }
}

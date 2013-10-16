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
public class DriverController extends Controller
{   
    public void showId(int id)
    {
	DriverView view = new DriverView(getModelCollection().getDriversModel().getWithId(id));
	this.addView(view);
    }
}

package nl.basroding.director.controllers;

import nl.basroding.director.views.DriverView;
import nl.basroding.director.views.SideMenuView;

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
	
	SideMenuView sideMenu = new SideMenuView();
	this.addView(sideMenu);
    }
}

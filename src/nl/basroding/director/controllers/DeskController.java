package nl.basroding.director.controllers;

import nl.basroding.director.views.DriverView;

/**
 *
 * @author basroding
 */
public class DeskController extends Controller
{   
    public void index()
    {
	DriverView view = new DriverView(getModelCollection().getDriversModel().getWithId(1));
	this.setView(view);
    }
    
    public void showId(int id)
    {
	DriverView view = new DriverView(getModelCollection().getDriversModel().getWithId(id));
	this.setView(view);
    }
}

package nl.basroding.director.controllers;

import nl.basroding.director.views.DeskView;

/**
 *
 * @author basroding
 */
public class DeskController extends Controller
{   
    @Override
    public void index()
    {
	DeskView view = new DeskView();
	this.setView(view);
    }
}

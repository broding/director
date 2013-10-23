package nl.basroding.director.controllers;

import nl.basroding.director.Director;
import nl.basroding.director.models.ModelCollection;
import nl.basroding.director.views.ContentView;
import nl.basroding.director.views.SideMenuView;
import nl.basroding.director.views.TopbarView;
import nl.basroding.director.views.View;

/**
 *
 * @author basroding
 */
public class Controller 
{
    private Director director;
    private ModelCollection modelCollection;
    private View view;
    
    public Controller()
    {
    }
    
    final public void setup(Director director, ModelCollection modelCollection)
    {
	this.director = director;
	this.modelCollection = modelCollection;
    }
    
    public void index()
    {
	
    }
    
    final protected void setController(Controller controller)
    {
	director.setController(controller);
    }
    
    final protected void setView(ContentView newView)
    {
	if(this.view != null)
	    this.view.clear();
	
	this.view = newView;
	this.view.setX(SideMenuView.WIDTH);
	this.director.setupView(newView);
    }
    
    final protected ModelCollection getModelCollection()
    {
	return this.modelCollection;
    }

    final public View getView()
    {
	return view;
    }
    
    
}

package nl.basroding.director.controllers;

import nl.basroding.director.Director;
import nl.basroding.director.ModelCollection;
import nl.basroding.director.views.View;

/**
 *
 * @author basroding
 */
public class Controller 
{
    private Director director;
    private ModelCollection modelCollection;
    
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
    
    final protected void addView(View view)
    {
	director.addView(view);
    }
    
    final protected void removeView(View view)
    {
	director.removeView(view);
    }
    
    final protected void removeAllViews()
    {
	director.removeAllView();
    }
    
     public void replaceView(View oldView, View newView)
     {
	 director.replaceView(oldView, newView);
     }
    
    final protected ModelCollection getModelCollection()
    {
	return this.modelCollection;
    }
}

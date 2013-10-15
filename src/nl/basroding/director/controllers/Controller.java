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
    
    final protected void setView(View view)
    {
	director.setView(view);
    }
    
    final protected ModelCollection getModelCollection()
    {
	return this.modelCollection;
    }
}

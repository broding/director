package nl.basroding.director;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import nl.basroding.director.controllers.Controller;
import nl.basroding.director.controllers.IndexController;
import nl.basroding.director.views.View;

/**
 *
 * @author basroding
 */
public final class Director 
{
    private Skin defaultSkin;
    private Controller controller;
    private ArrayList<View> views;
    private ModelCollection modelCollection;
    private InputMultiplexer inputProcessor;
    
    public Director()
    {
	inputProcessor = new InputMultiplexer();
	Gdx.input.setInputProcessor(inputProcessor);
	
	defaultSkin = new Skin(Gdx.files.internal("default/uiskin.skin"));
	views = new ArrayList<View>(20);
	modelCollection = new ModelCollection();
	setController(new IndexController());
    }
    
    public void update()
    {
	for(View view : views)
	    view.update();
    }
    
    public void draw()
    {
	Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
	
	for(View view : views)
	    view.draw();
    }
    
    public void setController(Controller controller)
    {
	this.controller = controller;
	this.controller.setup(this, modelCollection);
	this.controller.index();
    }
    
    public void addView(View view)
    {
	this.views.add(view);
	
	Stage stage = new Stage();
	this.inputProcessor.addProcessor(stage);
	view.setup(stage, this, defaultSkin);
	view.initialize();
    }
    
    public void replaceView(View oldView, View newView)
    {
	oldView.dispose(inputProcessor);
	
	this.views.set(this.views.indexOf(oldView), newView);
	
	Stage stage = new Stage();
	this.inputProcessor.addProcessor(stage);
	newView.setup(stage, this, defaultSkin);
	newView.initialize();
    }
    
    public void removeView(View view)
    {
	this.views.remove(view);
	view.dispose(inputProcessor);
    }
    
    public void removeAllView()
    {
	this.views.clear();
    }
}

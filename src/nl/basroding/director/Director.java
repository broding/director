package nl.basroding.director;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.scenes.scene2d.Stage;
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
    private Controller controller;
    private View view;
    private ModelCollection modelCollection;
    private Stage stage;
    
    public Director()
    {
	stage = new Stage();
	modelCollection = new ModelCollection();
	setController(new IndexController());
    }
    
    public void update()
    {
	view.update();
    }
    
    public void draw()
    {
	Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
        stage.act(Gdx.graphics.getDeltaTime());
        stage.draw();
    }
    
    public void setController(Controller controller)
    {
	this.controller = controller;
	this.controller.setup(this, modelCollection);
	this.controller.index();
    }
    
    public void setView(View view)
    {
	stage.clear();
	this.view = view;
	this.view.setup(stage);
	this.view.initialize();
    }

    public Stage getStage() 
    {
	return stage;
    }
}

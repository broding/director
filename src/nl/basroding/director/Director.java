package nl.basroding.director;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import nl.basroding.director.controllers.Controller;
import nl.basroding.director.controllers.DeskController;
import nl.basroding.director.views.SideMenuView;
import nl.basroding.director.views.TableFactory;
import nl.basroding.director.views.TopbarView;
import nl.basroding.director.views.View;

/**
 *
 * @author basroding
 */
public final class Director 
{
    private Stage stage;
    private Skin defaultSkin;
    private Controller controller;
    private ModelCollection modelCollection;
    private InputMultiplexer inputProcessor;
    
    private TopbarView topbarView;
    private SideMenuView sideMenuView;
    
    public Director()
    {
	stage = new Stage();
	Gdx.input.setInputProcessor(stage);
	
	defaultSkin = new Skin(Gdx.files.internal("images/ui_atlas/skin.skin"));
	TableFactory.defaultSkin = defaultSkin;
	
	modelCollection = new ModelCollection();
	setController(new DeskController());
	
	topbarView = new TopbarView();
	sideMenuView = new SideMenuView();
	setupView(topbarView);
	setupView(sideMenuView);
    }
    
    public void update()
    {
	if(controller.getView() != null) controller.getView().update();
	sideMenuView.update();
	stage.act();
    }
    
    public void draw()
    {
	Gdx.gl.glClearColor(0.89f, 0.89f, 0.89f, 1);
	Gdx.graphics.getGL20().glClear( GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT );
	
	stage.draw();
	Table.drawDebug(stage);
    }
    
    public void setController(Controller controller)
    {
	this.controller = controller;
	this.controller.setup(this, modelCollection);
	this.controller.index();
    }
    
    public void setupView(View view)
    {
	view.setup(this, defaultSkin);
	view.initialize();
	stage.addActor(view);
    }

    public InputMultiplexer getInputProcessor() 
    {
	return inputProcessor;
    }
}

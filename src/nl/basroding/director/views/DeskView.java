package nl.basroding.director.views;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Table;

/**
 *
 * @author basroding
 */
public class DeskView extends ContentView
{
    public DeskView()
    {
	super("Desk", new Texture(Gdx.files.internal("images/backgrounds/ferrari.jpg")));
	
    }
    
    @Override
    public void initialize() 
    {
	Table bigTable = TableFactory.createPageTable();
	Table leftTable = new Table();
	
	bigTable.add(leftTable).top();
	addActor(bigTable);
    }
}

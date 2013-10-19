package nl.basroding.director.views;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import nl.basroding.director.views.actors.basic.Window;

/**
 *
 * @author basroding
 */
public class TableFactory
{
    public static Skin defaultSkin;
    
    public static Table createPageTable()
    {
	Table table = new Table(defaultSkin);
	
	table.setX(Window.MARGIN);
	table.setY(0);
	table.setWidth(Gdx.graphics.getWidth() - SideMenuView.WIDTH - Window.MARGIN * 2);
	table.setHeight(Gdx.graphics.getHeight() - TopbarView.HEIGHT - 60);
	table.left();
	table.top();
	
	return table;
    }
}

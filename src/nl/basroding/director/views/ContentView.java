package nl.basroding.director.views;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import nl.basroding.director.views.actors.basic.Window;

/**
 *
 * @author basroding
 */
public class ContentView extends View
{
    protected Image bgSprite;
    protected Label labelTitle;
    
    public ContentView(String title, Texture bgTexture)
    {
	this.bgSprite = new Image(bgTexture);
	this.bgSprite.setColor(1, 1, 1, 0.02f);
	//this.addActor(bgSprite);
	this.labelTitle = new Label(title, TableFactory.defaultSkin, "page_title");
	this.labelTitle.setPosition(Window.MARGIN * 2 + 9, Gdx.graphics.getHeight() - TopbarView.HEIGHT - 57);
	this.addActor(labelTitle);
    }
}

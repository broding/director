package nl.basroding.director.views;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

/**
 *
 * @author basroding
 */
public class ContentView extends View
{
    protected Image bgSprite;
    
    public ContentView(Texture bgTexture)
    {
	this.bgSprite = new Image(bgTexture);
	this.bgSprite.setColor(1, 1, 1, 0.1f);
	//this.addActor(bgSprite);
    }
}

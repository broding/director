package nl.basroding.director.views.actors.basic;

import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 *
 * @author basroding
 */
public class FilledRectangle extends Actor
{
    public Rectangle rectangle;
    
    private Texture pixmapTexture;
    
    public FilledRectangle(Rectangle rectangle)
    {
	this.rectangle = rectangle;
	
	Pixmap pixmap = new Pixmap( 1, 1, Format.RGBA8888 );
	pixmap.setColor( 1, 1, 1, 1f );
	pixmapTexture = new Texture( pixmap );
	pixmap.dispose();
    }
    
    public FilledRectangle(int x, int y, int width, int height)
    {
	
    }
    
    @Override
    public void draw(SpriteBatch batch, float parentAlpha)
    {
	super.draw(batch, parentAlpha);
	
	batch.draw(pixmapTexture, rectangle.x, rectangle.y, rectangle.width, rectangle.height);
    }
}

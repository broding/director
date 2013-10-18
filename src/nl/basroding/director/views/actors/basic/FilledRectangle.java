package nl.basroding.director.views.actors.basic;

import com.badlogic.gdx.graphics.Color;
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
    private Color color;    
    private Texture pixmapTexture;
    
    public FilledRectangle(Rectangle rectangle, Color color)
    {
	this.rectangle = rectangle;
	this.color = color;
	
	Pixmap pixmap = new Pixmap( 1, 1, Format.RGBA8888 );
	pixmap.setColor( color.r, color.g, color.b, color.a );
	pixmap.drawPixel(0, 0);
	pixmapTexture = new Texture( pixmap );
	pixmap.dispose();
    }
    
    public FilledRectangle(int x, int y, int width, int height, Color color)
    {
	
    }
    
    @Override
    public void draw(SpriteBatch batch, float parentAlpha)
    {
	super.draw(batch, parentAlpha);
	
	batch.draw(pixmapTexture, rectangle.x + this.getX(), rectangle.y + this.getY(), rectangle.width, rectangle.height);
    }
}

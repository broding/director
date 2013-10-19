package nl.basroding.director.views.actors.buttons;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;

/**
 *
 * @author basroding
 */
public class SidebarButton extends TextButton
{
    private TextureRegion texture;
    
    public SidebarButton(String text, String icon, Skin skin)
    {
	this(text, icon, skin, false);
    }
    
    public SidebarButton(String text, String icon, Skin skin, boolean special)
    {
	super(text, skin, special ? "sidebar_special" : "sidebar");
	
	TextureAtlas atlas = new TextureAtlas(Gdx.files.internal("images/ui_atlas/skin.atlas"));
	
	texture = atlas.findRegion("icons/" + icon);
    }

    @Override
    public void draw(SpriteBatch batch, float parentAlpha) {
	super.draw(batch, parentAlpha);
	
	batch.draw(texture, this.getX() - (texture.getRegionWidth() / 2) + 133/2, this.getY() + 44 - (texture.getRegionHeight() / 2));
    }
    
    
}

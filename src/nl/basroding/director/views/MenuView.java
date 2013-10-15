package nl.basroding.director.views;

import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle;

/**
 *
 * @author basroding
 */
public class MenuView extends View
{
    public TextButton buttonNextDriver;
    
    @Override
    public void initialize()
    {
	Skin skin = new Skin();
	
	Pixmap pixmap = new Pixmap(1, 1, Format.RGBA8888);
	pixmap.setColor(Color.WHITE);
	pixmap.fill();
	skin.add("white", new Texture(pixmap));

	// Store the default libgdx font under the name "default".
	skin.add("default", new BitmapFont());

	// Configure a TextButtonStyle and name it "default". Skin resources are stored by type, so this doesn't overwrite the font.
	TextButtonStyle textButtonStyle = new TextButtonStyle();
	textButtonStyle.up = skin.newDrawable("white", Color.DARK_GRAY);
	textButtonStyle.down = skin.newDrawable("white", Color.DARK_GRAY);
	textButtonStyle.checked = skin.newDrawable("white", Color.BLUE);
	textButtonStyle.over = skin.newDrawable("white", Color.LIGHT_GRAY);
	textButtonStyle.font = skin.getFont("default");
	skin.add("default", textButtonStyle);

	buttonNextDriver = new TextButton("Next", skin);
	Texture texture = new Texture("images/backgrounds/grojean.jpg");
	Image image = new Image(texture);
	
	addActor(image);
	addActor(buttonNextDriver);
    }
}

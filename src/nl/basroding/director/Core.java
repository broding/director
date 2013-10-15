package nl.basroding.director;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Files.FileType;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle;

public class Core implements ApplicationListener
{	
    private SpriteBatch spriteBatch;
    private int clicks;
    private Stage stage;
    private Skin skin;
    
    public Core()
    {
	
    }

    @Override
    public void create()
    {
	stage = new Stage();
        Gdx.input.setInputProcessor(stage);
	
	Texture texture = new Texture("images/backgrounds/grojean.jpg");
	Image image = new Image(texture);

        Table table = new Table();
        table.setFillParent(true);
	stage.addActor(image);
	skin = new Skin();
	
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

	// Create a table that fills the screen. Everything else will go inside this table.
	table.setFillParent(true);
	stage.addActor(table);

	// Create a button with the "default" TextButtonStyle. A 3rd parameter can be used to specify a name other than "default".
	final TextButton button = new TextButton("Click me!", skin);
	table.add(button);
	final TextButton button2 = new TextButton("Click me!", skin);
	table.add(button2);

	
    }

    @Override
    public void resize(int width, int height)
    {
	stage.setViewport(width, height, true);
    }

    @Override
    public void render()
    {
	Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
        stage.act(Gdx.graphics.getDeltaTime());
        stage.draw();
    }

    @Override
    public void pause()
    {
    }

    @Override
    public void resume()
    {
    }

    @Override
    public void dispose()
    {
	spriteBatch.dispose();
    }
}

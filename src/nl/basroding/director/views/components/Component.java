package nl.basroding.director.views.components;

import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

/**
 *
 * @author basroding
 */
public class Component extends Group
{
    private Skin defaultSkin;
    
    public void setup(Skin defaultSkin)
    {
	this.defaultSkin = defaultSkin;
    }
    
    public void initialize()
    {
    }

    public Skin getDefaultSkin() 
    {
	return defaultSkin;
    }
    
}

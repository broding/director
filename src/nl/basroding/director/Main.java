/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.basroding.director;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        
        config.title = "De Verhalen Machine";
        config.resizable = false;
	config.fullscreen = true;
        config.width = 1680;
        config.height = 1050;
        config.useGL20 = true;
	config.samples = 2;
		
        LwjglApplication app = new LwjglApplication(new Core(), config);
    }
}

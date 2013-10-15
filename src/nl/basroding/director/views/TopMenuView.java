package nl.basroding.director.views;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.ui.SelectBox;

/**
 *
 * @author basroding
 */
public class TopMenuView extends View
{
    public SelectBox selectBoxTeam;
    public SelectBox selectBoxCar;
    public SelectBox selectBoxSeason;
    public SelectBox selectBoxOptions;
    
    @Override
    public void initialize()
    {
	String hello[] = new String[3];
	hello[0] = "Team";
	hello[1] = "iets";
	hello[2] = "dsfsd";
	
	selectBoxTeam = new SelectBox(hello, this.getDefaultSkin());
	selectBoxCar = new SelectBox(hello, this.getDefaultSkin());
	selectBoxSeason = new SelectBox(hello, this.getDefaultSkin());
	selectBoxOptions = new SelectBox(hello, this.getDefaultSkin());
	
	selectBoxTeam.setX(Gdx.graphics.getWidth() / 4);
	selectBoxTeam.setY(400);
	selectBoxCar.setX(Gdx.graphics.getWidth() / 4 * 2);
	selectBoxCar.setY(400);
	selectBoxSeason.setX(Gdx.graphics.getWidth() / 4 * 3);
	selectBoxSeason.setY(400);
	selectBoxOptions.setX(Gdx.graphics.getWidth() / 4 * 4);
	selectBoxOptions.setY(400);
	
	addActor(selectBoxTeam);
	addActor(selectBoxCar);
	addActor(selectBoxSeason);
	addActor(selectBoxOptions);
    }
}

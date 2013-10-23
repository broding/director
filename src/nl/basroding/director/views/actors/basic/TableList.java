package nl.basroding.director.views.actors.basic;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.ui.List;
import com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Widget;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.scenes.scene2d.utils.Cullable;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.Pools;
import java.util.ArrayList;

/**
 *
 * @author basroding
 */
public class TableList extends Widget implements Cullable {

    private String[] items;
    private int lineCut;
    private Rectangle cullingArea;
    private float prefWidth, prefHeight;
    private float itemHeight;
    private float textOffsetX, textOffsetY;
    private String tabDelimiter;
    private String header;
    private float columnGap;
    
    private TableList.TableListStyle style;
    private int selectedIndex;
    private boolean selectable;
    private int columnCount;
    private ColumnStyle[] columnStyles;
    private ListDeluxe[] lists;

    public TableList(int columnCount, Skin skin)
    {
	this.setLayoutEnabled(false);
	this.columnCount = columnCount;
	columnStyles = new ColumnStyle[columnCount];
	lists = new ListDeluxe[columnCount];
	
	Object[] objects = {};
	
	for(int i = 0; i < columnCount; i++)
	{
	    lists[i] = new ListDeluxe(objects, skin.get(TableList.ColumnStyle.class), skin.get(TableList.TableListStyle.class));
	    columnStyles[i] = skin.get(TableList.ColumnStyle.class);
	}
	
	this.setStyle(skin.get(TableList.TableListStyle.class));
    }
    
    public void setColumnStyle(int column, Skin skin, String styleName)
    {
	columnStyles[column] = skin.get(styleName, TableList.ColumnStyle.class);
	ColumnStyle newStyle = columnStyles[column];
	
	lists[column].setStyle(new ColumnStyle(newStyle.font, 150, newStyle.fontColorSelected, newStyle.fontColorUnselected, newStyle.selection));
	
	this.resetSize();
    }
    
    public void addItem(Object ... objects)
    {
	for (int i = 0; i < this.columnCount; i++)
	{
	    Object[] listObjects = new Object[lists[i].getItems().length + 1];
	    System.arraycopy(lists[i].getItems(), 0, listObjects, 0, lists[i].getItems().length);
	    listObjects[listObjects.length-1] = objects[i];
	    
	    lists[i].clear();
	    lists[i].setItems(listObjects);
	}
	
	this.resetSize();
    }

    @Override
    public synchronized void draw(SpriteBatch batch, float parentAlpha)
    {
	this.resetListPosition();
	
	for(ListDeluxe list : lists)
	    list.draw(batch, parentAlpha);
    }
    
    private float getBiggestItemHeight()
    {
	float biggestItemHeight = -1;
	
	for(int i = 0; i < lists.length; i++)
	    biggestItemHeight = Math.max(biggestItemHeight, lists[i].getItemHeight());
	
	return biggestItemHeight;
    }
    
    private float getFullWidth()
    {
	float width = 0;
	
	for(int i = 0; i < lists.length; i++)
	    width += lists[i].getStyle().width;
	
	return width;
    }
    
    private void resetListPosition()
    {
	for(int i = 0; i < lists.length; i++)
	{
	    if(i >= 1)
		lists[i].setPosition(this.getX() + columnStyles[i-1].width, this.getY());
	    else
		lists[i].setPosition(this.getX(), this.getY());
	}
    }
    
    private void resetSize()
    {
	float biggestItemHeight = Math.max(this.getBiggestItemHeight(), style.rowHeight);
	
	for(int i = 0; i < lists.length; i++)
	{
	    if(i >= 1)
		lists[i].setPosition(this.getX() + columnStyles[i-1].width, this.getY());
	    else
		lists[i].setPosition(this.getX(), this.getY());
	    
	    lists[i].setItemHeight(biggestItemHeight);
	    lists[i].setSize(lists[i].getStyle().width, biggestItemHeight * lists[i].getItems().length);
	}
	
	this.setSize(getFullWidth(), this.getBiggestItemHeight() * lists[0].getItems().length);
	
	this.prefWidth = this.getWidth();
	this.prefHeight = this.getHeight();
    }
    
    @Override
    public float getPrefWidth () 
    {
	return this.prefWidth;
    }

    @Override
    public float getPrefHeight () 
    {
	return this.prefHeight;
    }
    
    
    synchronized void touchDown(float y) 
    {
	int oldIndex = selectedIndex;

	int newIndex = (int) ((getHeight() - y) / itemHeight);
	newIndex = Math.max(0, newIndex);
	newIndex = Math.min(items.length - 1, newIndex);

	if (header == null || newIndex > 0) {
	    selectedIndex = newIndex;
	    ChangeListener.ChangeEvent changeEvent = Pools.obtain(ChangeListener.ChangeEvent.class);
	    if (fire(changeEvent)) {
		selectedIndex = oldIndex;
	    }
	    Pools.free(changeEvent);
	}
    }

    public final synchronized void setStyle(TableList.TableListStyle style)
    {
	if (style == null) {
	    throw new IllegalArgumentException("style cannot be null.");
	}
	this.style = style;
    }

    @Override
    public void setCullingArea(Rectangle cullingArea)
    {
	throw new UnsupportedOperationException("Not supported yet.");
    }
    
    /** The style for a list, see {@link TabbedList}.
	 */
    static public class TableListStyle {

	public BitmapFont font;
	public Color fontColorSelected = new Color(1, 1, 1, 1);
	public Color fontColorUnselected = new Color(1, 1, 1, 1);
	public Color alternatingColor = new Color(0, 0, 0, 0.08f);
	public float rowHeight = 20;

	public TableListStyle() 
	{
	}

	public TableListStyle(BitmapFont font, Color fontColorSelected, Color fontColorUnselected) 
	{
	    this.font = font;
	    this.fontColorSelected.set(fontColorSelected);
	    this.fontColorUnselected.set(fontColorUnselected);
	}

	public TableListStyle(com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle style) 
	{
	    this.font = style.font;
	    this.fontColorSelected.set(style.fontColorSelected);
	    this.fontColorUnselected.set(style.fontColorUnselected);
	}
    }
    
    static public class ColumnStyle extends ListStyle
    {
	public float width = 150;
	public float leftMargin = 8;

	public ColumnStyle() 
	{
	}

	public ColumnStyle(BitmapFont font, float width, Color fontColorSelected, Color fontColorUnselected, Drawable selection) 
	{
	    this.font = font;
	    this.width = width;
	    this.fontColorSelected.set(fontColorSelected);
	    this.fontColorUnselected.set(fontColorUnselected);
	    this.selection = selection;
	}

	public ColumnStyle(com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle style) 
	{
	    this.font = style.font;
	    this.width = 150;
	    this.fontColorSelected.set(style.fontColorSelected);
	    this.fontColorUnselected.set(style.fontColorUnselected);
	    this.selection = style.selection;
	}
    }
}

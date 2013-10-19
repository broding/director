package nl.basroding.director;

import com.badlogic.gdx.tools.imagepacker.TexturePacker2;

public class TexturePacker
{
	public static void main (String[] args) throws Exception {
		TexturePacker2.process("../data/images/ui", "../data/images/ui_atlas", "skin");
	}
}
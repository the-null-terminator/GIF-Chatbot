package ui;
import meme.Meme;
import processing.core.*;

/**
 * Represents a panel which displays an animated GIF 
 * @author  claire
 *
 */
public class GIFDisplay extends PApplet {

	private Meme fancyMeme = null; 
	public static String memeURL = null;
	
	public GIFDisplay() {
		
	}
	
	public void setup() {
		
	}
	
	public void draw() {
		background(255);
		if (memeURL != null) {
			fancyMeme = new Meme(memeURL, this);
			memeURL = null;
		}
		if (fancyMeme != null) {
			fancyMeme.draw(this);
		}
	}
}

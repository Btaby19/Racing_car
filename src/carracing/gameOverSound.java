package carracing;



import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class gameOverSound{
	public static Clip clip ;
	 public  gameOverSound() {

	         try {
	             AudioInputStream audio = AudioSystem.getAudioInputStream(new File("gameover.wav"));
	             clip = AudioSystem.getClip();
	             clip.open(audio);
	             clip.start();
	         } catch (Exception e) {
	             System.out.println(e);
	         }

	     }
}
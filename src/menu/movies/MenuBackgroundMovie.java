package menu.movies;

import components.Movie;
import javafx.scene.media.MediaPlayer;


public class MenuBackgroundMovie extends Movie {

	public MenuBackgroundMovie(String path, int width, int height, float timerEventCooldown) {
		super(path, width, height, timerEventCooldown,0,0);
		getMediaPlayer().setVolume(0);
		getMediaPlayer().setCycleCount(MediaPlayer.INDEFINITE);
	}
}

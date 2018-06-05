package menu.movies;

import components.Movie;
import engine.Initialize;
import engine.Main;
import engine.Menu;


public class IntroMovie extends Movie {
	public IntroMovie(String path, int width, int height, float timerEventCooldown) {
		super(path, width, height, timerEventCooldown,0,0);
		getMediaPlayer().setVolume(0);
	}

	protected void onEnd() {
		if(Initialize.menuInitialized)
			return;
		Main.clearWindows();
		Initialize.menuStart();
		Menu.buttonsInitialize();
		Initialize.menuInitialized = true;
	}
}

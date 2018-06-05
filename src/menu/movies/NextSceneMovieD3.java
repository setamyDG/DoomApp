package menu.movies;

import components.Movie;
import javafx.scene.media.MediaPlayer;

public class NextSceneMovieD3 extends Movie
{
    public NextSceneMovieD3(String path, int width, int height, float timerEventCooldown) {
        super(path, width, height, timerEventCooldown,0,0);
        getMediaPlayer().setVolume(0);

    }
}

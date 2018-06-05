package components;

import javafx.animation.AnimationTimer;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import library.Timer;

import java.io.File;


public abstract class Movie {
	private MediaPlayer mediaPlayer;
	private MediaView mediaView;
	private Timer timer;


	public Movie(String path, int width, int height, float timerEventCooldown, int x, int y) {
		timer = new Timer((long)(timerEventCooldown * 2000f));
		Media media = new Media(new File(path).toURI().toString());
		mediaPlayer = new MediaPlayer(media);
		mediaView = new MediaView(mediaPlayer);
		setSize(width, height);
		mediaView.setX(x);
		mediaView.setX(y);
		mediaPlayer.setOnEndOfMedia(this::onEnd);
		new AnimationTimer() {
			public void handle(long now) {
				if(timer.checkTickOnce())
					timerEvent();
			}
		}.start();
	}



	protected void onEnd(){}


	protected void timerEvent(){}


	private void setSize(int width, int height) {
		mediaView.setFitWidth(width);
		mediaView.setFitHeight(height);
	}


	public void play() {
		mediaPlayer.play();
	}


	public void stop() {
		mediaPlayer.stop();
	}


	public MediaPlayer getMediaPlayer() {
		return mediaPlayer;
	}


	public MediaView getMediaView() {
		return mediaView;
	}
}

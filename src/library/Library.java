package library;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Screen;

import java.io.File;


public class Library {
	private static double screenHeight, screenWidth;

	private static void updateScreenResolution() {
		screenWidth = Screen.getPrimary().getBounds().getWidth();
		screenHeight = Screen.getPrimary().getBounds().getHeight();
	}

	public static double getScreenWidth(){
		updateScreenResolution();
		return screenWidth;
	}

	public static double getScreenHeight(){
		updateScreenResolution();
		return screenHeight;
	}


	public static MediaPlayer getMediaPlayer(String path) {
		Media media = new Media(new File(path).toURI().toString());
		return new MediaPlayer(media);
	}


	public static ImageView getImageView(String path) {
		File f = new File(path);
		Image img = new Image(f.toURI().toString());
		return new ImageView(img);
	}


	public static Image getImage(String path) {
		File f = new File(path);
		return new Image(f.toURI().toString());
	}


	public static void setVBoxPosition(VBox vBox, int x, int y) {
		vBox.setTranslateX(x);
		vBox.setTranslateY(y);
	}

	public static MediaView getMediaView(String path) {
		Media media = new Media(new File(path).toURI().toString());
		MediaPlayer mp = new MediaPlayer(media);
		return new MediaView(mp);
	}
}

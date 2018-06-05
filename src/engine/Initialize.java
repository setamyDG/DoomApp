package engine;

import components.Movie;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.media.MediaPlayer;
import library.Library;
import menu.movies.IntroMovie;
import menu.movies.MenuBackgroundMovie;
import menu.movies.NextSceneMovieD3;


public class Initialize {
	public static MediaPlayer soundtrack;
	public static MediaPlayer soundtrack2;
	public static boolean menuInitialized = false;


	public static void start() {
		soundtrackStart();
		introAndMenuStart();
	}


	public static void soundtrackStart() {

		soundtrack = Library.getMediaPlayer("src/resources/song.mp3");
		soundtrack.setCycleCount(MediaPlayer.INDEFINITE);
		soundtrack.setVolume(1);
		soundtrack.play();
	}

	public static void soundtrackStart2() {
		soundtrack.stop();
		soundtrack2 = Library.getMediaPlayer("src/resources/doom2016song.mp3");
		soundtrack2.setCycleCount(MediaPlayer.INDEFINITE);
		soundtrack2.setVolume(1);
		soundtrack2.play();
	}


	private static void introAndMenuStart() {
		Movie introMovie = new IntroMovie("src/resources/FINALnoSCENE2.mp4", (int) Library.getScreenWidth(), (int) Library.getScreenHeight(), 2.5f);
		introMovie.play();
		Main.addWindows(introMovie.getMediaView());
		Menu.introButtonInitialize();
	}


	public static void menuStart() {
		Main.clearWindows();
		Movie menuBackgroundMovie = new MenuBackgroundMovie("src/resources/SCENE.mp4", (int) Library.getScreenWidth(), (int) Library.getScreenHeight(), 0);
		menuBackgroundMovie.play();
		Main.addWindows(menuBackgroundMovie.getMediaView());
	}

	public static void nextSceneD3() //Ten film znajduje się gdy klikamy w przycisk "MenuD3Button, MenuD1Button, MenuD2016Button, BackDoom1Button, BackDoom3Button"
	{
		Movie nextSceneMovie = new NextSceneMovieD3("src/resources/nextScene.mp4", (int) Library.getScreenWidth(), (int) Library.getScreenHeight(),0);
		nextSceneMovie.play();
		Main.addWindows(nextSceneMovie.getMediaView());
	}

	public static void menuDoom2016Scene() {
		Main.clearWindows();
		Movie menuBackgroundMovie = new MenuBackgroundMovie("src/resources/doom2016scene2.mp4", (int) Library.getScreenWidth(), (int) Library.getScreenHeight(), 0);
		menuBackgroundMovie.play();
		Main.addWindows(menuBackgroundMovie.getMediaView());
	}

	public static void imagesInLabelDoom2016()
	{
		ImageView imgView = Library.getImageView("src/resources/helmet.png");
		ImageView imgView2 = Library.getImageView("src/resources/skull.png");
		ImageView imgView3 = Library.getImageView("src/resources/UAC.png");
		imgView.setFitWidth(40);
		imgView.setFitHeight(45);
		imgView.setY(690);
		imgView.setX(950);

		imgView2.setFitWidth(40);
		imgView2.setFitHeight(45);
		imgView2.setY(690);
		imgView2.setX(350);


		imgView3.setFitWidth(40);
		imgView3.setFitHeight(45);
		imgView3.setY(690);
		imgView3.setX(1150);

		Main.addWindows(imgView, imgView2, imgView3);


	}


}

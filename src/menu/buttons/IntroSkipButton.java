package menu.buttons;

import components.Button;
import engine.Initialize;
import engine.Main;
import engine.Menu;
import javafx.geometry.Pos;
import javafx.scene.paint.Color;


public class IntroSkipButton extends Button {

	public IntroSkipButton(int x, int y, String text, int width, int height, String imagePath, String imagePath2, String moviePath, String fontPath, double fontSize, Color textColor, Color textColor2, Pos alignment) {
		super(x, y, text, width, height,  imagePath, imagePath2, moviePath, fontPath, fontSize, textColor, textColor2, alignment);
	}

	public void onClicked() {
		Main.clearWindows();
		Initialize.menuStart();
		Menu.buttonsInitialize();
		Initialize.menuInitialized = true;
	}

}

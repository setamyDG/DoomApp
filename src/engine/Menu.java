package engine;

import components.Button;
import javafx.geometry.Pos;
import javafx.scene.paint.Color;
import menu.buttons.*;
import menu.buttons.Doom1Buttons.MenuD1Button;
import menu.buttons.Doom2016Buttons.MenuD2016Button;
import menu.buttons.Doom3Buttons.MenuD3Button;

import java.util.LinkedList;


public class Menu{
	public static LinkedList<Button> buttons = new LinkedList<Button>();
	private static double startTransitionSpeed = -5000d;


	public static void buttonsInitialize(){
		Button menuStartButton = new MenuD2016Button(30, (int) (650 - startTransitionSpeed), "Doom 2016 Game", 600, 351, "src/resources/doom2k16.png","","src/resources/doom2016.mp4", "src/resources/font.ttf",95,Color.DARKRED,null, Pos.BOTTOM_CENTER);
		Button menuStartButtonD3 = new MenuD3Button(660, (int) (645 - startTransitionSpeed), "Doom 3 Game", 600, 351, "src/resources/doom3.png","","src/resources/doom3.mp4", "src/resources/font.ttf",95,Color.DARKRED,null, Pos.BOTTOM_CENTER);
		Button menuStartButtonD1 = new MenuD1Button(1290, (int) (641 - startTransitionSpeed), "Doom  Game", 600, 351, "src/resources/doom1.jpg","","src/resources/doom1.mp4", "src/resources/font.ttf",95,Color.DARKRED,null, Pos.BOTTOM_CENTER);
		Main.addWindows(menuStartButton.stackPane(),menuStartButtonD3.stackPane(), menuStartButtonD1.stackPane());
	}


	public static void introButtonInitialize() {
		Button introSkipButton = new IntroSkipButton(1700, 1000, "SKIP", 0, 0, "", "","","src/resources/font2.ttf",45, Color.DARKRED, Color.RED, Pos.CENTER);
		Main.addWindows(introSkipButton.stackPane());
	}

}


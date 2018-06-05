package menu.buttons.Doom3Buttons;

import components.Button;
import engine.Main;
import javafx.geometry.Pos;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import library.Library;


public class MenuD3Button extends Button {
    private static double startTransitionSpeed = -5000d;
    Button BackDoom3Button = new BackDoom3Button(1600,920,"Back",0,0,"","","", "src/resources/doom1.ttf", 75, Color.DARKRED, Color.RED, Pos.CENTER);
    Button StartDoom3Button = new StartDoom3Button(710,640,"Start Game", 0, 0,"","","", "src/resources/doom1.ttf", 75, Color.DARKRED, Color.RED, Pos.CENTER);
    Button OptionsDoom3Button = new OptionsDoom3Button(735,730,"Options",0,0, "","","", "src/resources/doom1.ttf",75,Color.DARKRED,Color.RED,Pos.CENTER);

    public MenuD3Button(int x, int y, String text, int width, int height, String imagePath, String imagePath2, String moviePath, String fontPath, double fontSize, Color textColor, Color textColor2, Pos alignment) {
        super(x, y, text, width, height, imagePath, imagePath2, moviePath, fontPath, fontSize, textColor, textColor2, alignment);
    }

    public void onClicked() {


        ImageView imgView = Library.getImageView("src/resources/doom3menu.jpg");

        imgView.setFitWidth(1920);
        imgView.setFitHeight(1080);

        Main.addWindows( imgView, BackDoom3Button.stackPane(), StartDoom3Button.stackPane(), OptionsDoom3Button.stackPane());

    }


    public void transitionsOnStart(){ this.transitionY(3.0, startTransitionSpeed);
    }
}


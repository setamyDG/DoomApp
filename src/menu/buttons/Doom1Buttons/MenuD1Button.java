package menu.buttons.Doom1Buttons;

import components.Button;
import engine.Main;
import javafx.geometry.Pos;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import library.Library;


public class MenuD1Button extends Button {
    private static double startTransitionSpeed = -5000d;

    Button SinglePlayerDoom1Button = new SinglePlayerDoom1Button(670, 500, "SINGLE PLAYER", 0,0,"","","","src/resources/doom1.ttf",45,Color.ORANGE, Color.YELLOW, Pos.CENTER);
    Button MultiPlayerDoom1Button = new MultiPlayerDoom1Button(715, 580, "MULTIPLAYER", 0,0,"","","","src/resources/doom1.ttf",45,Color.ORANGE, Color.YELLOW, Pos.CENTER);
    Button LeaderBoardsDoom1Button = new LeaderBoardsDoom1Button(670, 660, "LEADERBOARDS", 0,0,"","","","src/resources/doom1.ttf",45,Color.ORANGE, Color.YELLOW, Pos.CENTER);
    Button AchievmentsDoom1Button = new AchievmentsDoom1Button(685, 740, "ACHIEVEMENTS", 0,0,"","","","src/resources/doom1.ttf",45,Color.ORANGE, Color.YELLOW, Pos.CENTER);
    Button HelpOptionsDoom1Button = new HelpOptionsDoom1Button(665, 820, "HELP & OPTIONS", 0,0,"","","","src/resources/doom1.ttf",45,Color.ORANGE, Color.YELLOW, Pos.CENTER);
    Button BackDoom1Button = new BackDoom1Button(870,900,"BACK",0,0,"","","","src/resources/doom1.ttf",45,Color.ORANGE, Color.YELLOW, Pos.CENTER);

    public MenuD1Button(int x, int y, String text, int width, int height, String imagePath, String imagePath2, String moviePath, String fontPath, double fontSize, Color textColor, Color textColor2, Pos alignment) {
        super(x, y, text, width, height, imagePath, imagePath2, moviePath, fontPath, fontSize, textColor, textColor2, alignment);
    }

    public void onClicked() {
        ImageView imgView = Library.getImageView("src/resources/doom1menu.jpg");
        imgView.setFitWidth(1920);
        imgView.setFitHeight(1080);

        Main.addWindows( imgView, BackDoom1Button.stackPane(), SinglePlayerDoom1Button.stackPane(), MultiPlayerDoom1Button.stackPane(),LeaderBoardsDoom1Button.stackPane(), AchievmentsDoom1Button.stackPane(), HelpOptionsDoom1Button.stackPane());

    }


    public void transitionsOnStart(){ this.transitionY(3.5, startTransitionSpeed);
    }
}

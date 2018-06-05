package menu.buttons.Doom2016Buttons;
import components.Button;
import components.Label;
import engine.Initialize;
import engine.Main;
import javafx.geometry.Pos;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import library.Library;
import menu.buttons.Doom2016Buttons.Campaign.CampaignButton;
import menu.buttons.Doom2016Buttons.Multiplayer.MultiPlayerDoom2016Button;
import menu.buttons.Doom2016Buttons.SnapMap.SnapMapButton;

public class MenuD2016Button extends Button {
    private static double startTransitionSpeed = -5000d;

    ImageView imgView = Library.getImageView("src/resources/helmet.png");



    Button BackDoom2016Button = new BackDoom2016Button(2150, 1020, "BACK [ESC]", 0, 0, "", "", "", "src/resources/fontDoom2016.otf",25, Color.LIGHTGRAY, Color.WHITE, Pos.CENTER);
    Label a = new Label("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                 _______________________________________________________________________________________________________",Color.ANTIQUEWHITE,30, 1000,100);

    Button CampaignButton = new CampaignButton(890, 640, "CAMPAIGN", 160, 200, "src/resources/helmet2 (2).png", "src/resources/helmet2.png", "", "src/resources/fontDoom2016.otf",25, Color.LIGHTGRAY, Color.WHITE, Pos.CENTER);
    Button SnapMapButton = new SnapMapButton(1540,640,"SNAPMAP",180,190,"src/resources/uac.png","src/resources/uac2.png", "", "src/resources/fontDoom2016.otf",25, Color.LIGHTGRAY, Color.WHITE, Pos.CENTER);
    Button MultiPlayer = new MultiPlayerDoom2016Button(175,640,"MULTIPLAYER",190,190,"src/resources/skull.png","src/resources/skull2.png", "", "src/resources/fontDoom2016.otf",25, Color.LIGHTGRAY, Color.WHITE, Pos.CENTER);

    public MenuD2016Button(int x, int y, String text, int width, int height, String imagePath, String imagePath2, String moviePath, String fontPath, double fontSize, Color textColor, Color textColor2, Pos alignment) {
        super(x, y, text, width, height, imagePath, imagePath2, moviePath, fontPath, fontSize, textColor, textColor2, alignment);
    }

    public void onClicked() {
        Main.clearWindows();
        Initialize.soundtrackStart2();
        Initialize.menuDoom2016Scene();

        Main.addWindows(BackDoom2016Button.stackPane(), CampaignButton.stackPane(), SnapMapButton.stackPane(), MultiPlayer.stackPane(), a.stackPane());
    }


    public void transitionsOnStart(){ this.transitionY(2.5, startTransitionSpeed);
    }
}

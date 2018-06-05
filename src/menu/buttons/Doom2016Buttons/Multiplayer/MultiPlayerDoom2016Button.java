package menu.buttons.Doom2016Buttons.Multiplayer;

import components.Button;
import engine.Main;
import javafx.geometry.Pos;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import menu.buttons.Doom2016Buttons.StaticButtons;

public class MultiPlayerDoom2016Button extends Button {
    public MultiPlayerDoom2016Button(int x, int y, String text, int width, int height, String imagePath, String imagePath2, String moviePath, String fontPath, double fontSize, Color textColor, Color textColor2, Pos alignment) {
        super(x, y, text, width, height, imagePath, imagePath2, moviePath, fontPath, fontSize, textColor, textColor2, alignment);
    }

    public void mouseEnter() {
        transitionX(0.01f, +10);
        if(rememberedMovie==null && rememberedImage2!=null)
        {
            image=null;
            image2=rememberedImage2;
            background.setFill(new ImagePattern(image2));
        }
        else if(rememberedImage2==null&&rememberedMovie==null)  {
            image = rememberedImage;
            background.setFill(new ImagePattern(image));
        }

        StaticButtons.startMultiPlayer.transitionY(0.5, -200);
        StaticButtons.rankingsMultiplayer.transitionY(0.5, -200);
        StaticButtons.achievnementMultiButton.transitionY(0.5,-200);

        StaticButtons.createSnapMap.transitionY(0.5, 200);
        StaticButtons.loadSnapMap.transitionY(0.5, 200);
        StaticButtons.startCampaignButton.transitionY(0.5, 200);
        StaticButtons.seeMore.transitionY(0.5, 200);
        StaticButtons.seeMore2.transitionY(0.5, 200);
        StaticButtons.seeBestMap.transitionY(0.5,200);

	    Main.removeWindows(StaticButtons.createSnapMap.stackPane(), StaticButtons.seeMore.stackPane(), StaticButtons.seeMore2.stackPane(), StaticButtons.startCampaignButton.stackPane(), StaticButtons.loadSnapMap.stackPane(), StaticButtons.seeBestMap.stackPane());
        Main.addWindowsIfNotExist(StaticButtons.startMultiPlayer.stackPane(), StaticButtons.rankingsMultiplayer.stackPane(), StaticButtons.achievnementMultiButton.stackPane());
    }

    public void mouseExit() {
        transitionX(0.01f, 0);
        if(rememberedImage2!=null&& rememberedImage!=null)
        {
            image2=null;
            image=rememberedImage;
            background.setFill(new ImagePattern(image));
        }

    }
}


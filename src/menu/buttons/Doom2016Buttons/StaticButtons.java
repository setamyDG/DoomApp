package menu.buttons.Doom2016Buttons;

import components.Button;
import javafx.geometry.Pos;
import javafx.scene.paint.Color;
import menu.buttons.Doom1Buttons.AchievmentsDoom1Button;
import menu.buttons.Doom2016Buttons.Campaign.CreditsButton;
import menu.buttons.Doom2016Buttons.Campaign.StartCampaignButton;
import menu.buttons.Doom2016Buttons.Campaign.seeMore;
import menu.buttons.Doom2016Buttons.Multiplayer.AchieviementMultiplayerButton;
import menu.buttons.Doom2016Buttons.Multiplayer.RankingsMultiplayerButton;
import menu.buttons.Doom2016Buttons.Multiplayer.StartMultiPlayerButton;
import menu.buttons.Doom2016Buttons.SnapMap.CreateSnapMapButton;
import menu.buttons.Doom2016Buttons.SnapMap.LoadSnapMapButton;
import menu.buttons.Doom2016Buttons.SnapMap.SeeBestMapButton;


public class StaticButtons {
	public static Button startCampaignButton = new StartCampaignButton(685, 975, "START GAME", 560,250,"src/resources/d1.jpg","src/resources/d11.jpg","","src/resources/fontDoom2016.otf", 25, Color.LIGHTGRAY, Color.WHITE, Pos.CENTER);
	public static Button seeMore = new seeMore(70,980,"READ MORE",560,250,"src/resources/d2.jpg","src/resources/d22.jpg","","src/resources/fontDoom2016.otf",25,Color.LIGHTGRAY, Color.WHITE, Pos.CENTER);
	public static Button seeMore2 = new CreditsButton(1300,972,"CREDITS",560,250,"src/resources/d3.jpg","src/resources/d33.jpg","","src/resources/fontDoom2016.otf",25,Color.LIGHTGRAY, Color.WHITE, Pos.CENTER);
	public static Button createSnapMap = new CreateSnapMapButton(685, 975, "CREATE MAP", 560,250,"src/resources/createsnapmap.jpg","src/resources/createsnapmap2.jpg","","src/resources/fontDoom2016.otf", 25, Color.LIGHTGRAY, Color.WHITE, Pos.CENTER);
	public static Button startMultiPlayer = new StartMultiPlayerButton(70,980,"START MULTIPLAYER",560,250,"src/resources/m1.jpg","src/resources/m11.jpg","","src/resources/fontDoom2016.otf",25,Color.LIGHTGRAY, Color.WHITE, Pos.CENTER);
	public static Button rankingsMultiplayer = new RankingsMultiplayerButton(685, 976, "RANKING", 560, 250,"src/resources/rankings.jpg","src/resources/rankings2.jpg", "","src/resources/fontDoom2016.otf",25, Color.LIGHTGRAY, Color.WHITE, Pos.CENTER);
	public static Button achievnementMultiButton = new AchieviementMultiplayerButton(1300, 973, "ACHIEVNEMENT", 560, 250,"src/resources/achiev.jpg","src/resources/achiev2.jpg", "","src/resources/fontDoom2016.otf",25, Color.LIGHTGRAY, Color.WHITE, Pos.CENTER);
	public static Button loadSnapMap = new LoadSnapMapButton(70,980, "LOAD YOUR SNAPMAP", 560,250,"src/resources/loadsnapmap.jpg","src/resources/loadsnapmap2.jpg","","src/resources/fontDoom2016.otf",25, Color.LIGHTGRAY, Color.WHITE, Pos.CENTER);
	public static Button seeBestMap = new SeeBestMapButton(1300,972, "SEE BEST MAP", 560,250,"src/resources/readmoresnap.jpg","src/resources/readmoresnap2.jpg","","src/resources/fontDoom2016.otf",25, Color.LIGHTGRAY, Color.WHITE, Pos.CENTER);
}

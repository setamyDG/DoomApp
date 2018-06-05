package menu.buttons.Doom2016Buttons;

import components.Button;
import engine.Initialize;
import engine.Main;
import engine.Menu;
import javafx.geometry.Pos;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;


public class BackDoom2016Button extends Button {
    private static double startTransitionSpeed = -450d;

    public BackDoom2016Button(int x, int y, String text, int width, int height, String imagePath, String imagePath2, String moviePath, String fontPath, double fontSize, Color textColor, Color textColor2, Pos alignment) {
        super(x, y, text, width, height,  imagePath, imagePath2, moviePath, fontPath, fontSize, textColor, textColor2, alignment);
	    Main.scene.setOnKeyReleased(event -> {
		    if(event.getCode() == KeyCode.ESCAPE) {
		    	if(Main.getWindows().contains(stackPane))
			        escapeReleased();
		    }
	    });
    }

	public void escapeReleased() {

	}

    public void onClicked()
    {
        Main.clearWindows();
        Initialize.soundtrack2.stop();
        Initialize.soundtrack.play();
        Initialize.menuStart();
        Menu.buttonsInitialize();
    }

    public void transitionsOnStart() {
        this.transitionX(5.5,startTransitionSpeed);
    }

    @Override
    public void mouseEnter() {
        transitionX(0.1d, startTransitionSpeed+10);
    }

    @Override
    public void mouseExit() {
        transitionX(0.1d, startTransitionSpeed-10);
    }

    /*public void onKeyClicked(javafx.scene.input.KeyEvent e)
    {

        if(e.getCode().getCode() == KeyEvent.VK_ESCAPE)
        {
            Main.clearWindows();
            Initialize.soundtrack2.stop();
            Initialize.soundtrack.play();
            Initialize.menuStart();
            Menu.buttonsInitialize();
        }
        else
        {
            System.out.println("chuj");
        }

    }*/
}

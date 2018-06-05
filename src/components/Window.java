package components;

import javafx.animation.TranslateTransition;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.util.Duration;
import library.Dc;


public class Window {
	protected int spacing;
	protected Dc position;
	public VBox vBox;


	public Window(int x, int y, int spacing) {
		position = new Dc(x, y);
		new Label("", Color.RED, 25, (int) position.x(), (int) position.y());
		this.spacing = spacing;
		vBox = new VBox(spacing);
		applyPositionChange();
	}


	public Window(int x, int y) {
		position = new Dc(x, y);
		vBox = new VBox();
	}


	public void move(int x, int y) {
		position = position.add(x, y);
		applyPositionChange();
	}


	public void setPosition(int x, int y) {
		position = new Dc(x, y);
		applyPositionChange();
	}


	private void applyPositionChange() {
		vBox.setTranslateX(position.x());
		vBox.setTranslateY(position.y());
	}


	public Dc getPos() {
		return position;
	}
}

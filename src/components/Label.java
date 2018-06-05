package components;

import javafx.geometry.Pos;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import library.Dc;


public class Label extends StackPane {
	private Dc pos;
	private StackPane stackPane = new StackPane();


	public Label(String text, Color color, int fontSize, int x, int y) {
		pos = new Dc(x, y);
		Text textComponent = new Text(pos.x(), pos.y(), text);
		textComponent.setFill(color);
		textComponent.setFont(Font.font("ARIAL BLACK", fontSize));

		stackPane.getChildren().addAll(textComponent);

	}

	public  StackPane stackPane() {
		return stackPane;
	}
}

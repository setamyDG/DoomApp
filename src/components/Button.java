package components;

import engine.Menu;
import javafx.animation.TranslateTransition;
import javafx.geometry.Pos;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.util.Duration;
import library.Dc;
import library.Library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public abstract class Button extends Window {
	public boolean onStartPosition = true;
	public Color backgroundColor = null;
	public Color textColor;
	public Color textColor2;
	public double opacity = 1.5d;
	public double gaussianBlur = 0.0d;
	public Pos alignment;
	public double rotation = -0.5d;
	public Image image, rememberedImage, image2, rememberedImage2;
	public Movie movie, rememberedMovie;
	public int width, height;
	public StackPane stackPane;
	public Rectangle background;
	public Text textComponent;
	public MediaPlayer buttonClick;
	public String text, fontPath;
	public double fontSize;


	public Button(int x, int y, String text, int width, int height,String imagePath, String imagePath2, String moviePath, String fontPath, double fontSize, Color textColor, Color textColor2, Pos alignment) {
		super(x, y);
		this.alignment=alignment;
		this.textColor2=textColor2;
		this.textColor=textColor;
		this.fontPath = fontPath;
		this.fontSize = fontSize;
		this.width = width;
		this.height = height;
		this.text = text;
		if (!imagePath.equals("")){
			image = Library.getImage(imagePath);
			rememberedImage = image;
		}
		if(!imagePath2.equals(""))
		{
			image2 =Library.getImage(imagePath2);
			rememberedImage2=image2;
		}
		stackPane = new StackPane();
		if (!moviePath.equals("")){
			movie = new Movie(moviePath, width, height, 0f, x, y){};
			movie.getMediaView().setPreserveRatio(false);
			movie.getMediaPlayer().setCycleCount(MediaPlayer.INDEFINITE);
			movie.getMediaPlayer().setVolume(0);
			rememberedMovie = movie;
		}
		position = new Dc(x, y);
		style();
		createButton();
		applyStyle();
		if(movie != null){
			if(image == null && image2==null)
				stackPane.getChildren().add(movie.getMediaView());
			if(image2==null && image!=null)
				background.setFill(new ImagePattern(image));

			else background.setFill(new ImagePattern(image));
		}
        if((movie == null)&&(image!=null)){
		    background.setFill(new ImagePattern(image));

		}

		Menu.buttons.add(this);
	}


	public void createButton() {
		textComponent = new Text(text);
		background = new Rectangle(width, height);
		//background.setStroke(Color.GHOSTWHITE);
		//background.setStrokeWidth(3);
		stackPane.setLayoutX(position.x());
		stackPane.setLayoutY(position.y());
		stackPane.setOnMouseClicked(event -> {
			transitionsOnClick();
			onClicked();
		});
		stackPane.setOnMouseEntered(event -> {
			mouseEnter();
			buttonClick();
		});
		stackPane.setOnMouseExited(event -> {
			mouseExit();
		});
		stackPane.getChildren().addAll(background, textComponent);
		transitionsOnStart();
	}


	public void buttonClick() {
		buttonClick = Library.getMediaPlayer("src/resources/buttonClick.mp3");
		buttonClick.setVolume(0.3);
		buttonClick.play();
	}


	public void escapeReleased() {
		System.out.println(3);
	}


	public void mouseEnter() {
		transitionX(0.01f, +10);
		if((rememberedImage == null)&&(rememberedImage2==null))
			background.setFill(null);
		else if(rememberedMovie != null && rememberedImage != null) {
			image = null;
			movie = rememberedMovie;
			movie.play();
			stackPane.getChildren().add(movie.getMediaView());
		} else if(rememberedMovie != null && rememberedImage == null) {
			movie.play();
		}
		else if(rememberedMovie==null && rememberedImage2!=null)
		{
			image=null;
			image2=rememberedImage2;
			background.setFill(new ImagePattern(image2));
		}
		else if(rememberedImage2==null&&rememberedMovie==null)  {
			image = rememberedImage;
			background.setFill(new ImagePattern(image));
		}
		textComponent.setFill(textColor2);
	}


	public void mouseExit() {
		transitionX(0.01f, 0);
		if(rememberedImage == null)
			background.setFill(null);
		else if(rememberedMovie != null && rememberedImage != null) {
			image = rememberedImage;
			movie.stop();
			stackPane.getChildren().remove(movie.getMediaView());
			movie = null;
		} else if(rememberedMovie != null && rememberedImage == null) {
			movie.stop();
		}
		else if(rememberedImage2!=null&& rememberedImage!=null)
		{
			image2=null;
			image=rememberedImage;
			background.setFill(new ImagePattern(image));
		}
		textComponent.setFill(textColor);
	}


	private void applyStyle() {
		try {
			final Font f = Font.loadFont(new FileInputStream(new File(fontPath)), fontSize);
			textComponent.setFont(f);
			textComponent.setFill(textColor);
			background.setOpacity(opacity);
			background.setEffect(new GaussianBlur(gaussianBlur));
			stackPane.setAlignment(alignment);
			stackPane.setRotate(rotation);

			if (image != null)
				background.setFill(new ImagePattern(image));
			if (movie != null)
				background.setFill(Color.TRANSPARENT);
			else background.setFill(backgroundColor);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		//textComponent.setFont(Font.loadFont(FontUIResource.class.getResource("font.tff").toExternalForm(),10));
		//textComponent.setFont(Font.font("Verdana", fontSize));
		//textComponent.setFill(textColor);
		//background.setOpacity(opacity);
		//background.setEffect(new GaussianBlur(gaussianBlur));
		//stackPane.setAlignment(alignment);
		//stackPane.setRotate(rotation);

		//if (image != null)
		//	background.setFill(new ImagePattern(image));
		//else background.setFill(backgroundColor);
	}


	public  StackPane stackPane() {
		return stackPane;
	}


	public void transition(double duration, double x, double y) {
		TranslateTransition tt = new TranslateTransition(Duration.seconds(duration), stackPane);
		tt.setToY(y);
		tt.play();
	}


	public void transitionX(double duration, double x) {
		TranslateTransition tt = new TranslateTransition(Duration.seconds(duration), stackPane);
		tt.setToX(x);
		tt.play();
	}


	public void transitionY(double duration, double y) {
		TranslateTransition tt = new TranslateTransition(Duration.seconds(duration), stackPane);
		tt.setToY(y);
		tt.play();
	}


	public void onClicked(){
	}


	public void style(){}

	public void transitionsOnClick(){}

	public void transitionsOnStart(){}

	//public abstract void onKeyClicked(javafx.scene.input.KeyEvent event);
}

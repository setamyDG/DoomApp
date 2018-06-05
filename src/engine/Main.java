package engine;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import library.Library;


public class Main extends Application {
    public static Stage stage;
    public static Scene scene;
    public static Pane root;


	@Override
    public void start(Stage primaryStage){
        root = new Pane();
        root.setPrefWidth(Library.getScreenWidth());
        root.setPrefWidth(Library.getScreenHeight());
        stageSettings(primaryStage);
        Initialize.start();
    }


    private void stageSettings(Stage primaryStage) {
    	stage = primaryStage;
        primaryStage.setTitle("DOOM GAMES");
        scene = new Scene(root, Library.getScreenWidth(), Library.getScreenHeight());
        primaryStage.setFullScreen(true);
        primaryStage.setScene(scene);

        primaryStage.setOnCloseRequest(event -> {
	        Platform.exit();
	        System.exit(0);
        });
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

	public static void addWindows(Node...parents){
		for (int i = 0; i < parents.length; i++)
			root.getChildren().add(parents[i]);
	}

	public static void addWindowsIfNotExist(Node...parents){
		for (int i = 0; i < parents.length; i++)
			if(!root.getChildren().contains(parents[i]))
				root.getChildren().add(parents[i]);
	}

	public static void removeWindows(Node ...parents){
		for (int i = 0; i < parents.length; i++)
			root.getChildren().remove(parents[i]);
	}

	public static void clearWindows(){
		root.getChildren().clear();
	}

	public static ObservableList<Node> getWindows(){
		return root.getChildren();
	}
}

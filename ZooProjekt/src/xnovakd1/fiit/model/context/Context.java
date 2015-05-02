package xnovakd1.fiit.model.context;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Context {
    private Stage primaryStage;
    private Scene currScene;

    public Context(Stage primaryStage) {

        this.primaryStage = primaryStage;
    }

    public void switchScene(Parent root){
        switchScene(new Scene(root));

    }

    public void switchScene(Scene scene){
        currScene = scene;
        primaryStage.setScene(currScene);
        primaryStage.sizeToScene();
        primaryStage.setResizable(false);
        primaryStage.setTitle("ZooManazer");
        primaryStage.show();
    }
}


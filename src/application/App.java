package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application{

    @Override
    public void start(Stage primaryStage){
        StackPane root = new StackPane();

        Scene scene = new Scene(root, 400, 400);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Titulo Interfaz");
        primaryStage.show();

    }
    public static void main(String[] args) throws Exception {
        launch(args);
    }

	/* Comentario prueba */
}

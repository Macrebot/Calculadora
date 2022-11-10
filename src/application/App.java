package application;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class App extends Application{

    public void Suma(){

    }

    @Override
    public void start(Stage primaryStage){
        StackPane root = new StackPane();

        Label respuesta = new Label("0");

        TextField num1 = new TextField();
        TextField num2 = new TextField();

        Button suma = new Button("Sumar");
        Button resta = new Button("Restar");
        Button multiplicacion = new Button("Multiplicacion");
        Button division = new Button("División");

        suma.setOnAction(new EventHandler<ActionEvent>(){

            @Override
            public void handle(ActionEvent arg0){
                int num3 = Integer.parseInt(num1)+ Integer.parseInt(num2);
                String responde = num1 + num2;
                respuesta.setText(responde);
            }
        });

        Scene scene = new Scene(root, 400, 400);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Titulo Interfaz");
        primaryStage.show();

    }
    public static void main(String[] args) throws Exception {
        launch(args);
        String var = " ";
        if (var.isEmpty()) {
            
        }
    }

	/* Comentario prueba */
}

package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class App extends Application{

    public static int Suma(int a, int b){
        return a + b;
    }

    public static int Resta(int a, int b){
        return a - b;
    }

    public static int Multiplicacion(int a, int b){
        return a * b;
    }

    public static double Division (int a, int b){
        return (double)a / (double)b;
    }

    @Override
    public void start(Stage primaryStage){
        GridPane root = new GridPane();

        Label labelRespuesta = new Label("No hay resultado aún.");
        Label label1 = new Label("Introduce número 1: ");
        Label label2 = new Label("Introduce número 2: ");
        Label lEmpty = new Label();
        Label error = new Label("No hay errores.");

        TextField fieldNum1 = new TextField();
        TextField fieldNum2 = new TextField();

        Button btnSuma = new Button("Sumar");
        Button btnResta = new Button("Restar");
        Button btnMultiplicacion = new Button("Multiplicacion");
        Button btnDivision = new Button("División");

        btnSuma.setOnAction(new EventHandler<ActionEvent>(){

            @Override
            public void handle(ActionEvent e){
                String stringRespuesta;

                int intRespuesta = Suma(
                    Integer.parseInt(fieldNum1.getText()), 
                    Integer.parseInt(fieldNum2.getText()));

                System.out.println(intRespuesta);
                stringRespuesta = Integer.toString(intRespuesta);
                labelRespuesta.setText("El resultado es " + stringRespuesta);
            }
        });

        btnResta.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e){
                String stringRespuesta;

                int intRespuesta = Resta(
                    Integer.parseInt(fieldNum1.getText()),
                    Integer.parseInt(fieldNum2.getText()));

                stringRespuesta = Integer.toString(intRespuesta);
                labelRespuesta.setText("El resultado es: " + stringRespuesta);
            }
        });

        btnMultiplicacion.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e){
                String stringRespuesta;

                int intRespuesta = Multiplicacion(
                    Integer.parseInt(fieldNum1.getText()), 
                    Integer.parseInt(fieldNum2.getText()));

                stringRespuesta = Integer.toString(intRespuesta);
                labelRespuesta.setText("El resultado es: " + stringRespuesta);
            }
        });

        btnDivision.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e){
                String stringRespuesta;

                double doubleRespuesta = Division(
                    Integer.parseInt(fieldNum1.getText()), 
                    Integer.parseInt(fieldNum2.getText()));

                stringRespuesta = Double.toString(doubleRespuesta);
                labelRespuesta.setText("El resultado es: " + stringRespuesta);
            }
        });

        root.addRow(0, label1, fieldNum1);
        root.addRow(1, label2, fieldNum2);
        root.addRow(2, lEmpty);
        root.addRow(3, labelRespuesta);
        root.addRow(5, btnSuma);
        root.addRow(6, btnResta);
        root.addRow(7, btnMultiplicacion);
        root.addRow(8, btnDivision);
        root.addRow(9, error);

        Scene scene = new Scene(root, 500, 500);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Titulo Interfaz");
        primaryStage.show();

    }
    public static void main(String[] args){
        launch(args);
    }

	/* Comentario prueba */
}

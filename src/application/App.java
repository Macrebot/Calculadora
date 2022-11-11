package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.util.concurrent.CountDownLatch;

import application.functions.Functions;

public class App extends Application{

    @Override
    public void start(Stage primaryStage){
        Functions F = new Functions();
        GridPane root = new GridPane();

        Label labelRespuesta = new Label("No hay resultado aún.");

        Button btnSuma = new Button("+");
        Button btnResta = new Button("-");
        Button btnMultiplicacion = new Button("*");
        Button btnDivision = new Button("/");
        Button btnResultado = new Button("=");

        Button btnCero = new Button("0");
        Button btnUno = new Button("1");
        Button btnDos = new Button("2");
        Button btnTres = new Button("3");
        Button btnCuatro = new Button("4");
        Button btnCinco = new Button("5");
        Button btnSeis = new Button("6");
        Button btnSiete = new Button("7");
        Button btnOcho = new Button("8");
        Button btnNueve = new Button("9");

        btnSuma.setOnAction(new EventHandler<ActionEvent>(){

            @Override
            public void handle(ActionEvent e){
            }
        });

        btnResta.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e){
            }
        });

        btnMultiplicacion.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e){
            }
        });

        btnDivision.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e){
            }
        });

        root.add(labelRespuesta, 0, 0, 3, 2);
        labelRespuesta.setMaxSize(Double.MAX_VALUE, 100);
        labelRespuesta.setMinSize(Double.MAX_VALUE, 100);

        int btnSizes = 100;

        root.add(btnNueve,  2, 3);
        btnNueve.setMinSize(btnSizes, btnSizes);
        btnNueve.setMaxSize(btnSizes, btnSizes);

        root.add(btnOcho,   1, 3);
        btnOcho.setMinSize(btnSizes, btnSizes);
        btnOcho.setMaxSize(btnSizes, btnSizes);

        root.add(btnSiete,  0, 3);
        btnSiete.setMinSize(btnSizes, btnSizes);
        btnSiete.setMaxSize(btnSizes, btnSizes);

        root.add(btnSeis,   2, 4);
        btnSeis.setMinSize(btnSizes, btnSizes);
        btnSeis.setMaxSize(btnSizes, btnSizes);

        root.add(btnCinco,  1, 4);
        btnCinco.setMinSize(btnSizes, btnSizes);
        btnCinco.setMaxSize(btnSizes, btnSizes);

        root.add(btnCuatro, 0, 4);
        btnCuatro.setMinSize(btnSizes, btnSizes);
        btnCuatro.setMaxSize(btnSizes, btnSizes);

        root.add(btnTres,   2, 5);
        btnTres.setMinSize(btnSizes, btnSizes);
        btnTres.setMaxSize(btnSizes, btnSizes);

        root.add(btnDos,    1, 5);
        btnDos.setMinSize(btnSizes, btnSizes);
        btnDos.setMaxSize(btnSizes, btnSizes);

        root.add(btnUno,    0, 5);
        btnUno.setMinSize(btnSizes, btnSizes);
        btnUno.setMaxSize(btnSizes, btnSizes);

        root.add(btnCero,   1, 6);
        btnCero.setMinSize(btnSizes, btnSizes);
        btnCero.setMaxSize(btnSizes, btnSizes);

        Scene scene = new Scene(root, 500, 500);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Titulo Interfaz");
        primaryStage.show();

    }
    public static void main(String[] args){
        launch(args);
    }

}

package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import application.functions.Functions;

public class App extends Application{

    String stringResultado = "0";
    double doubleResultado1 = 0, doubleResultado2 = 0;
    boolean estaHecho = true;
    char caracter = '0';

    @Override
    public void start(Stage primaryStage){
        Functions F = new Functions();
        GridPane root = new GridPane();
        root.setId("root");

        Label labelResultado = new Label("No hay resultado aún.");

        // Creación de los botones
        Button btnSuma = new Button("+");
        btnSuma.setId("operations");

        Button btnResta = new Button("-");
        btnResta.setId("operations");

        Button btnMultiplicacion = new Button("*");
        btnMultiplicacion.setId("operations");

        Button btnDivision = new Button("/");
        btnDivision.setId("operations");

        Button btnResultado = new Button("=");
        btnResultado.setId("operations");

        Button btnCero = new Button("0");
        btnCero.setId("numbers");

        Button btnUno = new Button("1");
        btnUno.setId("numbers");

        Button btnDos = new Button("2");
        btnDos.setId("numbers");

        Button btnTres = new Button("3");
        btnTres.setId("numbers");

        Button btnCuatro = new Button("4");
        btnCuatro.setId("numbers");

        Button btnCinco = new Button("5");
        btnCinco.setId("numbers");

        Button btnSeis = new Button("6");
        btnSeis.setId("numbers");

        Button btnSiete = new Button("7");
        btnSiete.setId("numbers");

        Button btnOcho = new Button("8");
        btnOcho.setId("numbers");

        Button btnNueve = new Button("9");
        btnNueve.setId("numbers");

        // Funcionalidad de los botones
        btnCero.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e){
                
                if (!estaHecho) {
                    stringResultado = stringResultado.concat("0");
                    doubleResultado1 = Double.parseDouble(stringResultado);
                    labelResultado.setText(labelResultado.getText() + "0");
                }
                else {
                    stringResultado = "0";
                    doubleResultado1 = 0;
                    labelResultado.setText(stringResultado);
                    estaHecho = false;
                }
                System.out.println(doubleResultado1 + " : " + doubleResultado2);
            }
        });

        btnUno.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e){
                if (!estaHecho) {
                    stringResultado = stringResultado.concat("1");
                    doubleResultado1 = Double.parseDouble(stringResultado);
                    labelResultado.setText(labelResultado.getText() + "1");
                }
                else{
                    stringResultado = "1";
                    doubleResultado1 = 1;
                    labelResultado.setText("1");
                    estaHecho = false;
                }
                System.out.println(doubleResultado1 + " : " + doubleResultado2);
            }
        });

        btnDos.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e){
                if (!estaHecho) {
                    stringResultado = stringResultado.concat("2");
                    doubleResultado1 = Double.parseDouble(stringResultado);
                    labelResultado.setText(labelResultado.getText() + "2");
                }
                else {
                    stringResultado = "2";
                    doubleResultado1 = 2;
                    labelResultado.setText("2");
                    estaHecho = false;
                }
                System.out.println(doubleResultado1 + " : " + doubleResultado2);
            }
        });

        btnTres.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e){
                if (!estaHecho) {
                    stringResultado = stringResultado.concat("3");
                    doubleResultado1 = Double.parseDouble(stringResultado);
                    labelResultado.setText(labelResultado.getText() + "3");
                }
                else {
                    stringResultado = "3";
                    doubleResultado1 = 3;
                    labelResultado.setText("3");
                    estaHecho = false;
                }
                System.out.println(doubleResultado1 + " : " + doubleResultado2);
            }
        });

        btnCuatro.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e){
                if (!estaHecho) {
                    stringResultado = stringResultado.concat("4");
                    doubleResultado1 = Double.parseDouble(stringResultado);
                    labelResultado.setText(labelResultado.getText() + "4");
                }
                else {
                    stringResultado = "4";
                    doubleResultado1 = 4;
                    labelResultado.setText("4");
                    estaHecho = false;
                }
                System.out.println(doubleResultado1 + " : " + doubleResultado2);
            }
        });

        btnCinco.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e){
                if (!estaHecho) {
                    stringResultado = stringResultado.concat("5");
                    doubleResultado1 = Double.parseDouble(stringResultado);
                    labelResultado.setText(labelResultado.getText() + "5");
                }
                else{
                    stringResultado = "5";
                    doubleResultado1 = 5;
                    labelResultado.setText("5");
                    estaHecho = false;
                }
                System.out.println(doubleResultado1 + " : " + doubleResultado2);
            }
        });

        btnSeis.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e){
                if (!estaHecho) {
                    stringResultado = stringResultado.concat("6");
                    doubleResultado1 = Double.parseDouble(stringResultado);
                    labelResultado.setText(labelResultado.getText() + "6");   
                }
                else {
                    stringResultado = "6";
                    doubleResultado1 = 6;
                    labelResultado.setText("6");
                    estaHecho = false;
                }
                System.out.println(doubleResultado1 + " : " + doubleResultado2);
            }
        });

        btnSiete.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e){
                if (!estaHecho) {
                    stringResultado = stringResultado.concat("7");
                    doubleResultado1 = Double.parseDouble(stringResultado);
                    labelResultado.setText(labelResultado.getText() + "7");
                }
                else{
                    stringResultado = "7";
                    doubleResultado1 = 7;
                    labelResultado.setText("7");
                    estaHecho = false;
                }
                System.out.println(doubleResultado1 + " : " + doubleResultado2);
            }
        });

        btnOcho.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e){
                if (!estaHecho) {
                    stringResultado = stringResultado.concat("8");
                    doubleResultado1 = Double.parseDouble(stringResultado);
                    labelResultado.setText(labelResultado.getText() + "8");
                }
                else{
                    stringResultado = "8";
                    doubleResultado1 = 8;
                    labelResultado.setText("8");
                    estaHecho = false;
                }
                System.out.println(doubleResultado1 + " : " + doubleResultado2);
            }
        });

        btnNueve.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e){
                if (!estaHecho) {
                    stringResultado = stringResultado.concat("9");
                    doubleResultado1 = Double.parseDouble(stringResultado);
                    labelResultado.setText(labelResultado.getText() + "9");
                }
                else{
                    stringResultado = "9";
                    doubleResultado1 = 9;
                    labelResultado.setText("9");
                    estaHecho = false;
                }
                System.out.println(doubleResultado1 + " : " + doubleResultado2);
            }
        });

        btnSuma.setOnAction(new EventHandler<ActionEvent>(){

            @Override
            public void handle(ActionEvent e){
                if (!estaHecho) {
                    if (caracter != '0') {
                        doubleResultado2 = F.Igual(doubleResultado2, doubleResultado1, caracter);
                        doubleResultado1 = 0;
                        caracter = '+';
                    }
                    else{
                        doubleResultado2 = doubleResultado1;
                        doubleResultado1 = 0;
                        caracter = '+';
                    }
                    estaHecho = true;
                    labelResultado.setText(labelResultado.getText() + "+");
                    System.out.println(doubleResultado1+" : " + doubleResultado2);
                }
            }
        });

        btnResta.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e){
                if (!estaHecho) {
                    if (caracter != '0') {
                        doubleResultado2 = F.Igual(doubleResultado2, doubleResultado1, caracter);
                        doubleResultado1 = 0;
                        caracter = '-';
                    }
                    else {
                        doubleResultado2 = doubleResultado1;
                        doubleResultado1 = 0;
                        caracter = '-';
                    }
                    estaHecho = true;
                    labelResultado.setText(labelResultado.getText() + "-");
                    System.out.println(doubleResultado1+" : " + doubleResultado2);
                }
            }
        });

        btnMultiplicacion.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e){
                if (!estaHecho) {
                    if (caracter != '0') {
                        doubleResultado2 = F.Igual(doubleResultado2, doubleResultado1, caracter);
                        doubleResultado1 = 0;
                        caracter = '*';
                    } else {
                        doubleResultado2 = doubleResultado1;
                        doubleResultado1 = 0;
                        caracter = '*';
                    }
                    estaHecho = true;
                    labelResultado.setText(labelResultado.getText() + "*");
                    System.out.println(doubleResultado1+" : " + doubleResultado2);
                }
            }
        });

        btnDivision.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e){
                if (!estaHecho) {
                    if (caracter != '0') {
                        doubleResultado2 = F.Igual(doubleResultado2, doubleResultado1, caracter);
                        doubleResultado1 = 0;
                        caracter = '/';
                    } else {
                        doubleResultado2 = doubleResultado1;
                        doubleResultado1 = 0;
                        caracter = '/';
                    }
                    estaHecho = true;
                    labelResultado.setText(labelResultado.getText() + "/");
                    System.out.println(doubleResultado1+" : " + doubleResultado2);
                }
            }
        });

        btnResultado.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e){
                if (!estaHecho) {
                    if (caracter != '0') {
                        doubleResultado2 = F.Igual(doubleResultado2, doubleResultado1, caracter);
                        stringResultado = Double.toString(doubleResultado2);
                        labelResultado.setText(stringResultado);
                        estaHecho = true;
                        doubleResultado1 = 0;
                        doubleResultado2 = 0;
                        stringResultado = "0";
                    }
                }
            }
        });

        // Diseño de la interfaz
        double lWidth = 540;
        double lHeight = 125;
        double bWidth = 125;
        double bHeight = 125;
        root.add(labelResultado, 0, 0, 5, 2);
        labelResultado.setMaxWidth(lWidth);
        labelResultado.setMinWidth(lWidth);
        labelResultado.setMaxHeight(lHeight);
        labelResultado.setMinHeight(lHeight);

        // Diseño de los botones
        root.add(btnNueve,  2, 3);
        btnNueve.setMaxWidth(bWidth);
        btnNueve.setMinWidth(bWidth);
        btnNueve.setMaxHeight(bHeight);
        btnNueve.setMinHeight(bHeight);

        root.add(btnOcho,   1, 3);
        btnOcho.setMaxWidth(bWidth);
        btnOcho.setMinWidth(bWidth);
        btnOcho.setMaxHeight(bHeight);
        btnOcho.setMinHeight(bHeight);

        root.add(btnSiete,  0, 3);
        btnSiete.setMaxWidth(bWidth);
        btnSiete.setMinWidth(bWidth);
        btnSiete.setMaxHeight(bHeight);
        btnSiete.setMinHeight(bHeight);

        root.add(btnSeis,   2, 4);
        btnSeis.setMaxWidth(bWidth);
        btnSeis.setMinWidth(bWidth);
        btnSeis.setMaxHeight(bHeight);
        btnSeis.setMinHeight(bHeight);

        root.add(btnCinco,  1, 4);
        btnCinco.setMaxWidth(bWidth);
        btnCinco.setMinWidth(bWidth);
        btnCinco.setMaxHeight(bHeight);
        btnCinco.setMinHeight(bHeight);

        root.add(btnCuatro, 0, 4);
        btnCuatro.setMaxWidth(bWidth);
        btnCuatro.setMinWidth(bWidth);
        btnCuatro.setMaxHeight(bHeight);
        btnCuatro.setMinHeight(bHeight);

        root.add(btnTres,   2, 5);
        btnTres.setMaxWidth(bWidth);
        btnTres.setMinWidth(bWidth);
        btnTres.setMaxHeight(bHeight);
        btnTres.setMinHeight(bHeight);

        root.add(btnDos,    1, 5);
        btnDos.setMaxWidth(bWidth);
        btnDos.setMinWidth(bWidth);
        btnDos.setMaxHeight(bHeight);
        btnDos.setMinHeight(bHeight);

        root.add(btnUno,    0, 5);
        btnUno.setMaxWidth(bWidth);
        btnUno.setMinWidth(bWidth);
        btnUno.setMaxHeight(bHeight);
        btnUno.setMinHeight(bHeight);

        root.add(btnCero,   1, 6);
        btnCero.setMaxWidth(bWidth);
        btnCero.setMinWidth(bWidth);
        btnCero.setMaxHeight(bHeight);
        btnCero.setMinHeight(bHeight);

        root.add(btnDivision, 4, 3);
        btnDivision.setMaxWidth(bWidth);
        btnDivision.setMinWidth(bWidth);
        btnDivision.setMaxHeight(bHeight);
        btnDivision.setMinHeight(bHeight);

        root.add(btnMultiplicacion, 4, 4);
        btnMultiplicacion.setMaxWidth(bWidth);
        btnMultiplicacion.setMinWidth(bWidth);
        btnMultiplicacion.setMaxHeight(bHeight);
        btnMultiplicacion.setMinHeight(bHeight);

        root.add(btnResta, 4, 5);
        btnResta.setMaxWidth(bWidth);
        btnResta.setMinWidth(bWidth);
        btnResta.setMaxHeight(bHeight);
        btnResta.setMinHeight(bHeight);

        root.add(btnSuma, 4, 6);
        btnSuma.setMaxWidth(bWidth);
        btnSuma.setMinWidth(bWidth);
        btnSuma.setMaxHeight(bHeight);
        btnSuma.setMinHeight(bHeight);

        root.add(btnResultado, 2, 6);
        btnResultado.setMaxWidth(bWidth);
        btnResultado.setMinWidth(bWidth);
        btnResultado.setMaxHeight(bHeight);
        btnResultado.setMinHeight(bHeight);

        Scene scene = new Scene(root, 540, 655);

        root.setHgap(10);
        root.setVgap(10);

        scene.getStylesheets().add(getClass().getResource("styles/style.css").toExternalForm());

        primaryStage.setScene(scene);
        primaryStage.setTitle("Calculadora");
        primaryStage.show();

    }
    public static void main(String[] args){
        launch(args);
    }

}

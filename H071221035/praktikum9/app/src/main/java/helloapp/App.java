package helloapp;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application{
    private Stage stage;
    @Override
    public void start(Stage primaryStage) {
        stage = primaryStage;
        stage.setTitle("CALCULATOR");
        stage.setScene(showScene1());
        stage.setResizable(false);
        stage.show();
    }

    public Scene showScene1 (){
        ImageView imageView = new ImageView("./image/Calculator.png");
        imageView.setId("logo");
        imageView.setPreserveRatio(true);
        imageView.setFitHeight(600);
        imageView.setFitWidth(400);
        Text text = new Text ("  KALKULATOR\nBANGUN DATAR");
        text.setId("HEADER");
        Button button = new Button("START");
        button.setId("BUTTONSTART");
        button.setOnAction(a->{
            stage.setScene(showScene2());
        });
        
        VBox vBox = new VBox(text,imageView,button);
        vBox.setAlignment(Pos.CENTER);
        StackPane stackPane = new StackPane(vBox);
        Scene scene = new Scene(stackPane, 400, 600);
        scene.getStylesheets().add(getClass().getResource("/style/style.css").toExternalForm());
        return scene;
    }

    public Scene showScene2 (){
        Text text = new Text("CHOOSE MENU");
        text.setId("CHOOSEMENU");
        Button button = new Button("CALCULATOR 1");
        button.setId("CALCULATOR1");
        button.setOnAction(a->{
            stage.setScene(calculator1());
        });
        
        Button button2 = new Button("CALCULATOR 2");
        button2.setId("CALCULATOR2");
        button2.setOnAction(b->{
            stage.setScene(calculator2());
        });
        
        VBox vBox = new VBox(text,button,button2);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(30);
        
        StackPane stackPane = new StackPane(vBox);
        Scene scene = new Scene(stackPane, 400, 600);
        scene.getStylesheets().add(getClass().getResource("/style/style.css").toExternalForm());
        return scene;
    }

    public Scene calculator1(){
        Text text = new Text(" MENGUKUR LUAS\nPERSEGI PANJANG");
        text.setId("JUDULKALKULATOR");
        Label label = new Label("MASUKKAN PANJANG");
        label.setId("MASUKKANPANJANG");
        TextField tfield = new TextField();
        tfield.setId("TFIELD");

        Label label2 = new Label("MASUKKAN PENDEK");
        label2.setId("MASUKKANPENDEK");
        TextField tfield2 = new TextField();
        tfield2.setId("TFIELD");

        Label label3 = new Label("HASIL : ");
        label3.setId("HASIL");
    

        Label label4 = new Label("");
        label4.setId("LABEL4");
        Button button = new Button("CLEAR");
        button.setId("CLEAR");
        button.setOnAction(a->{
            tfield.setText("");
            tfield2.setText("");
            label4.setText("");
        });

        Button button1 = new Button("CALCULATE");
        button1.setId("MASUKKANPANJANG");
        button1.setOnAction(b->{
            try {
                double panjang = Double.parseDouble(tfield.getText());
                double lebar = Double.parseDouble(tfield2.getText());
                label4.setText(String.format("%.1f cm", calculate1(panjang, lebar)));
            } catch (Exception e) {
                label4.setText("DATA YANG ANDA MASUKKAN BUKAN ANGKA");
            }
        });

        Label label6 = new Label("");
        label6.setId("LABEL6");
        Button button2 = new Button("BACK TO MENU");
        button2.setId("MASUKKANPANJANG");
        button2.setOnAction(c->{
            stage.setScene(showScene2());
        });

        VBox vBox = new VBox(text,label,tfield,label2,tfield2,label3,label4,label6,button,button1,button2);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(20);

        StackPane stackPane = new StackPane(vBox);
        Scene scene = new Scene(stackPane, 400, 600);
        scene.getStylesheets().add(getClass().getResource("/style/style.css").toExternalForm());
        return scene;

    }

    public Scene calculator2(){
        Text text = new Text("MENGUKUR LUAS SEGITIGA");
        text.setId("JUDULKALKULATOR");
        Label label = new Label("MASUKKAN ALAS SEGITIGA");
        label.setId("MASUKKANPANJANG");
        TextField tfield = new TextField();
        tfield.setId("TFIELD");

        Label label2 = new Label("MASUKKAN TINGGI SEGITIGA");
        label2.setId("MASUKKANPENDEK");
        TextField tfield2 = new TextField();
        tfield2.setId("TFIELD");

        Label label3 = new Label("HASIL : ");
        label3.setId("HASIL");

        Label label4 = new Label("");
        label4.setId("LABEL4");
        Button button = new Button("CLEAR");
        button.setId("CLEAR");
        button.setOnAction(a->{
            tfield.setText("");
            tfield2.setText("");
            label4.setText("");
        });

        Button button1 = new Button("CALCULATE");
        button1.setId("MASUKKANPANJANG");
        button1.setOnAction(b->{
            try {
                double alas = Double.parseDouble(tfield.getText());
                double tinggi = Double.parseDouble(tfield2.getText());
                label4.setText(String.format("%.2f cm", calculate2(alas, tinggi)));
            } catch (Exception e) {
                label4.setText("DATA YANG ANDA MASUKKAN BUKAN ANGKA");
            }
        });

        Label label6 = new Label("");
        Button button2 = new Button("BACK TO MENU");
        button2.setId("MASUKKANPANJANG");
        button2.setOnAction(c->{
            stage.setScene(showScene2());
        });

        VBox vBox = new VBox(text,label,tfield,label2,tfield2,label3,label4,label6,button,button1,button2);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(20);

        StackPane stackPane = new StackPane(vBox);
        Scene scene = new Scene(stackPane, 400, 600);
        scene.getStylesheets().add(getClass().getResource("/style/style.css").toExternalForm());
        return scene;

    }
    public double calculate1(double panjang, double lebar){
        double result = panjang * lebar;
        return result;   
    }

    public double calculate2(double alas, double tinggi){
        double result2 = (alas * tinggi)/2;
        return result2;   
    }

    public static void main(String[] args) {
        launch();
    }
}
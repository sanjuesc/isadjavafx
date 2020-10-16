package ehu.isad.liburuak;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Liburuak extends Application {


    private Parent liburuUI;
    private Parent xeheUI;

    private Stage stage;

    private ehu.isad.liburuak.controllers.liburuak liburuak;
    private ehu.isad.liburuak.controllers.xehetasunak xehetasunak;

    private String lib;


    @Override
    public void start(Stage primaryStage) throws Exception {

        stage = primaryStage;
        pantailakKargatu();

        stage.setTitle("Liburuak ariketa");
        stage.setScene(new Scene(liburuUI, 600, 400));
        stage.show();
    }

    private void pantailakKargatu() throws IOException {

        FXMLLoader loaderliburu = new FXMLLoader(getClass().getResource("/liburuak.fxml"));
        liburuUI = (Parent) loaderliburu.load();
        liburuak = loaderliburu.getController();
        liburuak.setMainApp(this);

        FXMLLoader loaderxehe = new FXMLLoader(getClass().getResource("/xehetasunak.fxml"));
        xeheUI = (Parent) loaderxehe.load();
        xehetasunak = loaderxehe.getController();
        xehetasunak.setMainApp(this,lib);
    }


    public static void main(String[] args) {
        launch(args);
    }

    public void liburuErakutsi() {
        stage.setScene(new Scene(liburuUI));
        stage.show();
    }

    public void xeheErakutsi() {
        stage.setScene(new Scene(xeheUI));
        stage.show();
    }

    public void setLib(String s){
        lib = s;
    }
}

package ehu.isad.liburuak;


import ehu.isad.liburuak.controllers.LiburuKud;
import ehu.isad.liburuak.controllers.XehetasunakKud;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Liburuak extends Application {


    private Parent liburuUI;
    private Parent xeheUI;

    private Stage stage;

    private LiburuKud liburuak;
    private XehetasunakKud xehetasunak;

    private Book lib;


    @Override
    public void start(Stage primaryStage) throws Exception {

        stage = primaryStage;
        pantailakKargatu();

        stage.setTitle("Liburuak ariketa");
        stage.setScene(new Scene(liburuUI, 600, 400));
        stage.show();
    }

    private void pantailakKargatu() throws Exception {

        FXMLLoader loaderliburu = new FXMLLoader(getClass().getResource("/Liburuak.fxml"));
        liburuUI = (Parent) loaderliburu.load();
        liburuak = loaderliburu.getController();
        liburuak.setMainApp(this);

        FXMLLoader loaderxehe = new FXMLLoader(getClass().getResource("/Xehetasunak.fxml"));
        xeheUI = (Parent) loaderxehe.load();
        xehetasunak = loaderxehe.getController();
        xehetasunak.setMainApp(this);
    }


    public static void main(String[] args) {
        launch(args);
    }

    public void liburuErakutsi() {
        stage.setScene(new Scene(liburuUI));
        stage.show();
    }

    public void xeheErakutsi(Book b ) throws Exception {
        xehetasunak.egin(b);
        stage.setScene(new Scene(xeheUI));
        stage.show();
    }

    public void setLib(Book b){
        lib = b;
    }

}

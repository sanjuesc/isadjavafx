package ehu.isad.liburuak.controllers;

import ehu.isad.liburuak.Book;
import ehu.isad.liburuak.Liburuak;
import ehu.isad.scenebuilder.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class xehetasunak {


    private Liburuak mainApp;

    @FXML
    private Text izenburuText;

    @FXML
    private Text argitalText;

    @FXML
    private Text orriKopText;


    public void setMainApp(Liburuak main) {
        this.mainApp = main;
    }


    @FXML
    public void initialize() {
    }

}

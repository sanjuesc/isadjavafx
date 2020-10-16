package ehu.isad.liburuak.controllers;

import com.google.gson.Gson;
import ehu.isad.liburuak.Book;
import ehu.isad.liburuak.Liburuak;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class xehetasunak {

    private Liburuak mainApp;
    private Gson gson;
    private Book liburua;

    @FXML
    private Text izenburuText;

    @FXML
    private Text argitalText;

    @FXML
    private Text orriKopText;

    @FXML
    private Button butAtzEg;

    @FXML
    void atzeraEgin(ActionEvent event) {
        mainApp.liburuErakutsi();
    }

    public void setMainApp(Liburuak liburuak,String s) {
        mainApp = liburuak;
        liburua = getLib(s);
        izenburuText.setText(liburua.toString());
        argitalText.setText();
    }

    public Book getLib(String s){
        Book emaitza; //No sé usar el json
        emaitza = (Book) gson.toJson(s, Book.class);
        return emaitza;
    }
}

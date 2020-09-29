package ehu.isad;

import com.google.gson.Gson;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;


public class ComboBoxExperiments extends Application  {

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("ComboBox Experiment 1");

        ComboBox comboBox = new ComboBox();
        comboBox.getItems().add("BTC");
        comboBox.getItems().add("ETH");
        comboBox.getItems().add("LTC");
        Label label = new Label();
        comboBox.setEditable(false);

        comboBox.setOnAction(e -> {
            try {
                float price = getPrice((String)comboBox.getValue());
                label.setText(String.valueOf(price));
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });

        VBox vbox = new VBox(label,comboBox);
        Scene scene = new Scene(vbox, 400, 120);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public float getPrice(String txanpon) throws IOException {
        URL coinmarket = new URL("https://api.gdax.com/products/"+txanpon + "-eur/ticker");
        URLConnection yc= coinmarket.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
        Gson gson = new Gson();
        Txanpona txanpona = gson.fromJson(in.readLine(), Txanpona.class);
        in.close();

        return txanpona.price;
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}

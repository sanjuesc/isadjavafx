package ehu.isad;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;


public class ComboBoxExperiments extends Application  {

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("ComboBox Experiment 1");

        ComboBox comboBox = new ComboBox();

        comboBox.getItems().add("BTC");
        comboBox.getItems().add("ETH");
        comboBox.getItems().add("LTC");

        comboBox.setEditable(true);

        comboBox.setOnAction(e -> {
            try {
                System.out.println(getPrice((String)comboBox.getValue()));
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });

        HBox hbox = new HBox(comboBox);

        Scene scene = new Scene(hbox, 200, 120);
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

        float emaitza = 0;
        return emaitza;
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}

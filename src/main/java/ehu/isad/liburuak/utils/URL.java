package ehu.isad.liburuak.utils;
import java.net.*;
import java.io.*;

public class URL {

        public static String URLlortu(String s) throws Exception {
            java.net.URL oracle = new java.net.URL("https://api.gdax.com/products/"+s+"-eur/ticker");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(oracle.openStream()));

            String inputLine;

            while ((inputLine = in.readLine()) != null)
                System.out.println(inputLine);
            in.close();

            return inputLine;


        }

}



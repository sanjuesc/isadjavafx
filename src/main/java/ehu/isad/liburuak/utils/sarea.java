package ehu.isad.liburuak.utils;
import java.net.*;
import java.io.*;

public class sarea {



    public static String URLlortu(String s) throws Exception {
            java.net.URL oracle = new java.net.URL("https://openlibrary.org/api/books?bibkeys="+s+"&jscmd=details&format=json");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(oracle.openStream()));

            String inputLine=in.readLine();
        /*
        while ((inputLine = in.readLine()) != null)
                System.out.println(inputLine);

         */
            in.close();
            return inputLine;


        }

}



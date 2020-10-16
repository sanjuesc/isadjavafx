package ehu.isad.liburuak.utils;
import com.google.gson.Gson;
import ehu.isad.liburuak.Book;

import java.net.*;
import java.io.*;

public class Sarea {

    private static Gson gson;


    public static Book URLlortu(String s) throws Exception {
            java.net.URL oracle = new java.net.URL("https://openlibrary.org/api/books?bibkeys="+s+"&jscmd=details&format=json");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(oracle.openStream()));

            String inputLine=in.readLine();
        /*
        while ((inputLine = in.readLine()) != null)
                System.out.println(inputLine);

         */
            in.close();

            Book emaitza = (Book) gson.fromJson(inputLine,Book.class);

            return emaitza;


        }

}



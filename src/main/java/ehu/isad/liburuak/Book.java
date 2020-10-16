package ehu.isad.liburuak;

import ehu.isad.liburuak.Details;

public class Book {
    String isbn;
    String title;

    String info_url;
    String bib_key;
    String preview_url;
    String thumbnail_url;
    Details details;

    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }

    public String getISBN(){
        return isbn;
    }

    public String getArgitaretxea(){return details.getArgitaretxea();}

    public String getOrriak(){return String.valueOf(details.number_of_pages);}

    public String getIrudiURl() {return thumbnail_url;}

    public String getTitle(){
        return title;
    }
}
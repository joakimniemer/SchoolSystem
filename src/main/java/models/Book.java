package models;

import java.util.concurrent.ThreadLocalRandom;

public class Book {
    private String title;
    private String author;
    private int pages;


    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public  String[] giveWisdom(){
        int numQuotes = 3;
        String[] wisdomQuote = new String[numQuotes]; {
            wisdomQuote[0] = "'To live is the rarest thing in the world. Most people exist, that is all.' – Oscar Wilde";
            wisdomQuote[1] = "'That it will never come again is what makes life so sweet.' – Emily Dickinson";
            wisdomQuote[2] = "'It is never too late to be what you might have been.' – George Eliot";
        }
        for(int i = 0; i < numQuotes; i ++){
            wisdomQuote[i] = String.valueOf(ThreadLocalRandom.current().nextInt(3) + 1);
        }

        return wisdomQuote;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString(){
        return "Book title: " + title + "\nAuthor: " + author + "\nNumber of pages: " + pages;
    }
}
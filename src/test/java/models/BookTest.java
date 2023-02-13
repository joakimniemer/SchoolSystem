package models;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class BookTest {

    Book b1 = new Book("The Book", "Styrbjörn Sydvväst", 100);

    //Testing if the array contains any of the three quotes.
    @Test
    public void quoteTest() {
        String[] testQuote = new String[3];
        testQuote[0] = "'To live is the rarest thing in the world. Most people exist, that is all.' – Oscar Wilde";
        testQuote[1] = "'That it will never come again is what makes life so sweet.' – Emily Dickinson";
        testQuote[2] = "'It is never too late to be what you might have been.' – George Eliot";

        assertTrue(Arrays.asList(testQuote).contains(b1.giveWisdom()));
    }

    //Test if the quote does not exist.
    @Test
    public void quoteTestNotValidQuote() {
        String[] testQuote = new String[3];
        testQuote[0] = "'To live is the rarest thing in the world. Most people exist, that is all.' – Oscar Wilde";
        testQuote[1] = "'That it will never come again is what makes life so sweet.' – Emily Dickinson";
        testQuote[2] = "'It is never too late to be what you might have been.' – George Eliot";

        assertFalse(Arrays.asList(testQuote).contains("Not a quote"));
    }

}

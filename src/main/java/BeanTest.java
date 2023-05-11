import models.Albumn;
import models.Author;
import models.Quote;

import java.util.ArrayList;

public class BeanTest {
  public static void main(String[] args) {
    Albumn album = new Albumn();
    Author author = new Author();
    Quote quote = new Quote();

    ArrayList<Quote> quotes = new ArrayList<>();
    quotes.add(quote);
    quotes.add(quote);
    quotes.add(quote);
    quotes.add(quote);
    quotes.add(quote);
    quotes.add(quote);
    quotes.add(quote);
    quotes.add(quote);
    quotes.add(quote);
    quotes.add(quote);
    quotes.add(quote);
    quotes.add(quote);
    quotes.add(quote);
    quotes.add(quote);

    for (Quote q : quotes) {
      System.out.println(q.getContent() + " - " + q.getAuthor().getFirstName() + " " + q.getAuthor().getLastName());
    }

  }
}

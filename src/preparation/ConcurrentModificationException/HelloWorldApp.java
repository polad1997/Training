package preparation.ConcurrentModificationException;

import java.util.ArrayList;
import java.util.List;

public class HelloWorldApp {
    public static void main(String[] args) {
        List<String> listOfBooks = new ArrayList<>();
        listOfBooks.add("1");
        listOfBooks.add("Code 2");
        listOfBooks.add("3");
        listOfBooks.add("4 Code");
        System.out.println("List before : " + listOfBooks);
        for (int i = 0; i < listOfBooks.size(); i++) {
            String book = listOfBooks.get(i);
            if (book.contains("Code")) {
                System.out.println("Removing " + book);
                listOfBooks.remove(i); // will throw CME
            }
        }
        System.out.println("List after : " + listOfBooks);
    }
}


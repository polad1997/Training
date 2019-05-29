package oca.tests;

public class Ebook extends Book {

  @Override
  void aa() {
    System.out.println("aaaaa");
  }

  public static void main(String[] args) {
    Book  book = new Ebook();
    book.aa();
  }
}

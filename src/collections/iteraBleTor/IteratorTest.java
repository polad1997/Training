package collections.iteraBleTor;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;

public class IteratorTest implements Iterator{

  public static void main(String[] args) {
    Iterator<Integer> iterator = Arrays.asList(1, 2, 3, 4, 5).iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    iterator.forEachRemaining(System.out::println);

  }

  @Override
  public boolean hasNext() {
    return false;
  }

  @Override
  public Object next() {
    return null;
  }
}

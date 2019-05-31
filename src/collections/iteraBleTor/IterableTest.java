package collections.iteraBleTor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class IterableTest implements Iterable {

  public static void main(String[] args) {
    List<String> persons = new ArrayList<>(Arrays.asList("a", "b", "c"));
    persons.forEach(s1 -> System.out.println(s1.equals("b")));
  }

  @Override
  public Iterator iterator() {
    return null;
  }

  @Override
  public void forEach(Consumer action) {

  }

  @Override
  public Spliterator spliterator() {
    return null;
  }
}

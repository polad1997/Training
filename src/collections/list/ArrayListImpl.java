package collections.list;

import sun.net.www.content.text.Generic;

import java.util.Arrays;

public class ArrayListImpl<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public ArrayListImpl() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public static void main(String[] args) {
        ArrayListImpl<String> arrayList = new ArrayListImpl();
        arrayList.add("44");
        arrayList.add("SSS");

    }
}

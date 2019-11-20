package ocp.boyarski.equals;

import java.util.Objects;

/**
 * @author PoladA
 * @Date&Time 11/19/2019 19:10
 */
public class TestLion {
}

class Lion {

    public static void main(String[] args) {

        Lion lion = new Lion("Polad", 22);
        Lion lion1 = new Lion("Polad", 22);

        System.out.println(lion.equals(lion1));
        System.out.println(lion.hashCode() == lion1.hashCode());

    }

    private String name;
    private Integer age;

    public Lion(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {

        if (!(o instanceof Lion)) return false;

        Lion lion = (Lion) o;
        return this.name == lion.name;
    }

}
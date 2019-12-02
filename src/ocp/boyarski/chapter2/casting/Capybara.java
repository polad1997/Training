package ocp.boyarski.chapter2.casting;

/**
 * @author PoladA
 * @Date&Time 11/29/2019 14:57
 */
public class Capybara extends Rodent {

    public static void main(String[] args) {
        Rodent rodent = new Rodent();
        Capybara capybara1 = new Capybara();

        if (capybara1 instanceof Rodent) {
            System.out.println("ok");
            Capybara capybara = (Capybara) rodent;
        }


    }

}

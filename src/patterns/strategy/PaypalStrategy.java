package patterns.strategy;

/**
 * @author PoladA
 * @Date&Time 1/29/2020 15:20
 */
public class PaypalStrategy implements PaymentStrategy {

    private String emailId;
    private String password;

    public PaypalStrategy(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }


    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with Paypal");
    }
}

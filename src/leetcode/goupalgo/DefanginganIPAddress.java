package leetcode.goupalgo;

/**
 * @author PoladA
 * @Date&Time 2/24/2020 12:04
 */
public class DefanginganIPAddress {

    public static void main(String[] args) {
        String ipAddress = "255.100.50.0";
        String ipAddress2 = ipAddress.replace(".", "[.]");
        System.out.println(ipAddress2);
    }

}

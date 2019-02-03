package oca.chapter1.packageandimports;

/**
 * import java.sql.Date;
 * import java.util.Date; //NOT TRUE!
 */

import java.sql.Date;

/**
 * import java.sql.*;                  Bu kitabda DOES NOT Compile yazilib ,
 * import java.util.*;             lakin hal hazirda uncomment edsek Compile olacaq.WHY???
 */
public class NamingConflict {

    public static void main(String[] args) {
        Date sqldate;
        java.util.Date utilDate;  //Yaratmaq istediyimiz objectleri bucur de yarada bilerik
//        java.sql.Date sqlDate;

    }


}

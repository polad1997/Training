package oca.chapter2.switchcase;

public class Test {

    public static void main(String[] args) {
        String name = "Polad";
        switch (name) {
            case "Polad":
                System.out.println("Bingo!");
            default:
                System.out.println("JJJJJJJJJJJ");
        }

        /**
         * switch-case long (Long) ve boolean i desteklemir
         */
//        long a = 2 ;
//        switch (a) {
//            case 2 :
//                System.out.println("asd");

        /**
         * ESAS SHERT ODURKI
         * CASE ODENMIRSE DEFAULTUN YERINDEN ASILI OLARAQ CAP EDIR
         * YENI DEFAULT EVVELDEDIRSE BUTUN CASELERE GIRIR (BREAK A FIKIR VER)
         * ORTA  ,  AXIR
         */


        /**
         * ---------->>>>  1 <<<<------------
         * hec bir case duz olmadiqda ve break olmadiqda
         * her birini cap edir
         */

        int days = 4;
        switch (days) {
            default:
                System.out.println("default");
            case 0:
                System.out.println("000000000");
            case 5:
                System.out.println("55555555");
            case 3:
                System.out.println("33333");

        }

        /**
         *
         * ---------->>>>  2 <<<<------------
         * hec bir case duz olmadiqda ve break olduqda
         * break hardadirsa orada kesilir
         *
         */

        switch (days) {
            default:
                System.out.println("default");
            case 0:
                System.out.println("000000000");
                break;                              //burada sonlanir
            case 5:
                System.out.println("55555555");
            case 3:
                System.out.println("33333");
        }

    }

//    private int getSortOrder(String firstName, final String lastName) {
//        String middleName = "Patricia";
//        final String suffix = "JR";
//        int id = 0;
//        switch (firstName) {
//            case "Test":
//                return 52;
//                break;
//            case middleName: //constant variable olmalidir
//                id = 4;
//                return 33;
////            case lastName:  //initialize olmalidir
//                id = 3;
//                break;
//            case 5:  //int
//                return 2;
//            case "j":
//                return 3;
//        }
//    }

}

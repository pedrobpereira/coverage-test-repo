public class Whatever {

    public String returnWhat(String what, boolean whatIf) {

        if (whatIf) {
            System.out.println();
            System.out.println();

            return what;
        }
        else {
            return "nothing";
        }
    }

    public String returnWhat2(String what, boolean whatIf) {

        if (whatIf) {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();

            return what;
        }
        else {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            return "nothing";
        }
    }
}

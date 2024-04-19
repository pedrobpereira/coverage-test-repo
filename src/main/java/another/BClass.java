package another;

public class BClass {
    public String returnWhat(String what, boolean whatIf) {

        if (whatIf) {
            System.out.println();
            System.out.println();
            System.out.println();

            return what;
        }
        else {
            return "nothing";
        }
    }
}

public class Whatever {

    public String returnWhat(String what, boolean whatIf) {

        if (whatIf) {
            return what;
        }
        else {
            return "nothing";
        }
    }

    public void printWhat(String what) {
        System.out.println(what);
    }
}

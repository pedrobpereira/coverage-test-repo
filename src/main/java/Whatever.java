public class Whatever {

    public String returnWhat(String what, boolean whatIf) {

        if (whatIf) {
            return what;
        }
        else {
            return "nothing";
        }
    }

    public void printWhat(String what, boolean whatIf) {
        if (whatIf && what.isEmpty()) {
        System.out.println(what);
        } else {
            System.out.println("nothing");
        }
    }
}

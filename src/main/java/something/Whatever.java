package something;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;

public class Whatever implements Serializable {

    private java.io.FileInputStream stream; // bad - FileInputStream is not serializable

    public void setStream(FileInputStream stream) {
        this.stream = stream;
    }

    public String returnWhat(String what, boolean whatIf) {

        if (whatIf) {

        }
        else {
            return "nothing + 1";
        }

        return what;
    }

    public String returnWhat2(String what, boolean whatIf) {

        int wwiwiwiw;
        int wwiwiwiw2;

        if (whatIf) {
            System.out.println();
            System.out.println();
            System.out.println();

            return what;
        }
        else {
            System.out.println();
            return "nothing";
        }
    }

    public void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
        // custom deserialization code
    }
}

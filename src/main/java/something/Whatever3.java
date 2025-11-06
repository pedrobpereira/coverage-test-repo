package something;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

public class Whatever3 {

    public String returnWhat(String what, boolean whatIf) throws IOException {

        HttpServer srv_srv = HttpServer.create(new InetSocketAddress(111), 0);

        if (whatIf) {
            System.out.println();
            System.out.println();

            return what;
        }
        else {
            return "nothing";
        }
    }

}

import java.io.BufferedInputStream;
import java.net.Socket;

public class InputSteamsServer extends Thread {
    private int id;
    private Thread thread;
    private Socket socket;
    public BufferedInputStream bif;

    public InputSteamsServer(Socket socket, int id) {
        this.socket = socket;
        this.id = id;

    }

    @Override
    public void run() {
        System.out.println(this.id + "- start");
        while (true) {

        }
    }


    public void start() {
        if (thread == null) {
            thread = new Thread(this, String.valueOf(this.id));
            thread.start();
        }
    }

}

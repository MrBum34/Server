import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
//блабоа
public class Server_Conection {
    private static ServerSocket serverSocket;
    private static Socket socket;

    private static String id;

    public static void main(String[] args) throws Exception {
        serverSocket = new ServerSocket(3456);
        System.out.println(serverSocket.getInetAddress());
        while (true) {
            socket = serverSocket.accept();
            id = new Scanner(socket.getInputStream()).nextLine();
            System.out.println(id);
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
            pw.println("accept");
            String st = new Scanner(socket.getInputStream()).nextLine();
            System.out.println(st);
            socket.close();
            pw.close();
//            var s = new InputSteamsServer(socket, Integer.valueOf(id));
//            s.start();
//            s.join();

        }
    }

}

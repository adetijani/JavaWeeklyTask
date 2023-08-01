package server;

import java.net.ServerSocket;

public class HttpServerMain {
    public static void main(String[] args) {
        int port = 8080; // Change this to your desired port number
        HttpServerClient ServerSocket = new HttpServerClient(port);
        ServerSocket.start();
    }
}
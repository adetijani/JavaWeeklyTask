package server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class HttpServerClient {
    private int port;

    public HttpServerClient(int port) {
        this.port = port;
    }

// ...

    public void start() {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server started on port " + port);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected: " + clientSocket.getInetAddress().getHostAddress());

// Read the request
                BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                String requestLine = reader.readLine();

// Check if the requestLine is null before proceeding
                if (requestLine != null) {
                    System.out.println("Request: " + requestLine);

// Parse the request
                    String[] requestParts = requestLine.split(" ");
                    String method = requestParts[0];
                    String path = requestParts[1];

// Handle the request
                    if (method.equals("GET") && path.equals("/")) {
                        String response = getHtmlResponse();
                        sendResponse(clientSocket, "200 OK", "text/html", response);
                    } else if (method.equals("GET") && path.equals("/json")) {
                        String response = getJsonResponse();
                        sendResponse(clientSocket, "200 OK", "application/json", response);
                    } else {
                        sendResponse(clientSocket, "404 Not Found", "text/plain", "404 Not Found");
                    }
                } else {
// Handle the case when the requestLine is null
                    sendResponse(clientSocket, "400 Bad Request", "text/plain", "Bad Request");
                }

                clientSocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

// ...


    private String getHtmlResponse() {
        String filePath = "/Users/dsc/IdeaProjects/Pratice/src/main/java/org/example/File/index.html";

        try {
            return new String(Files.readAllBytes(Paths.get(filePath)), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "";
    }


    private String getJsonResponse() {
        String filePath = "/Users/dsc/IdeaProjects/Pratice/src/main/java/org/example/File/app.json";

        try {
            return new String(Files.readAllBytes(Paths.get(filePath)), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "";
    }

    private void sendResponse(Socket clientSocket, String status, String contentType, String content) throws IOException {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
        writer.write("HTTP/1.1 " + status + "\r\n");
        writer.write("Content-Type: " + contentType + "\r\n");
        writer.write("\r\n");
        writer.write(content);
        writer.write("\r\n");
        writer.flush();
    }
}
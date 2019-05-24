package edu.sdccd.mesa.cisc190.practice5.client;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger LOG = LoggerFactory.getLogger(Main.class);

    private static final String STUDENT_BASE_URL =
            "http://localhost:7000/api/v1/students/";

    public static void main(String[] args) {
        Main main = new Main();
        String response;
        LOG.debug("Got {} args on the command line.", args.length);
        if (args.length == 0) {
            response = main.getAllStudents();
        } else {
            StringBuilder sb = new StringBuilder();
            List.of(args).forEach(id -> sb.append(main.getStudent(id)));
            response = sb.toString();
        }
        System.out.println("Students is " + response);
    }

    public String getAllStudents() {
        HttpClient client = createClient();
        HttpRequest request = createRequest();
        String studentListString = "";
        try {
            HttpResponse<String> response = client.send(
                    request, HttpResponse.BodyHandlers.ofString());
            studentListString = response.body();
        } catch (InterruptedException | IOException e) {
            LOG.error("Could not get students list", e);
        }
        return studentListString;
    }

    public String getStudent(String id) {
        HttpClient client = createClient();
        HttpRequest request = createRequest(id);
        String studentString = "";
        try {
            HttpResponse<String> response = client.send(
                    request, HttpResponse.BodyHandlers.ofString());
            studentString = response.body();
        } catch (InterruptedException | IOException e) {
            LOG.error("Could not get student of id '{}'", id, e);
        }
        return studentString;
    }

    private HttpClient createClient() {
        HttpClient client = HttpClient.newHttpClient();
        return client;
    }

    private HttpRequest createRequest() {
        return createHttpRequest(STUDENT_BASE_URL);
    }

    private HttpRequest createRequest(String id) {
        return createHttpRequest(STUDENT_BASE_URL + Optional.of(id).orElse(""));
    }

    private HttpRequest createHttpRequest(String url) {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        return request;
    }
}

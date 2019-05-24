package edu.sdccd.mesa.cisc190.practice5.client;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import com.fasterxml.jackson.jr.ob.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.jr.ob.JSON.*;

public class Main {
    private static final Logger LOG = LoggerFactory.getLogger(Main.class);

    private static final String STUDENT_BASE_URL =
            "http://localhost:7000/api/v1/students/";

    public static void main(String[] args) {
        Main main = new Main();
        final List<Student> response = new ArrayList<>();
        LOG.debug("Got {} args on the command line.", args.length);
        if (args.length == 0) {
            response.addAll(main.getAllStudents());
        } else {
            List.of(args).forEach(id -> response.add(main.getStudent(id)));
        }
        System.out.println("{ \"students\": " + response + "}");
    }

    public List<Student> getAllStudents() {
        HttpClient client = createClient();
        HttpRequest request = createRequest();
        List<Student> studentList;
        try {
            HttpResponse<InputStream> response = client.send(
                    request, HttpResponse.BodyHandlers.ofInputStream());
            studentList = JSON.std.listOfFrom(Student.class, response.body());
        } catch (InterruptedException | IOException e) {
            LOG.error("Could not get students list", e);
            studentList = Collections.emptyList();
        }
        return studentList;
    }

    public Student getStudent(String id) {
        HttpClient client = createClient();
        HttpRequest request = createRequest(id);
        Student student = null;
        try {
            HttpResponse<InputStream> response = client.send(
                    request, HttpResponse.BodyHandlers.ofInputStream());
            student = JSON.std.beanFrom(Student.class, response.body());;
        } catch (InterruptedException | IOException e) {
            LOG.error("Could not get student of id '{}'", id, e);
            // create an empty student
            student = new Student();
        }
        return student;
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
                .header("Accept", "application/json")
                .build();
        return request;
    }
}

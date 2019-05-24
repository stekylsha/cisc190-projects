package edu.sdccd.mesa.cisc190.practice5.server;

import io.javalin.Javalin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger LOG = LoggerFactory.getLogger("Main.class");

    public static void main(String[] args) {
        // initialize the server
        Javalin app = Javalin
                .create()
                .start(7000);

        // say hello
        app.get("/", ctx -> ctx.result("Hello, world!"));
    }
}

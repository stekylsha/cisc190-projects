package edu.sdccd.mesa.cisc190.practice5.server;

import static com.fasterxml.jackson.jr.ob.JSON.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.javalin.BadRequestResponse;
import io.javalin.Handler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StudentHandler {
    private static final Logger LOG = LoggerFactory.getLogger(StudentHandler.class);

    private List<Student> studentList = new ArrayList<>();
    private Map<String, Student> studentMap = new HashMap<>();

    public StudentHandler() {
        try {
            InputStream is = //getClass().getResourceAsStream("final.json");
                    getClass().getClassLoader().getResourceAsStream("final.json");
            if (is == null) {
                throw new IllegalStateException("Bad poopies: no json file");
            }
            studentList = std.listOfFrom(Student.class, is);
        } catch (IOException ioe) {
            LOG.error("Could not read the student list.", ioe);
        }
        studentList.forEach( s -> studentMap.put(s.getId(), s) );
    }

    public Handler getAllStudents = ( ctx ) -> {
        LOG.debug("Getting all {} students", studentList.size());
        ctx.json(studentList);
    };

    public Handler getStudent = ( ctx ) -> {
        String id = ctx.pathParam("id");
        LOG.debug("Getting student {}: {}", id, studentMap.get(id));
        if (studentMap.containsKey(id)) {
            ctx.json(studentMap.get(id));
        } else {
            throw new BadRequestResponse("No such student.");
        }
    };
}

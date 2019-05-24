package edu.sdccd.mesa.cisc190.practice5.client;

public class Student {
    private String name;
    private String id;
    private boolean goodAttitude;
    private String grade;
    private float gpa;

    public Student() {}

    public Student(String name, String id, boolean goodAttitude, String grade, float gpa) {
        this.name = name;
        this.id = id;
        this.goodAttitude = goodAttitude;
        this.grade = grade;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isGoodAttitude() {
        return goodAttitude;
    }

    public void setGoodAttitude(boolean goodAttitude) {
        this.goodAttitude = goodAttitude;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{")
                .append("\"name\": \"").append(name).append("\", ")
                .append("\"id\": \"").append(id).append("\", ")
                .append("\"good\": \"").append(goodAttitude).append("\", ")
                .append("\"grade\": \"").append(grade).append("\", ")
                .append("\"gpa\": \"").append(gpa).append("\"")
                .append("}");
        return sb.toString();
    }
}

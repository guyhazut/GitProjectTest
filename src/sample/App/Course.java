package sample.App;

import java.util.List;

public class Course {
    private int code;
    private String name;

    public Course(int code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Course: " + code + " name= " + name +".";
    }
}

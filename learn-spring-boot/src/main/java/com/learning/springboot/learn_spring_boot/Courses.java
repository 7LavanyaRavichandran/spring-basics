package com.learning.springboot.learn_spring_boot;

public class Courses {
    private long ID;
    private String Course_Name;
    private String resources;

    public Courses(long ID, String course_Name, String resources) {
        this.ID = ID;
        Course_Name = course_Name;
        this.resources = resources;
    }

    public long getID() {
        return ID;
    }

    public String getCourse_Name() {
        return Course_Name;
    }

    public String getResources() {
        return resources;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "ID=" + ID +
                ", Course_Name='" + Course_Name + '\'' +
                ", resources='" + resources + '\'' +
                '}';
    }
}

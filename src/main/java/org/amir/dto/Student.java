package org.amir.dto;

/**
 * This is the Student class
 * @author Amir Zismanov
 */
public class Student {
    private String lname;
    private String fname;
    private String id;
    private int courseNum;
    private Department department;
    private Course[] courses;

    private static int nextId = 1;
    private static final int MAX_COURSE_NUM = 5;

    /**
     * All argument constructor for this class
     * @param fname
     * @param lname
     * @param department
     */
    public Student(String fname, String lname, Department department) {
        this.fname = fname;
        this.lname = lname;
        this.department = department;
        this.id = String.format("S%03d", nextId++);
        this.courses = new Course[MAX_COURSE_NUM];
    }

    public String toString() {
        return null;
    }
}

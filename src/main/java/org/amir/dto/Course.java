package org.amir.dto;

/**
 * This is the Course class
 * @author Amir Zismanov
 */
public class Course {
    private String courseName;
    private String id;
    private double credit;
    private int studentNum;
    private Department department;
    private Teacher teacher;
    private Student[] students;

    private static int nextId = 1;
    private static final int MAX_STUDENT_NUM = 5;

    /**
     * All argument constructor for this class
     * @param courseName
     * @param credit
     * @param department
     */
    public Course(String courseName, double credit, Department department) {
        this.courseName = courseName;
        this.credit = credit;
        this.department = department;
        this.id = String.format("C%03d", nextId++);
        this.students = new Student[MAX_STUDENT_NUM];
    }

    public String toString() {
        return null;
    }
}

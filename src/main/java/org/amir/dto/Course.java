package org.amir.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Getter
@Setter
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

    @Override
    public String toString() {
        return courseName;
    }

    public String getSummery() {
        return "Course{id='" + id + "', courseName='" + courseName + "', credit=" + credit + ", teacher=" + teacher
                + ", department='" + department.getDepartmentName() + "', students=" + SchoolManagementSystem.arrayToString(students) + "}";
    }
}

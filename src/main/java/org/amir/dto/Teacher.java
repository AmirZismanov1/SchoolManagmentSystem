package org.amir.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

/**
 * This is the Teacher class
 * @author Amir Zismanov
 */

public class Teacher {
    private String lname;
    private String fname;
    private String id;
    private Department department;

    private static int nextId = 1;

    /**
     * All argument constructor for this class
     * @param fname
     * @param lname
     * @param department
     */
    public Teacher(String fname, String lname, Department department) {
        this.fname = fname;
        this.lname = lname;
        this.department = department;
        this.id = String.format("T%03d", nextId++);
    }

    public String toString() {
        return fname + " " + lname;
    }

    public String getSummery() {
        return "Teacher{id='" + id + "', fname='" + fname + "', lname='" + lname + "', department='" + department.getDepartmentName()
                + "'}";
    }
}

package org.amir.dto;

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

    public String toString() {
        return null;
    }

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
        this.id = String.format("S%03d", nextId++);
    }
}

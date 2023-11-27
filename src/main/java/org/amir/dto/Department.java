package org.amir.dto;

/**
 * This is the Department class
 * @author Amir Zismanov
 */
public class Department {
    private String departmentName;
    private String id;

    private static int nextId = 1;

    /**
     * All argument constructor for this class
     * @param departmentName
     */
    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.id = String.format("D%03d", nextId++);
    }
    public String toString() {
        return null;
    }
}

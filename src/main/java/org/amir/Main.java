package org.amir;

import org.amir.dto.SchoolManagementSystem;

/**
 * This is the main class that will print everything
 * @author Amir Zismanov
 */
public class Main {
    public static void main(String[] args) {
        SchoolManagementSystem schoolManagementSystem = new SchoolManagementSystem();
        schoolManagementSystem.addDepartment("Math");
        schoolManagementSystem.addDepartment("English");
        schoolManagementSystem.addDepartment("French");
        schoolManagementSystem.printDepartments();
        System.out.println(schoolManagementSystem.findDepartment("D001"));

        schoolManagementSystem.addStudent("Amir","Zismanov", "D001");
        schoolManagementSystem.addStudent("Tali","Zismanov", "D002");
        schoolManagementSystem.printStudents();
        System.out.println(schoolManagementSystem.findStudent("S001"));

        schoolManagementSystem.addTeacher("Yi", "Wang", "D001");
        schoolManagementSystem.addTeacher("V", "Z", "D001");
        schoolManagementSystem.addTeacher("K", "Z", "D001");
        schoolManagementSystem.printTeachers();
        System.out.println(schoolManagementSystem.findTeacher("T001"));

        schoolManagementSystem.addCourse("calculus", 3, "D001");
        schoolManagementSystem.addCourse("Intro to english", 3, "D002");
        schoolManagementSystem.addCourse("Intro to french", 3, "D003");
        schoolManagementSystem.printCourses();
        System.out.println(schoolManagementSystem.findCourse("C001"));

        schoolManagementSystem.modifyCourseTeacher("T001", "C001");

        schoolManagementSystem.registerCourse("S001", "C001");
    }
}

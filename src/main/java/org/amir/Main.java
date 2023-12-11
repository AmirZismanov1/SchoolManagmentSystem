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
        schoolManagementSystem.addDepartment("Computer Science");
        schoolManagementSystem.printDepartments();

        schoolManagementSystem.addStudent("Amir","Zismanov", "D001");
        schoolManagementSystem.addStudent("Tali","Zismanov", "D002");
        schoolManagementSystem.printStudents();

        schoolManagementSystem.addTeacher("Yi", "Wang", "D001");
        schoolManagementSystem.addTeacher("Victor", "Silva", "D001");
        schoolManagementSystem.addTeacher("Charles", "Cena", "D002");
        schoolManagementSystem.printTeachers();

        schoolManagementSystem.addCourse("calculus", 3, "D001");
        schoolManagementSystem.addCourse("Intro to programming", 4, "D002");
        schoolManagementSystem.printCourses();

        schoolManagementSystem.modifyCourseTeacher("T001", "C001");

        schoolManagementSystem.registerCourse("S001", "C001");
        schoolManagementSystem.registerCourse("S001", "C001");
    }
}

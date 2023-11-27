package org.amir.dto;

/**
 * This is the SchoolManagementSystem class, and it connects all the classes and methods of the program.
 * This class allows to print, add and find students, teachers, departments and courses
 * This class allows to modify the course of a teacher and to set a student to a course
 * @author Amir Zismanov
 */
public class SchoolManagementSystem {

    private static final int MAX_STUDENT_NUM = 200;
    private static final int MAX_TEACHERS_NUM = 20;
    private static final int MAX_DEPARTMENTS_NUM = 5;
    private static final int MAX_COURSES_NUM = 30;

    private Student[] students;
    private Teacher[] teachers;
    private Department[] departments;
    private Course[] courses;

    /**
     * No argument constructor for this class
     */
    public SchoolManagementSystem() {
        this.students = new Student[MAX_STUDENT_NUM];
        this.teachers = new Teacher[MAX_TEACHERS_NUM];
        this.departments = new Department[MAX_DEPARTMENTS_NUM];
        this.courses = new Course[MAX_COURSES_NUM];
    }

    /**
     * This method prints the students
     */
    public void printStudents() {

    }

    /**
     * This method prints the teachers
     */
    public void printTeachers() {

    }

    /**
     * This method prints the departments
     */
    public void printDepartments() {

    }

    /**
     * This method adds a student
     * @param fname
     * @param lname
     * @param departmentId
     */
    public void addStudent(String fname, String lname, String departmentId) {

    }

    /**
     * This method adds a teacher
     * @param fname
     * @param lname
     * @param departmentId
     */
    public void addTeacher(String fname, String lname, String departmentId) {

    }

    /**
     * This method adds a department
     * @param name
     */
    public void addDepartment(String name) {

    }

    /**
     * This method adds a course
     * @param courseName
     * @param credit
     * @param departmentId
     */
    public void addCourse(String courseName, double credit, String departmentId) {

    }

    /**
     * This method finds a student by his id
     * @param studentId
     * @return
     */
    public Student findStudent(String studentId) {
        return null;
    }

    /**
     * This method finds a teacher by his id
     * @param teacherId
     * @return
     */
    public Teacher findTeacher(String teacherId) {
        return null;
    }

    /**
     * This method finds a department by its id
     * @param departmentId
     * @return
     */
    public Department findDepartment(String departmentId) {
        return null;
    }

    /**
     * This method finds a course by its id
     * @param courseId
     * @return
     */
    public Course findCourse(String courseId) {
        return null;
    }

    /**
     * This method modifies the course of a teacher
     * @param teacherId
     * @param courseId
     */
    public void modifyCourseTeacher(String teacherId, String courseId) {

    }

    /**
     * This method registers a student to a course
     * @param studentId
     * @param courseId
     */
    public void registerCourse(String studentId, String courseId) {

    }
}

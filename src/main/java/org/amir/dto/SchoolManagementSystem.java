package org.amir.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Setter
@Getter

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

    private int departmentCallCount = 0;
    private int studentCallCount = 0;
    private int teacherCallCount = 0;
    private int courseCallCount = 0;

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
        for (int i = 0; i < studentCallCount; i++) {
            System.out.println(students[i].getSummery());
        }
    }

    /**
     * This method prints the teachers
     */
    public void printTeachers() {
        for (int i = 0; i < teacherCallCount; i++) {
            System.out.println(teachers[i].getSummery());
        }
    }

    /**
     * This method prints the departments
     */
    public void printDepartments() {
        for (int i = 0; i < departmentCallCount; i++) {
            System.out.println(departments[i]);
        }
    }

    /**
     * This method prints the courses
     */
    public void printCourses() {
        for (int i = 0; i < courseCallCount; i++) {
            System.out.println(courses[i].getSummery());
        }
    }

    /**
     * This method adds a student
     * @param fname
     * @param lname
     * @param departmentId
     */
    public void addStudent(String fname, String lname, String departmentId) {
        if (studentCallCount < MAX_STUDENT_NUM) {
            students[studentCallCount] = new Student(fname, lname, findDepartment(departmentId));
            System.out.println(students[studentCallCount].getSummery() + " added successfully.");
            studentCallCount++;
        }
        else {
            System.out.println("Max student reached, add a new student failed.");
        }
    }

    /**
     * This method adds a teacher
     * @param fname
     * @param lname
     * @param departmentId
     */
    public void addTeacher(String fname, String lname, String departmentId) {
        if (teacherCallCount < MAX_TEACHERS_NUM) {
            teachers[teacherCallCount] = new Teacher(fname, lname, findDepartment(departmentId));
            System.out.println(teachers[teacherCallCount].getSummery() + " added successfully.");
            teacherCallCount++;
        }
        else {
            System.out.println("Max teacher reached, add a new teacher failed.");
        }
    }

    /**
     * This method adds a department
     * @param name
     */
    public void addDepartment(String name) {
        if (departmentCallCount < MAX_DEPARTMENTS_NUM) {
            departments[departmentCallCount] = new Department(name);
            System.out.println("Add department " + departments[departmentCallCount] + " successfully.");
            departmentCallCount++;
        }
        else {
            System.out.println("Max department reached, add a new department failed.");
        }
    }

    /**
     * This method adds a course
     * @param courseName
     * @param credit
     * @param departmentId
     */
    public void addCourse(String courseName, double credit, String departmentId) {
        if (courseCallCount < MAX_COURSES_NUM) {
            courses[courseCallCount] = new Course(courseName, credit, findDepartment(departmentId));
            System.out.println(courses[courseCallCount].getSummery() + " added successfully.");
            courseCallCount++;
        }
        else {
            System.out.println("Max course reached, add a new course failed.");
        }
    }

    /**
     * This method finds a student by his id
     * @param studentId
     * @return
     */

    public Student findStudent(String studentId) {
        for (int i = 0; i < studentCallCount; i++) {
            if (students[i].getId().equals(studentId)) {
                return students[i];
            }
        }
        return null;
    }

    /**
     * This method finds a teacher by his id
     * @param teacherId
     * @return
     */

    public Teacher findTeacher(String teacherId) {
        for (int i = 0; i < teacherCallCount; i++) {
            if (teachers[i].getId().equals(teacherId)) {
                return teachers[i];
            }
        }
        return null;
    }

    /**
     * This method finds a department by its id
     * @param departmentId
     * @return
     */
    public Department findDepartment(String departmentId) {
        for (int i = 0; i < departmentCallCount; i++) {
            if (departments[i].getId().equals(departmentId)) {
                return departments[i];
            }
        }
        return null;
    }

    /**
     * This method finds a course by its id
     * @param courseId
     * @return
     */
    public Course findCourse(String courseId) {
        for (int i = 0; i < courseCallCount; i++) {
            if (courses[i].getId().equals(courseId)) {
                return courses[i];
            }
        }
        return null;
    }

    /**
     * This method modifies the course of a teacher
     * @param teacherId
     * @param courseId
     */
    public void modifyCourseTeacher(String teacherId, String courseId) {
        if (findCourse(courseId) == null) {
            System.out.println("Cannot find any course match with courseId " + courseId + ", modify teacher for course " + courseId + " failed.");
        }

        else if (findTeacher(teacherId) == null) {
            System.out.println("Cannot find any teacher match with teacherId " + teacherId + ", modify teacher for course " + courseId + " failed.");
        }

        else {
            findCourse(courseId).setTeacher(findTeacher(teacherId));
            int indexTracker = Integer.parseInt(courseId.substring(courseId.length()-1));
            System.out.println((courses[indexTracker - 1]).getSummery() + " info updated successfully.");
            indexTracker = 0;
        }
    }

    /**
     * This method registers a student to a course unless the studentId or courseId are null, the student has to many courses,
     * the course has to many students or the student isn't already registered to the course he wants to register to
     * @param studentId
     * @param courseId
     */
    public void registerCourse(String studentId, String courseId) {
        if (findStudent(studentId) == null) {
            System.out.println("Cannot find any student match with studentId " + studentId + ", register course for student " + studentId + " failed.");
            return;

        }
        else if (findCourse(courseId) == null) {
            System.out.println("Cannot find any student match with courseId " + courseId + ", register course for student " + courseId + " failed.");
            return;
        }

        if (findStudent(studentId).getCourseNum() >= 5) {
            System.out.println("Student " + studentId + " has already registered 5 courses, register course for student " + studentId + " failed.");
            return;
        }

        else if (findCourse(courseId).getStudentNum() >= 5) {
            System.out.println("Course " + courseId + " has been fully registered, register course " + courseId + " for student " + studentId + " failed.");
            return;
        }

        for (int i = 0; i < findStudent(studentId).getCourses().length; i++) {
            if (findStudent(studentId).getCourses()[i] != null) {
                if (findStudent(studentId).getCourses()[i].getId().equals(findCourse(courseId).getId())) {
                    System.out.println("Student " + studentId + " has already registered Course " + courseId + ", register course " + courseId + " for student " + studentId + " failed.");
                    return;
                }
            }
        }

        Student [] students = findCourse(courseId).getStudents();
        Course [] courses = findStudent(studentId).getCourses();

        int studentCounter = findStudent(studentId).getCourseNum();
        int courseCounter = findCourse(courseId).getStudentNum();

        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = findStudent(studentId);
                courseCounter++;
                findCourse(courseId).setStudentNum(courseCounter);
                break;
            }
        }

        for (int i = 0; i < courses.length; i++) {
            if (courses[i] == null) {
                courses[i] = findCourse(courseId);
                studentCounter++;
                findStudent(studentId).setCourseNum(studentCounter);
                break;
            }
        }
        findCourse(courseId).setStudents(students);
        findStudent(studentId).setCourses(courses);
        System.out.println("Latest student info: " + findStudent(studentId).getSummery());
        System.out.println("Latest course info: " + findCourse(courseId).getSummery());
        }

    /**
     * This method outputs a string concised version of any array
     * @param array
     * @return arrayString + "]"
     */
    public static String arrayToString(Object [] array) {
        String arrayString = "[";

        for (Object c : array) {
            if (c != null) {
                arrayString += c + ", " ;
            }
        }
        return arrayString + "]";
    }
}
package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    StudentList studentList;
    @BeforeEach
    void init() {
        studentList = new StudentList();
    }

    @Test
    void addNewStudent() {

        Student s;
        studentList.addNewStudent("6712345678", "Max");
        assertEquals(1, studentList.getStudents().size());
        studentList.addNewStudent("6723232323", "Satan");
        assertEquals(2, studentList.getStudents().size());

    }
    @Test
    void findStudentById() {
        Student s;
        studentList.addNewStudent("6712345678", "Max");
        s = studentList.findStudentById("6712345678");
        assertEquals("Max", s.getName());
    }
    @Test
    void filterByName() {

        studentList.addNewStudent("67xxxxxx88", "Tiffiny");
        studentList.addNewStudent("67xxxxxx99", "Tiffiny");
        studentList.addNewStudent("67xxxxxx77", "Tiffiny");
        studentList.addNewStudent("67xxxxxx44", "Tiffiny");

        assertEquals(4, studentList.filterByName("Tiffiny").getStudents().size());
    }
    @Test
    void giveScoreToId() {
        Student s;
        studentList.addNewStudent("6712345678", "Max");
        s = studentList.findStudentById("6712345678");
        assertEquals(0, s.getScore());
        studentList.giveScoreToId("6712345678", 69.69);
        assertEquals(69.69, s.getScore());
    }
    @Test
    void viewGradeOfId() {
        Student s;
        studentList.addNewStudent("6712345678", "Max");
        studentList.giveScoreToId("6712345678", 90);
        assertEquals("A", studentList.viewGradeOfId("6712345678"));
    }
}
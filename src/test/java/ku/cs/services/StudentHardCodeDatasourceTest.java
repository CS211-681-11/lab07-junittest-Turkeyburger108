package ku.cs.services;

import ku.cs.models.Student;
import ku.cs.models.StudentList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentHardCodeDatasourceTest {

    StudentHardCodeDatasource hardcodeDatasource;
    @BeforeEach
    void init() {
        hardcodeDatasource = new StudentHardCodeDatasource();
    }



    @Test
    void readData() {
        StudentList studentList = hardcodeDatasource.readData();

        Student student = studentList.findStudentById("6710400001");
        assertEquals("First", student.getName());
        student = studentList.findStudentById("6710400002");
        assertEquals("Second", student.getName());
        student = studentList.findStudentById("6710400003");
        assertEquals("Third", student.getName());
        student = studentList.findStudentById("6710400004");
        assertEquals("Fourth", student.getName());
        assertNotEquals(null, studentList);
        assertEquals(4, studentList.getStudents().size());

    }
}
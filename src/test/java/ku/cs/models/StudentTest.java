package ku.cs.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student student;
    @BeforeEach
    void init() {
        student = new Student("6710404846", "Terk");
    }

    @Test
    void changeName() {
        student.changeName("Somporn");
        assertEquals("Somporn", student.getName());
    }

    @Test
    @DisplayName("Test AddScore method")
    void addScore() {
        student.addScore(40.0);
        assertEquals(40.0, student.getScore());

        // Negative values.
        student.addScore(-20.0);
        assertEquals(40.0, student.getScore());
    }

    @Test
    void grade() {
        student.addScore(90);
        assertEquals("A", student.grade());
    }

    @Test
    void isId() {
        assertFalse(student.isId("67xxxxxxxx"));
        assertTrue(student.isId("6710404846"));
    }

    @Test
    void isNameContains() {
        assertTrue(student.isNameContains("T"));
        assertFalse(student.isNameContains("F"));
    }


}
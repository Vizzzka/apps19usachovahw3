package ua.edu.ucu;

import org.junit.Test;
import static org.junit.Assert.*;


public class StudentTest {
    @Test
    public void testEquals(){
        Student student1 = new Student("Andriy", "Ugera", 0.1488, 3);
        Student student2 = new Student("Marian", "Dubei", 4.0, 2);
        Student student3 = new Student("Andriy", "Ugera", 3.22, 1);

        boolean resultEq = student1.equals(student3), resultNotEq = student1.equals(student2);

        assertTrue(resultEq);
        assertFalse(resultNotEq);
    }

    @Test
    public void testToString(){
        Student student = new Student("Andriy", "Ugera", 0.1488, 3);
        String result = student.toString();

        assertEquals("Student{name=Andriy, surname=Ugera, GPA=0.1488, year=3}", result);
    }

}

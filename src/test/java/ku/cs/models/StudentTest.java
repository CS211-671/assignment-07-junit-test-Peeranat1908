package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 40.5 คะแนน")
    void testAddScore(){
        Student s1 = new Student("6610450323", "frame");
        assertEquals(0, s1.getScore());
        s1.addScore(40.5);
        assertEquals(40.5, s1.getScore());
    }

    @Test
    @DisplayName("ทดสอบการเพิ่ม score 60.8 คะแนน และให้ object คำนวณเกรดออกมา")
    void testCalculateGrade(){
        Student s1 = new Student("6610450323", "frame");
        s1.addScore(60.8);
        assertEquals("C", s1.grade());
    }
    @Test
    @DisplayName("Is Id")
    void testIdId(){
        Student s1 = new Student("6610450323", "frame");
        assertTrue(s1.isId("6610450323"));
    }
}

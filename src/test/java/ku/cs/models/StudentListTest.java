package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    @Test
    @DisplayName("ทดสอบการเพิ่ม student")
    void testAddStudent(){
        StudentList s1 = new StudentList();
        s1.addNewStudent("6610450323", "frame");
        assertEquals(1, s1.getStudents().size());

    }
    @Test
    @DisplayName("ทดสอบการหาstudent ด้วย รหัส")
    void testFindStudentById(){
        StudentList s1 = new StudentList();
        Student newStudent = new Student("6610450323", "frame");
        s1.addNewStudent("6610450323", "frame");

        Student foundStudent = s1.findStudentById("6610450323");
        assertEquals("frame", foundStudent.getName());

    }
    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนนไปid")
    void testGiveScoreToId(){
        StudentList s1 = new StudentList();
        s1.giveScoreToId("6610450323", 50.4);
        Student newStudent = new Student("6610450323", "frame", 50.4);
        assertEquals("6610450323", newStudent.getId());

    }
}
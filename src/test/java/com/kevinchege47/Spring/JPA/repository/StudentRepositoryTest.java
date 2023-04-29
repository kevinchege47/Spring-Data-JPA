package com.kevinchege47.Spring.JPA.repository;

import com.kevinchege47.Spring.JPA.entity.Guardian;
import com.kevinchege47.Spring.JPA.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;
    @Test
    public void saveStudent(){
        Student student = Student.builder()
                .firstName("Kevin")
                .lastName("47")
                .emailId("Kevin@gmail.com")
//                .guardianName("Marcs")
//                .guardianEmail("Marcs@gmail.com")
//                .guardianMobile("9999999999")
                .build();
        studentRepository.save(student);
    }
    @Test
    public void printAllStudents(){
        List<Student> studentList = studentRepository.findAll();
        System.out.println(studentList);
    }
    @Test
    public void saveStudentWithGuardian(){
        Guardian guardian = Guardian.builder()
                .email("guardian@gmail.com")
                .mobile("555555555")
                .name("Ze Guardian")
                .build();

        Student student = Student.builder()
                .firstName("Kip")
                .emailId("kip@gmail.com")
                .lastName("Kib")
                .guardian(guardian)
                .build();
        studentRepository.save(student);
    }
    @Test
    public void printStudentByFirstName(){
        List<Student> students = studentRepository.findByFirstName("Kevin");
        System.out.println(students);
    }
    @Test
    public void findByFirstNameContaining(){
        List<Student> students = studentRepository.findByFirstNameContaining("K");
        System.out.println(students);
    }
    @Test
    public void printStudentBasedOnGuardianName(){
        List<Student> students = studentRepository.findByGuardianName("Marcs");
        System.out.println(students);
    }
    @Test
    public void printGetStudentByEmailAddress(){
      String firstName = studentRepository.getStudentFirstNameByEmailAddress("Kevin@gmail.com");
        System.out.println(firstName);
    }
    @Test
    public void printGetStudentByEmailAddressNative(){
        Student student = studentRepository.getStudentByEmailAddressNativeNamedParam("Kevin@gmail.com");
        System.out.println("student = " + student);
    }
    @Test
    public void updateStudentNameByEmailId(){
        studentRepository.updateStudentNameByEmailId("Marccur","Kevin@gmail.com");
    }
}
package com.kevinchege47.Spring.JPA.repository;

import com.kevinchege47.Spring.JPA.entity.Course;
import com.kevinchege47.Spring.JPA.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class TeacherRepositoryTest {
    @Autowired
    private TeacherRepository teacherRepository;
    @Test
    public void saveTeacher(){
        Course courseCT = Course.builder()
                .title("DBA")
                .credit(5)
                .build();
        Course courseCN = Course.builder()
                .title("DBA")
                .credit(5)
                .build();
        Teacher teacher = Teacher.builder()
                .firstName("Were")
                .lastName("Hannah")
                .courses(List.of(courseCT,courseCN))
                .build();
        teacherRepository.save(teacher);
    }



}
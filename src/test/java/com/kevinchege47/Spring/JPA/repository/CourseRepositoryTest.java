package com.kevinchege47.Spring.JPA.repository;
import com.kevinchege47.Spring.JPA.entity.Course;
import com.kevinchege47.Spring.JPA.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CourseRepositoryTest {
    @Autowired
    private CourseRepository courseRepository;
    @Test
    public void getCourses(){
        List<Course> courseList = courseRepository.findAll();
        System.out.println("courseList = " + courseList);
    }
    @Test
    public void saveCourseWithTeacher(){
        Teacher teacher = Teacher.builder()
                .firstName("Amigo")
                .lastName("G")
                .build();
        Course course = Course.builder()
                .title("Terafom")
                .credit(2)
                .teacher(teacher)
                .build();
        courseRepository.save(course);
    }

}
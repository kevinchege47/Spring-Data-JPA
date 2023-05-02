package com.kevinchege47.Spring.JPA.repository;

import com.kevinchege47.Spring.JPA.entity.Course;
import com.kevinchege47.Spring.JPA.entity.Student;
import com.kevinchege47.Spring.JPA.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

@SpringBootTest
class CourseRepositoryTest {
    @Autowired
    private CourseRepository courseRepository;

    @Test
    public void getCourses() {
        List<Course> courseList = courseRepository.findAll();
        System.out.println("courseList = " + courseList);
    }

    @Test
    public void saveCourseWithTeacher() {
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

    @Test
    public void findAllPagination() {
        Pageable firstPagewithThreeRecords = PageRequest.of(0,3);
        Pageable secondPageWithTwoRecords = PageRequest.of(1,2);
        List<Course> courses = courseRepository.findAll(firstPagewithThreeRecords).getContent();
        long totalElements = courseRepository.findAll(firstPagewithThreeRecords).getTotalElements();
        long totalPages = courseRepository.findAll(firstPagewithThreeRecords).getTotalPages();

    }
    @Test
    public void saveCourseWithStudentAndTeacher(){
        Student student = Student.builder()
                .firstName("John")
                .lastName("Doe")
                .emailId("ggg@gmail.com")
                .build();
        Teacher teacher = Teacher.builder()
                .firstName("Mary")
                .lastName("Jane")
                .build();
        Course course = Course.builder()
                .title("AI")
                .credit(12)
                .teacher(teacher)
                .build();
        course.addStudents(student);
        courseRepository.save(course);
    }

}
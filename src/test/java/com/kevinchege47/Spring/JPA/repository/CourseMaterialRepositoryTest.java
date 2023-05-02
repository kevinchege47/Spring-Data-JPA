package com.kevinchege47.Spring.JPA.repository;

import com.kevinchege47.Spring.JPA.entity.Course;
import com.kevinchege47.Spring.JPA.entity.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseMaterialRepositoryTest {
    @Autowired
    private CourseMaterialRepository courseMaterialRepository;

    @Test
    public void saveCourseMaterial() {
        Course course = Course.builder()
                .title("Analog Electronics")
                .credit(6)
                .build();
        CourseMaterial courseMaterial = CourseMaterial.builder()
                .url("www.youtube.com")
//                .course(course)
                .title("V1.0")
                .build();
        courseMaterialRepository.save(courseMaterial);
    }
    @Test
    public void printAllCoursesMaterials(){
        List<CourseMaterial> courseMaterialList = courseMaterialRepository.findAll();
        System.out.println(courseMaterialList);
    }
}
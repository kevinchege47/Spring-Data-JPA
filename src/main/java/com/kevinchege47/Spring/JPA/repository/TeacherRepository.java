package com.kevinchege47.Spring.JPA.repository;
import com.kevinchege47.Spring.JPA.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Long> {

}

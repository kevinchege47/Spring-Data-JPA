package com.kevinchege47.Spring.JPA.repository;

import com.kevinchege47.Spring.JPA.entity.CourseMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseMaterialRepository extends JpaRepository<CourseMaterial,Long>{

}



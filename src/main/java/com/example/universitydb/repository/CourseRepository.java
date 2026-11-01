package com.example.universitydb.repository;

import com.example.universitydb.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CourseRepository extends JpaRepository<Course, Long>{

    Optional<Course> FindByCode(String code);

    List<Course> findByGreaterThanEqual(Integer credits);
    List<Course> findByTitleContainingIgnoreCase(String text);
    List<Course> findByLecturer_Name(String lecturerName);
    List<Course> findByLecturer_department(String departmentName);
}

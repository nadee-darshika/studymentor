package com.studymentor.studymentor.repository;

import com.studymentor.studymentor.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {
}

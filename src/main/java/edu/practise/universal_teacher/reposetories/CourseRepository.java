package edu.practise.universal_teacher.reposetories;

import edu.practise.universal_teacher.entities.study.Course;
import edu.practise.universal_teacher.entities.study.CourseProfileRelation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course,String>{
    List<Course> getCoursesByRelations(CourseProfileRelation relation);
}

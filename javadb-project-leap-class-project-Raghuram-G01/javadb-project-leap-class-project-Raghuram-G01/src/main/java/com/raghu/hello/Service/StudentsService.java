// package com.raghu.hello.Service;

// import org.springframework.stereotype.Service;
// import com.raghu.hello.entity.Course;
// import com.raghu.hello.entity.Students;
// import com.raghu.hello.repository.CourseRepository;
// import com.raghu.hello.repository.StudentsRepository;

// @Service
// public class StudentsService {
    
//     private final StudentsRepository studentsRepository;
//     private final CourseRepository courseRepository;

//     public StudentsService(StudentsRepository studentsRepository, CourseRepository courseRepository) {
//         this.studentsRepository = studentsRepository;
//         this.courseRepository = courseRepository;
//     }
//     public Students enrollStudentInCourse(Long studentId, String courseTitle) {
//         Students student = studentsRepository.findById(studentId)
//                 .orElseThrow(() -> new RuntimeException("Student not found with id " + studentId));
//         Course course = courseRepository.findByTitleIgnoreCase(courseTitle)
//                 .orElseThrow(() -> new RuntimeException("Course not found with title " + courseTitle));
//         student.getCourses().add(course);
//         course.getStudents().add(student);
//         studentsRepository.save(student);
//         courseRepository.save(course);
//         return student;
//     }
            

// }

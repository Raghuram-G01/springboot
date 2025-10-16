package service;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.raghu.hello.Service.StudentsService;
import com.raghu.hello.entity.Course;
import com.raghu.hello.entity.Students;
import com.raghu.hello.repository.CourseRepository;
import com.raghu.hello.repository.StudentsRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
class StudentsServiceTest {

    @Mock
    private StudentsRepository studentsRepository;

    @Mock
    private CourseRepository courseRepository;

    @InjectMocks
    private StudentsService studentsService;

    @Test
    void enrollStudentInCourse_Success() {
        // Arrange
        Students student = new Students("Raghuram");
        student.setId(1L);

        Course course = new Course("Java");
        course.setId(1L);

        when(studentsRepository.findById(1L)).thenReturn(Optional.of(student));
        when(courseRepository.findByTitleIgnoreCase("Java")).thenReturn(Optional.of(course));
        when(studentsRepository.save(any(Students.class))).thenReturn(student);
        when(courseRepository.save(any(Course.class))).thenReturn(course);

        // Act
        Students enrolledStudent = studentsService.enrollStudentInCourse(1L, "Java");

        // Assert
        assertEquals(true, enrolledStudent.getCourses().contains(course));
        assertEquals(true, course.getStudents().contains(student));

        verify(studentsRepository).save(student);
        verify(courseRepository).save(course);
    }

    @Test
    void testEnrollStudentInCourse_StudentNotFound() {
        // Arrange
        when(studentsRepository.findById(1L)).thenReturn(Optional.empty());

        // Act & Assert
        RuntimeException exception = assertThrows(RuntimeException.class, () ->
            studentsService.enrollStudentInCourse(1L, "Java")
        );

        assertEquals("Student not found with id 1", exception.getMessage());
    }

    @Test
    void testEnrollStudentInCourse_CourseNotFound() {
        // Arrange
        Students student = new Students("Raghuram");
        student.setId(1L);
        when(studentsRepository.findById(1L)).thenReturn(Optional.of(student));
        when(courseRepository.findByTitleIgnoreCase("Java")).thenReturn(Optional.empty());

        // Act & Assert
        RuntimeException exception = assertThrows(RuntimeException.class, () ->
            studentsService.enrollStudentInCourse(1L, "Java")
        );

        assertEquals("Course not found", exception.getMessage());
    }
}

package com.raghu.hello.Service;

import org.springframework.stereotype.Service;
import com.raghu.hello.entity.Student;
import com.raghu.hello.repository.StudentRepository;
import java.util.List;
import java.util.Optional;
// @Service
// public class StudentService {
//     private static StudentRepository studentRepository = null;

//     // !Constructor injection
//     public StudentService(StudentRepository studentRepository) {
//         StudentService.studentRepository = studentRepository;
//     }

//     //! create
//     public Student saveStudent(Student student) {
//         return studentRepository.save(student);
//     }
//     //! read
//     public List<Student> getAllStudents() {
//         return studentRepository.findAll();
//     }

//     public Optional<Student> getStudentById(Long id) {
//         return studentRepository.findById(id);
//     }
//     public List<Student> getStudentByName(String name) {
//         return studentRepository.findByNameContainingIgnoreCase(name);
//     }
//     //! Update
//     public static String updateStudent(Long id, String updatedStudent2) {
//         return studentRepository.findById(id)
//                 .map(existingStudent -> {
//                     Student updatedStudent = updatedStudent2;
//                     existingStudent.setName(updatedStudent.getName());
//                     existingStudent.setAge(updatedStudent.getAge());
//                     existingStudent.setEmail(updatedStudent.getEmail());
//                     return studentRepository.save(existingStudent);
//                 })
//                 .orElseThrow(() -> new RuntimeException("Student not found with id " + id));
//     }
//     //! Partial Update
//     public static Student partialUpdateStudent(Long id, Student student2) {
//         return studentRepository.findById(id)
//                 .map(student -> {
//                     if (student2.getName() != null) {
//                         student.setName(student2.getName());
//                     }
//                     if (student2.getAge() != 0) {
//                         student.setAge(student2.getAge());
//                     }
//                     if (student2.getEmail() != null) {
//                         student.setEmail(student2.getEmail());
//                     }
//                     return studentRepository.save(student);
//                 })
//                 .orElseThrow(() -> new RuntimeException("Student not found with id " + id));
//     }
//     //!DELETE
//     public boolean deleteStudent(Long id) {
//         if (studentRepository.existsById(id)) {
//             studentRepository.deleteById(id);
//             return true;
//         } else {
//             return false;
//         }
//     }
// }

@Service
public class StudentService {
    private static StudentRepository studentRepository;
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    // Service methods to handle business logic will go here
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    public List<Student> getStudentsByName(String name) {
        // Assuming a method exists in the repository to find by name
        return studentRepository.findByName(name);
    }

    public static Student updateStudent(Long id, Student updatedStudent) {
        return studentRepository.findById(id)
                .map(student -> {
                    student.setName(updatedStudent.getName());
                    student.setEmail(updatedStudent.getEmail());
                    student.setAge(updatedStudent.getAge());
                    return studentRepository.save(student);
                })
                .orElseThrow(() -> new RuntimeException("Student not found with id " + id));
    }
    
    public Student partialUpdateStudent(Long id, Student updatedFields) {
        return studentRepository.findById(id)
                .map(student -> {
                    if (updatedFields.getName() != null) {
                        student.setName(updatedFields.getName());
                    }
                    if (updatedFields.getEmail() != null) {
                        student.setEmail(updatedFields.getEmail());
                    }
                    if (updatedFields.getAge() != 0) {
                        student.setAge(updatedFields.getAge());
                    }
                    return studentRepository.save(student);
                })
                .orElseThrow(() -> new RuntimeException("Student not found with id " + id));
    }

    public boolean deleteStudent(Long id) {
        if (studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
            return true;
        }
        return false;
    }
    public Student PartialUpdateStudent(Long id, Student student) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'PartialUpdateStudent'");
    }

}

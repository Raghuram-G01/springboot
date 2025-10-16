package com.raghu.hello.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.raghu.hello.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    //!you can define custom query methods here if needed
    List<Student> findByName(String name);
    List<Student> findByNameContainingIgnoreCase(String name);

}

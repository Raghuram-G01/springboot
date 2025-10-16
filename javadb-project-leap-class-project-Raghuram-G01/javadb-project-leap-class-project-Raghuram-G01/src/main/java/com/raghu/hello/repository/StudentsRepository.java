package com.raghu.hello.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.raghu.hello.entity.Students;

@Repository
public interface StudentsRepository extends JpaRepository<Students, Long> {

}
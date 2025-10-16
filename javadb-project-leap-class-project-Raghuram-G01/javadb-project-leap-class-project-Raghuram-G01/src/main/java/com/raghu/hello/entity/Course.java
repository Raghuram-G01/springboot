// package com.raghu.hello.entity;

// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.ManyToMany;

// import java.util.ArrayList;
// import java.util.List;

// @Entity
// public class Course {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;
    
//     private String title;

//     //Bidirectional many to many mapping
//     @ManyToMany(mappedBy = "courses")
//     private List<Students> students=new ArrayList<>();
//     public Course() {}
//     public Course(String title) {
//         this.title = title;
//     }
//     //Getters & Setters
//     public Long getId() {
//         return id;
//     }
//     public void setId(Long id) {
//         this.id = id;
//     }
//     public String getTitle() {
//         return title;
//     }
//     public void setTitle(String title) {
//         this.title = title;
//     }
//     public List<Students> getStudents() {
//         return students;
//     }
//     public void setStudents(List<Students> students) {
//         this.students = students;
//     }
    
// }

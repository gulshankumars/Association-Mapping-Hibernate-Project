package com.sunglowsys.repository;

import com.sunglowsys.domain.Student;

import java.util.List;

public interface StudentRepository {

    Student save(Student student);
    List<Student> findAll();
    Student findById(Long id);
    Student delete(Long id);
    Student update(Student student,Long id);
}

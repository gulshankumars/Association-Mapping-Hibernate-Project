package com.sunglowsys.sevice;

import com.sunglowsys.domain.Student;
import com.sunglowsys.repository.StudentRepository;
import com.sunglowsys.repository.StudentRepositoryImpl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class StudentServiceImpl implements StudentService{
    private StudentRepository studentRepository = new StudentRepositoryImpl();

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public Student delete(Long id) {
        return studentRepository.delete(id);
    }

    @Override
    public Student update(Student student, Long id) {
        return studentRepository.update(student,id);
    }
}

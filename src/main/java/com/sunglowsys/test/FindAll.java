package com.sunglowsys.test;

import com.sunglowsys.domain.Student;
import com.sunglowsys.sevice.StudentServiceImpl;

import java.util.List;

public class FindAll {
    public static void main(String[] args) {
        List<Student>studentList = new StudentServiceImpl().findAll();
        for (Student student : studentList){
            System.out.println(student);
        }
    }
}

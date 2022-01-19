package com.sunglowsys.test;

import com.sunglowsys.domain.Student;
import com.sunglowsys.sevice.StudentServiceImpl;

public class FindById {
    public static void main(String[] args) {
        Student student = new StudentServiceImpl().findById(3L);
        System.out.println(student);
    }
}

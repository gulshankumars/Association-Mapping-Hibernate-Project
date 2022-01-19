package com.sunglowsys.test;

import com.sunglowsys.domain.Student;
import com.sunglowsys.sevice.StudentServiceImpl;

public class Update {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFirstName("Dinesh");
        new StudentServiceImpl().update(student,4L);
    }
}

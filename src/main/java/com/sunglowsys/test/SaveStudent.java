package com.sunglowsys.test;

import com.sunglowsys.domain.Address;
import com.sunglowsys.domain.Student;
import com.sunglowsys.sevice.StudentService;
import com.sunglowsys.sevice.StudentServiceImpl;

public class SaveStudent {
    public static void main(String[] args) {
        Address address = new Address("nagla","daru","pachon","hathras","uttar pradesh","207123");
        Student student = new Student("Anil","Ghuraiya","anil@gmail.com","9981100882","male",address);
        StudentService studentService = new StudentServiceImpl();
        studentService.save(student);
    }
}

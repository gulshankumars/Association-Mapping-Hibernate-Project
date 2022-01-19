package com.sunglowsys.test;

import com.sunglowsys.sevice.StudentServiceImpl;

public class DeleteById {
     public static void main(String[] args) {
        new StudentServiceImpl().delete(1L);
    }
}

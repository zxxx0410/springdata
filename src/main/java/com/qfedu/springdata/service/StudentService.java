package com.qfedu.springdata.service;

import com.qfedu.springdata.pojo.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {
    Student save(Student stu);
    List<Student> findAll();
}

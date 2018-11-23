package com.qfedu.springdata.StudentServiceImpl;


import com.qfedu.springdata.dao.StudentDao;
import com.qfedu.springdata.pojo.Student;
import com.qfedu.springdata.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    @Override
    public Student save(Student stu) {
        return studentDao.save(stu);
    }

    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }
}

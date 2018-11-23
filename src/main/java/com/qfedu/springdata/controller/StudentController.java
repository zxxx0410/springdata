package com.qfedu.springdata.controller;


import com.qfedu.springdata.pojo.Student;
import com.qfedu.springdata.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping("/studentAdd")
    @ResponseBody
    public String save(Student stu){
        if(studentService.save(stu) != null){
            return"添加成功";
        } else {
            return"添加失败";
        }
    }
    @RequestMapping("/studentAll")
    @ResponseBody
    public List<Student> find(){
            return studentService.findAll();
        }
}



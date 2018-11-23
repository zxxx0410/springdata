package com.qfedu.springdata.dao;

import com.qfedu.springdata.pojo.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentDao extends JpaRepository<Student,Integer>{
    @Query(value = "from Student")
    List<Student> dataAll1();

    @Query(value = "select * from t_work",nativeQuery = true)
    List<Student> dataAll2();

    Student getByName(String name);
}

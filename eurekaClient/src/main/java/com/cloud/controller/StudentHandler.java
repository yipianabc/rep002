package com.cloud.controller;

import com.cloud.dao.StudentDao;
import com.cloud.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/student")
public class StudentHandler {
    @Autowired
    private StudentDao studentDao;

    @RequestMapping("/findAll")
    public Collection<Student> findAll() {
        return studentDao.findAll();
    }

    @RequestMapping("getById/{id}")
    public Student findById(@PathVariable("id") long id) {
        return studentDao.findById(id);     //传id的时候用PathVariable("id")
    }

    @RequestMapping("updateOrInsert")
    public void updateOrInsert(@RequestBody Student student) {
        studentDao.saveOrUpdate(student);   //传实体的时候用@RequestBody
    }

    @RequestMapping("delete/{id}")
    public void delete(@PathVariable("id") long id) {
        studentDao.deleteById(id);
    }
}

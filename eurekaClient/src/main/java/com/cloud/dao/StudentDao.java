package com.cloud.dao;

import com.cloud.entity.Student;

import java.util.Collection;

public interface StudentDao {
    public Collection<Student> findAll();
    public Student findById(long id);
    public void saveOrUpdate(Student student);
    public void deleteById(long id);
}

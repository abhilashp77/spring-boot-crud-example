package com.a1.springbootcrud.service;

import com.a1.springbootcrud.dao.Dao;
import com.a1.springbootcrud.model.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CrudService {

    @Autowired
    private Dao dao;

    public Student getStudent(int id) {
        return dao.getStudent(id);
    }

    public void addOrUpdateStudent(Student student) {
        dao.addOrUpdateStudent(student);
    }

    public void removeStudent(int id) {
        dao.removeStudent(id);
    }
}

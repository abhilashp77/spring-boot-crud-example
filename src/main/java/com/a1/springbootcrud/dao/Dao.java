package com.a1.springbootcrud.dao;

import com.a1.springbootcrud.model.Student;
import com.a1.springbootcrud.repo.CrudRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dao {

    @Autowired
    CrudRepo repo;

    public Student getStudent(int id) {
        return repo.findById(id).get();
    }

    public void addOrUpdateStudent(Student student) {
        repo.save(student);
    }

    public void removeStudent(int id) {
        repo.deleteById(id);
    }
}

package com.a1.springbootcrud.controller;

import com.a1.springbootcrud.model.Student;
import com.a1.springbootcrud.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class Controller {

    @Autowired
    private CrudService service;

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable int id) {
        return service.getStudent(id);
    }

    @PostMapping("/add")
    public void addStudent(@RequestBody Student student){
        service.addOrUpdateStudent(student);
    }

    @PutMapping("/update")
    public void updateStudent(@RequestBody Student student) {
        service.addOrUpdateStudent(student);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable int id) {
        service.removeStudent(id);
    }
}

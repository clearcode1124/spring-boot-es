package com.wade.esdemo.web;

import com.wade.esdemo.entity.Student;
import com.wade.esdemo.repository.StudentRepository;
import org.elasticsearch.index.query.QueryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Description TODO
 * @Author CWD
 * @Date 2019-05-13 16:25
 **/
@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("")
    public Student save(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    @GetMapping("/{id}")
    public Student get(@PathVariable String id) {
        return studentRepository.findById(id).get();
    }
}

package com.wade.esdemo.repository;

import com.wade.esdemo.entity.Student;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface StudentRepository extends ElasticsearchRepository<Student,String> {
}

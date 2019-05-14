package com.wade.esdemo.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

/**
 * @Description TODO
 * @Author CWD
 * @Date 2019-05-09 15:49
 **/
@Data
@Document(indexName = "es_demo", type = "students")
public class Student implements Serializable {

    @Id
    private String id;

    private String name;
}

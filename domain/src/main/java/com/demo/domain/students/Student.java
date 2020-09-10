package com.demo.domain.students;

import com.demo.base.BaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.io.Serializable;


@Data
@Entity
public class Student extends BaseEntity<Long> implements Serializable {

    @Column(name = "name")
    private String name;

}

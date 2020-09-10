package com.demo.domain.teachers;

import com.demo.base.BaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Data
public class Teacher extends BaseEntity<Integer> implements Serializable {

    @Column(name = "name")
    private String name;

}

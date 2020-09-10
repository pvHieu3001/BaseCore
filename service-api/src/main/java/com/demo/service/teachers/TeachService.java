package com.demo.service.teachers;

import com.demo.base.BaseService;
import com.demo.domain.teachers.Teacher;
import com.demo.domain.teachers.TeacherDto;

public interface TeachService extends BaseService<Teacher, TeacherDto, Long> {

    Teacher findByName(String name);

}

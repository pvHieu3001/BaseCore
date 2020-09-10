package com.demo.api;

import com.demo.base.BaseController;
import com.demo.base.BaseService;
import com.demo.service.teachers.TeachService;
import com.demo.domain.teachers.Teacher;
import com.demo.domain.teachers.TeacherDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("teachers")
public class TeacherController extends BaseController<Teacher, TeacherDto, Long> {

    @Autowired
    private TeachService teachService;

    @Override
    public BaseService<Teacher, TeacherDto, Long> getService() {
        return teachService;
    }

}

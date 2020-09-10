package com.demo.domain.students;

import com.demo.base.IdDto;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

@Data
public class StudentDto extends IdDto {

    @NotBlank
    @Length(min = 5)
    private String name;

}
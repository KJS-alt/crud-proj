package com.kim.crud_proj.mapper;


import com.kim.crud_proj.domain.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {

    List<Student> findAll();
}
